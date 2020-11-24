package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxShadowProps extends js.Object {
  
  val boxShadow: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _) | Double
    ]
  ] = js.native
}
object BoxShadowProps {
  
  @scala.inline
  def apply(): BoxShadowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxShadowProps]
  }
  
  @scala.inline
  implicit class BoxShadowPropsOps[Self <: BoxShadowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoxShadowVarargs(value: (js.Any | Double)*): Self = this.set("boxShadow", js.Array(value :_*))
    
    @scala.inline
    def setBoxShadow(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _) | Double
        ]
    ): Self = this.set("boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadow: Self = this.set("boxShadow", js.undefined)
  }
}
