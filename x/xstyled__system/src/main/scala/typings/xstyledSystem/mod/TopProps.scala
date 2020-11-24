package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopProps[TLength] extends js.Object {
  
  val top: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ _
    ]
  ] = js.native
}
object TopProps {
  
  @scala.inline
  def apply[TLength](): TopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopProps[TLength]]
  }
  
  @scala.inline
  implicit class TopPropsOps[Self <: TopProps[_], TLength] (val x: Self with TopProps[TLength]) extends AnyVal {
    
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
    def setTopVarargs(value: js.Any*): Self = this.set("top", js.Array(value :_*))
    
    @scala.inline
    def setTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ _
        ]
    ): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
