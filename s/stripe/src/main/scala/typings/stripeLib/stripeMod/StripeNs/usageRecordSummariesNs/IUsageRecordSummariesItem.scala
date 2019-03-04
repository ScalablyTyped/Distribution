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
    val __obj = js.Dynamic.literal(id = id, invoice = invoice, livemode = livemode, period = period, subscription_item = subscription_item, total_usage = total_usage)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IUsageRecordSummariesItem]
  }
}

