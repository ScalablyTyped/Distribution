package typings.stripe.mod.usageRecords

import typings.stripe.mod.IObject
import typings.stripe.stripeStrings.usage_record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUsageRecord extends IObject {
  
  var id: String = js.native
  
  var livemode: Boolean = js.native
  
  @JSName("object")
  var object_IUsageRecord: usage_record = js.native
  
  var quantity: Double = js.native
  
  var subscription_item: String = js.native
  
  var timestamp: Double = js.native
}
object IUsageRecord {
  
  @scala.inline
  def apply(
    id: String,
    livemode: Boolean,
    `object`: usage_record,
    quantity: Double,
    subscription_item: String,
    timestamp: Double
  ): IUsageRecord = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], subscription_item = subscription_item.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecord]
  }
  
  @scala.inline
  implicit class IUsageRecordOps[Self <: IUsageRecord] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: usage_record): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_item(value: String): Self = this.set("subscription_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
