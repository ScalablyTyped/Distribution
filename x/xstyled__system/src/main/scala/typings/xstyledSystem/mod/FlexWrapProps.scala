package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexWrapProps extends js.Object {
  
  val flexWrap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ _
    ]
  ] = js.native
}
object FlexWrapProps {
  
  @scala.inline
  def apply(): FlexWrapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexWrapProps]
  }
  
  @scala.inline
  implicit class FlexWrapPropsOps[Self <: FlexWrapProps] (val x: Self) extends AnyVal {
    
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
    def setFlexWrapVarargs(value: js.Any*): Self = this.set("flexWrap", js.Array(value :_*))
    
    @scala.inline
    def setFlexWrap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ _
        ]
    ): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
  }
}
