package typings.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridTreeAggregations extends js.Object {
  
  var aggregation: String = js.native
  
  var colName: String = js.native
  
  var field: String = js.native
}
object IGridTreeAggregations {
  
  @scala.inline
  def apply(aggregation: String, colName: String, field: String): IGridTreeAggregations = {
    val __obj = js.Dynamic.literal(aggregation = aggregation.asInstanceOf[js.Any], colName = colName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridTreeAggregations]
  }
  
  @scala.inline
  implicit class IGridTreeAggregationsOps[Self <: IGridTreeAggregations] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: String): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColName(value: String): Self = this.set("colName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
  }
}
