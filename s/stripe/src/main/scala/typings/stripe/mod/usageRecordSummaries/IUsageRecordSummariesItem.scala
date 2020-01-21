package typings.stripe.mod.usageRecordSummaries

import typings.stripe.mod.invoices.IPeriod
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], subscription_item = subscription_item.asInstanceOf[js.Any], total_usage = total_usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecordSummariesItem]
  }
}

