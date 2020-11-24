package typings.stripe.mod.usageRecords

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUsageRecordCreationOptions extends js.Object {
  
  /**
    * Valid values are increment (default) or set. When using increment the specified quantity will be added to the usage at the specified
    * timestamp. The set action will overwrite the usage quantity at that timestamp.
    */
  var action: js.UndefOr[IUsageRecordAction] = js.native
  
  /**
    * The usage quantity for the specified timestamp
    */
  var quantity: Double = js.native
  
  /**
    * The timestamp for the usage event. This timestamp must be within the current billing period of the subscription of the provided subscription_item
    */
  var timestamp: Double = js.native
}
object IUsageRecordCreationOptions {
  
  @scala.inline
  def apply(quantity: Double, timestamp: Double): IUsageRecordCreationOptions = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecordCreationOptions]
  }
  
  @scala.inline
  implicit class IUsageRecordCreationOptionsOps[Self <: IUsageRecordCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: IUsageRecordAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
  }
}
