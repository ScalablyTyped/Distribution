package typings.uiGrid.mod.treeBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridTreeBaseAggregationObject extends js.Object {
  
  var count: Double = js.native
  
  var rendered: js.UndefOr[String] = js.native
  
  var sum: Double = js.native
  
  var value: Double = js.native
}
object IGridTreeBaseAggregationObject {
  
  @scala.inline
  def apply(count: Double, sum: Double, value: Double): IGridTreeBaseAggregationObject = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridTreeBaseAggregationObject]
  }
  
  @scala.inline
  implicit class IGridTreeBaseAggregationObjectOps[Self <: IGridTreeBaseAggregationObject] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: Double): Self = this.set("sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendered(value: String): Self = this.set("rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
  }
}
