package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.IListOptions
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.usageRecordSummaries.IUsageRecordSummaries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.UsageRecordSummaries")
@js.native
class UsageRecordSummaries () extends StripeResource {
  def list(subscriptionItem: String): js.Promise[IUsageRecordSummaries] = js.native
  /**
    * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
    */
  def list(subscriptionItem: String, options: IListOptions): js.Promise[IUsageRecordSummaries] = js.native
  def list(subscriptionItem: String, options: IListOptions, response: IResponseFn[IUsageRecordSummaries]): js.Promise[IUsageRecordSummaries] = js.native
  def list(subscriptionItem: String, response: IResponseFn[IUsageRecordSummaries]): js.Promise[IUsageRecordSummaries] = js.native
}

