package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridTemplateColumnsProps[TLength] extends js.Object {
  
  val gridTemplateColumns: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLength> */ _
    ]
  ] = js.native
}
object GridTemplateColumnsProps {
  
  @scala.inline
  def apply[TLength](): GridTemplateColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateColumnsProps[TLength]]
  }
  
  @scala.inline
  implicit class GridTemplateColumnsPropsOps[Self <: GridTemplateColumnsProps[_], TLength] (val x: Self with GridTemplateColumnsProps[TLength]) extends AnyVal {
    
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
    def setGridTemplateColumnsVarargs(value: js.Any*): Self = this.set("gridTemplateColumns", js.Array(value :_*))
    
    @scala.inline
    def setGridTemplateColumns(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLength> */ _
        ]
    ): Self = this.set("gridTemplateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridTemplateColumns: Self = this.set("gridTemplateColumns", js.undefined)
  }
}
