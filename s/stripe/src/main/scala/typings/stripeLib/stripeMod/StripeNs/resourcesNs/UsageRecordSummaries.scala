package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecordSummaries
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def list(subscriptionItem: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
  /**
    * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
    */
  def list(subscriptionItem: java.lang.String, options: stripeLib.stripeMod.StripeNs.IListOptions): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
  def list(
    subscriptionItem: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.IListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries]
  ): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
  def list(
    subscriptionItem: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries]
  ): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
}

