package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IList
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.payouts.IPayout
import typings.stripe.mod.payouts.IPayoutCreationOptions
import typings.stripe.mod.payouts.IPayoutListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Payouts")
@js.native
class Payouts protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def cancel(payoutId: String): js.Promise[IPayout] = js.native
  /**
    * A previously created payout can be canceled if it has not yet been paid out. Funds will be refunded to your available balance, and the fees you were originally charged on the payout will be refunded.
    * You may not cancel automatic Stripe payouts.
    */
  def cancel(payoutId: String, options: HeaderOptions): js.Promise[IPayout] = js.native
  def cancel(payoutId: String, options: HeaderOptions, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
  def cancel(payoutId: String, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
  
  def create(data: IPayoutCreationOptions): js.Promise[IPayout] = js.native
  /**
    * To send funds to your own bank account, you create a new payout object. Your Stripe balance must be able to cover the payout amount, or you’ll receive an “Insufficient Funds” error.
    *
    * If your API key is in test mode, money won’t actually be sent, though everything else will occur as if in live mode.
    *
    * If you are creating a manual payout on a Stripe account that uses multiple payment source types, you’ll need to specify the source type balance that the payout should draw from.
    * The balance object details available and pending amounts by source type.
    *
    */
  def create(data: IPayoutCreationOptions, options: HeaderOptions): js.Promise[IPayout] = js.native
  def create(data: IPayoutCreationOptions, options: HeaderOptions, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
  def create(data: IPayoutCreationOptions, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
  
  def list(): IListPromise[IPayout] = js.native
  def list(data: IPayoutListOptions): IListPromise[IPayout] = js.native
  /**
    * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent you. The payouts are returned in sorted order, with the most recently created payouts appearing first.
    */
  def list(data: IPayoutListOptions, options: HeaderOptions): IListPromise[IPayout] = js.native
  def list(data: IPayoutListOptions, options: HeaderOptions, response: IResponseFn[IList[IPayout]]): IListPromise[IPayout] = js.native
  def list(data: IPayoutListOptions, response: IResponseFn[IList[IPayout]]): IListPromise[IPayout] = js.native
  def list(options: HeaderOptions): IListPromise[IPayout] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IPayout]]): IListPromise[IPayout] = js.native
  def list(response: IResponseFn[IList[IPayout]]): IListPromise[IPayout] = js.native
  
  def retrieve(payoutId: String): js.Promise[IPayout] = js.native
  /**
    * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout creation request or the payout list, and Stripe will return the corresponding payout information.
    */
  def retrieve(payoutId: String, options: HeaderOptions): js.Promise[IPayout] = js.native
  def retrieve(payoutId: String, options: HeaderOptions, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
  def retrieve(payoutId: String, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
  
  def update(payoutId: String, data: IDataOptionsWithMetadata): js.Promise[IPayout] = js.native
  /**
    * Updates the specified payout by setting the values of the parameters passed. Any parameters not provided will be left unchanged. This request accepts only the metadata as arguments.
    */
  def update(payoutId: String, data: IDataOptionsWithMetadata, options: HeaderOptions): js.Promise[IPayout] = js.native
  def update(
    payoutId: String,
    data: IDataOptionsWithMetadata,
    options: HeaderOptions,
    response: IResponseFn[IPayout]
  ): js.Promise[IPayout] = js.native
  def update(payoutId: String, data: IDataOptionsWithMetadata, response: IResponseFn[IPayout]): js.Promise[IPayout] = js.native
}
