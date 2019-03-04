package typings
package stripeLib.stripeMod.StripeNs.usageRecordSummariesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A object with a data property that contains an array of up to limit summaries,
  * starting after summary starting_after. Each entry in the array is a separate summary object.
  * If no more summaries are available, the resulting array is empty.
  */
trait IUsageRecordSummaries
  extends stripeLib.stripeMod.StripeNs.IList[IUsageRecordSummariesItem] {
  @JSName("object")
  var object_IUsageRecordSummaries: stripeLib.stripeLibStrings.list
}

object IUsageRecordSummaries {
  @scala.inline
  def apply(
    data: js.Array[IUsageRecordSummariesItem],
    has_more: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.list,
    url: java.lang.String,
    total_count: scala.Int | scala.Double = null
  ): IUsageRecordSummaries = {
    val __obj = js.Dynamic.literal(data = data, has_more = has_more, url = url)
    __obj.updateDynamic("object")(`object`)
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecordSummaries]
  }
}

