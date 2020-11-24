package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridAutoRowsProps[TLength] extends js.Object {
  
  val gridAutoRows: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ _
    ]
  ] = js.native
}
object GridAutoRowsProps {
  
  @scala.inline
  def apply[TLength](): GridAutoRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoRowsProps[TLength]]
  }
  
  @scala.inline
  implicit class GridAutoRowsPropsOps[Self <: GridAutoRowsProps[_], TLength] (val x: Self with GridAutoRowsProps[TLength]) extends AnyVal {
    
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
    def setGridAutoRowsVarargs(value: js.Any*): Self = this.set("gridAutoRows", js.Array(value :_*))
    
    @scala.inline
    def setGridAutoRows(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ _
        ]
    ): Self = this.set("gridAutoRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAutoRows: Self = this.set("gridAutoRows", js.undefined)
  }
}
