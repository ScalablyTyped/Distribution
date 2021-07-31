package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.usageRecords.IUsageRecord
import typings.stripe.mod.usageRecords.IUsageRecordCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.UsageRecords")
@js.native
class UsageRecords protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def create(subscription: String, data: IUsageRecordCreationOptions): js.Promise[IUsageRecord] = js.native
  /**
    * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
    */
  def create(subscription: String, data: IUsageRecordCreationOptions, options: HeaderOptions): js.Promise[IUsageRecord] = js.native
  def create(
    subscription: String,
    data: IUsageRecordCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IUsageRecord]
  ): js.Promise[IUsageRecord] = js.native
  def create(subscription: String, data: IUsageRecordCreationOptions, response: IResponseFn[IUsageRecord]): js.Promise[IUsageRecord] = js.native
}
