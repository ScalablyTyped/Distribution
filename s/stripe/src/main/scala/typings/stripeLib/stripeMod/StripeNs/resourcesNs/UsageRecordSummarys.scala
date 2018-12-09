package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecordSummarys
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def list(data: stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarysListOptions): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarys] = js.native
  /**
               * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarysListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarys] = js.native
  /**
               * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
               */
  def list(
    data: stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarysListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarys]
  ): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarys] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarysListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarys]
  ): js.Promise[stripeLib.stripeMod.StripeNs.usageRecordSummarysNs.IUsageRecordSummarys] = js.native
}

