package typings
package stripeLib.stripeMod.StripeNs.usageRecordSummariesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUsageRecordSummariesItem extends js.Object {
  var id: java.lang.String
  var invoice: java.lang.String
  var livemode: scala.Boolean
  var `object`: java.lang.String
  var period: stripeLib.stripeMod.StripeNs.invoicesNs.IPeriod
  var subscription_item: java.lang.String
  var total_usage: scala.Double
}

object IUsageRecordSummariesItem {
  @scala.inline
  def apply(
    id: java.lang.String,
    invoice: java.lang.String,
    livemode: scala.Boolean,
    `object`: java.lang.String,
    period: stripeLib.stripeMod.StripeNs.invoicesNs.IPeriod,
    subscription_item: java.lang.String,
    total_usage: scala.Double
  ): IUsageRecordSummariesItem = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("invoice")(invoice)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("period")(period)
    __obj.updateDynamic("subscription_item")(subscription_item)
    __obj.updateDynamic("total_usage")(total_usage)
    __obj.asInstanceOf[IUsageRecordSummariesItem]
  }
}

