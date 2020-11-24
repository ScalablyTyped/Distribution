package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexGrowProps extends js.Object {
  
  val flexGrow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ _
    ]
  ] = js.native
}
object FlexGrowProps {
  
  @scala.inline
  def apply(): FlexGrowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGrowProps]
  }
  
  @scala.inline
  implicit class FlexGrowPropsOps[Self <: FlexGrowProps] (val x: Self) extends AnyVal {
    
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
    def setFlexGrowVarargs(value: js.Any*): Self = this.set("flexGrow", js.Array(value :_*))
    
    @scala.inline
    def setFlexGrow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ _
        ]
    ): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
  }
}
