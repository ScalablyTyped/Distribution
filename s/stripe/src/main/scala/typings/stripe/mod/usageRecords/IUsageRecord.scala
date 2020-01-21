package typings.stripe.mod.usageRecords

import typings.stripe.mod.IObject
import typings.stripe.stripeStrings.usage_record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUsageRecord extends IObject {
  var id: String
  var livemode: Boolean
  @JSName("object")
  var object_IUsageRecord: usage_record
  var quantity: Double
  var subscription_item: String
  var timestamp: Double
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
}

