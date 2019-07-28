package typings.stripe.stripeMod.usageRecordsNs

import typings.stripe.stripeMod.IObject
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
    val __obj = js.Dynamic.literal(id = id, livemode = livemode, quantity = quantity, subscription_item = subscription_item, timestamp = timestamp)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IUsageRecord]
  }
}

