package typings.stripe.stripeMod.usageRecordSummariesNs

import typings.stripe.stripeMod.invoicesNs.IPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUsageRecordSummariesItem extends js.Object {
  var id: String
  var invoice: String
  var livemode: Boolean
  var `object`: String
  var period: IPeriod
  var subscription_item: String
  var total_usage: Double
}

object IUsageRecordSummariesItem {
  @scala.inline
  def apply(
    id: String,
    invoice: String,
    livemode: Boolean,
    `object`: String,
    period: IPeriod,
    subscription_item: String,
    total_usage: Double
  ): IUsageRecordSummariesItem = {
    val __obj = js.Dynamic.literal(id = id, invoice = invoice, livemode = livemode, period = period, subscription_item = subscription_item, total_usage = total_usage)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IUsageRecordSummariesItem]
  }
}

