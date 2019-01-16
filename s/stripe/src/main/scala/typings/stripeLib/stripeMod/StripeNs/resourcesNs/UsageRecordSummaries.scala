package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecordSummaries
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def list(data: stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummariesListOptions): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
  /**
    * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
    */
  def list(
    data: stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummariesListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummariesListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries]
  ): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummariesListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries]
  ): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummariesNs.IUsageRecordSummaries] = js.native
}

