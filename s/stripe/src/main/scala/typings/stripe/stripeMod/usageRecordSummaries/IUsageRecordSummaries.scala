package typings.stripe.stripeMod.usageRecordSummaries

import typings.stripe.stripeMod.IList
import typings.stripe.stripeStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A object with a data property that contains an array of up to limit summaries,
  * starting after summary starting_after. Each entry in the array is a separate summary object.
  * If no more summaries are available, the resulting array is empty.
  */
trait IUsageRecordSummaries extends IList[IUsageRecordSummariesItem] {
  @JSName("object")
  var object_IUsageRecordSummaries: list
}

object IUsageRecordSummaries {
  @scala.inline
  def apply(
    data: js.Array[IUsageRecordSummariesItem],
    has_more: Boolean,
    `object`: list,
    url: String,
    total_count: Int | Double = null
  ): IUsageRecordSummaries = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecordSummaries]
  }
}

