package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecords
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(
    subscription: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecordCreationOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecord] = js.native
  /**
               * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
               */
  def create(
    subscription: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecordCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecord] = js.native
  /**
               * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
               */
  def create(
    subscription: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecordCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecord]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecord] = js.native
  def create(
    subscription: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecordCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecord]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.usageRecordsNs.IUsageRecord] = js.native
}

