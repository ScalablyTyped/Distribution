package typings
package stripeLib.stripeMod.usageRecordsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUsageRecord
  extends stripeLib.stripeMod.IObject {
  var id: java.lang.String
  var livemode: scala.Boolean
  @JSName("object")
  var object_IUsageRecord: stripeLib.stripeLibStrings.usage_record
  var quantity: scala.Double
  var subscription_item: java.lang.String
  var timestamp: scala.Double
}

object IUsageRecord {
  @scala.inline
  def apply(
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.usage_record,
    quantity: scala.Double,
    subscription_item: java.lang.String,
    timestamp: scala.Double
  ): IUsageRecord = {
    val __obj = js.Dynamic.literal(id = id, livemode = livemode, quantity = quantity, subscription_item = subscription_item, timestamp = timestamp)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IUsageRecord]
  }
}

