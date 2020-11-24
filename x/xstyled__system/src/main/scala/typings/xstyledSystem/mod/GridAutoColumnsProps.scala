package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridAutoColumnsProps[TLength] extends js.Object {
  
  val gridAutoColumns: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLength> */ _
    ]
  ] = js.native
}
object GridAutoColumnsProps {
  
  @scala.inline
  def apply[TLength](): GridAutoColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoColumnsProps[TLength]]
  }
  
  @scala.inline
  implicit class GridAutoColumnsPropsOps[Self <: GridAutoColumnsProps[_], TLength] (val x: Self with GridAutoColumnsProps[TLength]) extends AnyVal {
    
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
    def setGridAutoColumnsVarargs(value: js.Any*): Self = this.set("gridAutoColumns", js.Array(value :_*))
    
    @scala.inline
    def setGridAutoColumns(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLength> */ _
        ]
    ): Self = this.set("gridAutoColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAutoColumns: Self = this.set("gridAutoColumns", js.undefined)
  }
}
