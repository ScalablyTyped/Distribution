package typings.stripe.mod.invoices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IItemReason extends js.Object {
  
  /**
    * The IDs of the line items that triggered the threshold invoice.
    */
  var line_item_ids: js.Array[String] = js.native
  
  /**
    * The quantity threshold boundary that applied to the given line item.
    */
  var usage_gte: Double = js.native
}
object IItemReason {
  
  @scala.inline
  def apply(line_item_ids: js.Array[String], usage_gte: Double): IItemReason = {
    val __obj = js.Dynamic.literal(line_item_ids = line_item_ids.asInstanceOf[js.Any], usage_gte = usage_gte.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemReason]
  }
  
  @scala.inline
  implicit class IItemReasonOps[Self <: IItemReason] (val x: Self) extends AnyVal {
    
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
    def setLine_item_idsVarargs(value: String*): Self = this.set("line_item_ids", js.Array(value :_*))
    
    @scala.inline
    def setLine_item_ids(value: js.Array[String]): Self = this.set("line_item_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage_gte(value: Double): Self = this.set("usage_gte", value.asInstanceOf[js.Any])
  }
}
