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

