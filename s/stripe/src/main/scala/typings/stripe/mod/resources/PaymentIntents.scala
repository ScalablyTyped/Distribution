package typings.stripe.mod.resources

import typings.stripe.anon.Cancellationreason
import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IList
import typings.stripe.mod.IListPromise
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.paymentIntents.IPaymentIntent
import typings.stripe.mod.paymentIntents.IPaymentIntentCaptureOptions
import typings.stripe.mod.paymentIntents.IPaymentIntentConfirmOptions
import typings.stripe.mod.paymentIntents.IPaymentIntentCreationOptions
import typings.stripe.mod.paymentIntents.IPaymentIntentListOptions
import typings.stripe.mod.paymentIntents.IPaymentIntentRetrieveOptions
import typings.stripe.mod.paymentIntents.IPaymentIntentUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.PaymentIntents")
@js.native
class PaymentIntents protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def cancel(paymentIntentId: String): js.Promise[IPaymentIntent] = js.native
  def cancel(paymentIntentId: String, data: Cancellationreason): js.Promise[IPaymentIntent] = js.native
  /**
    * A PaymentIntent object can be canceled when it is in one of these statuses: `requires_payment_method`, `requires_capture`, `requires_confirmation`, `requires_action`.
    * Once canceled, no additional charges will be made by the PaymentIntent and any operations on the PaymentIntent will fail with an error. For PaymentIntents with `status='requires_capture'`, the remaining `amount_capturable` will automatically be refunded.
    *
    * @returns Returns a PaymentIntent object if the cancellation succeeded. Returns an error if the PaymentIntent has already been canceled or is not in a cancelable state.
    */
  def cancel(paymentIntentId: String, data: Cancellationreason, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def cancel(
    paymentIntentId: String,
    data: Cancellationreason,
    options: HeaderOptions,
    response: IResponseFn[IPaymentIntent]
  ): js.Promise[IPaymentIntent] = js.native
  def cancel(paymentIntentId: String, data: Cancellationreason, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  def cancel(paymentIntentId: String, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def cancel(paymentIntentId: String, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  def cancel(paymentIntentId: String, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  
  def capture(paymentIntentId: String): js.Promise[IPaymentIntent] = js.native
  def capture(paymentIntentId: String, data: IPaymentIntentCaptureOptions): js.Promise[IPaymentIntent] = js.native
  /**
    * Capture the funds of an existing uncaptured PaymentIntent where `required_action="requires_capture"`.
    * Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
    *
    * @returns Returns a PaymentIntent object with `status="succeeded"` if the PaymentIntent was capturable. Returns an error if the PaymentIntent was not capturable or an invalid amount to capture was provided.
    */
  def capture(paymentIntentId: String, data: IPaymentIntentCaptureOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def capture(
    paymentIntentId: String,
    data: IPaymentIntentCaptureOptions,
    options: HeaderOptions,
    response: IResponseFn[IPaymentIntent]
  ): js.Promise[IPaymentIntent] = js.native
  def capture(paymentIntentId: String, data: IPaymentIntentCaptureOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  def capture(paymentIntentId: String, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def capture(paymentIntentId: String, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  def capture(paymentIntentId: String, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  
  def confirm(paymentIntentId: String): js.Promise[IPaymentIntent] = js.native
  def confirm(paymentIntentId: String, data: IPaymentIntentConfirmOptions): js.Promise[IPaymentIntent] = js.native
  /**
    * Confirm that your customer intends to pay with current or provided `source`. Upon confirmation, the PaymentIntent will attempt to initiate a payment.
    *
    * If the selected source requires additional authentication steps, the PaymentIntent will transition to the `requires_action` status and suggest additional actions via `next_source_action`. If payment fails, the PaymentIntent will transition to the `requires_payment_method` status. If payment succeeds, the PaymentIntent will transition to the `succeeded` status (or `requires_capture`, if `capture_method` is set to `manual`).
    *
    * When using a publishable key, the client_secret must be provided to confirm the PaymentIntent.
    */
  def confirm(paymentIntentId: String, data: IPaymentIntentConfirmOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def confirm(
    paymentIntentId: String,
    data: IPaymentIntentConfirmOptions,
    options: HeaderOptions,
    response: IResponseFn[IPaymentIntent]
  ): js.Promise[IPaymentIntent] = js.native
  def confirm(paymentIntentId: String, data: IPaymentIntentConfirmOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  def confirm(paymentIntentId: String, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def confirm(paymentIntentId: String, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  def confirm(paymentIntentId: String, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  
  def create(data: IPaymentIntentCreationOptions): js.Promise[IPaymentIntent] = js.native
  /**
    * Creates a PaymentIntent object.
    */
  def create(data: IPaymentIntentCreationOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def create(data: IPaymentIntentCreationOptions, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  def create(data: IPaymentIntentCreationOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  
  def list(): IListPromise[IPaymentIntent] = js.native
  def list(data: IPaymentIntentListOptions): IListPromise[IPaymentIntent] = js.native
  /**
    * Returns a list of PaymentIntents.
    *
    * @returns A object with a data property that contains an array of up to limit PaymentIntents, starting after PaymentIntent starting_after. Each entry in the array is a separate PaymentIntent object. If no more PaymentIntents are available, the resulting array will be empty. This request should never throw an error.
    */
  def list(data: IPaymentIntentListOptions, options: HeaderOptions): IListPromise[IPaymentIntent] = js.native
  def list(
    data: IPaymentIntentListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IPaymentIntent]]
  ): IListPromise[IPaymentIntent] = js.native
  def list(data: IPaymentIntentListOptions, response: IResponseFn[IList[IPaymentIntent]]): IListPromise[IPaymentIntent] = js.native
  def list(options: HeaderOptions): IListPromise[IPaymentIntent] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IPaymentIntent]]): IListPromise[IPaymentIntent] = js.native
  def list(response: IResponseFn[IList[IPaymentIntent]]): IListPromise[IPaymentIntent] = js.native
  
  def retrieve(id: String): js.Promise[IPaymentIntent] = js.native
  def retrieve(id: String, data: IPaymentIntentRetrieveOptions): js.Promise[IPaymentIntent] = js.native
  /**
    * Retrieves the details of a PaymentIntent that has previously been created.
    * Client-side retrieval using a publishable key is allowed when the client_secret is provided in the query string.
    * When retrieved with a publishable key, only a subset of properties will be returned. Please refer to the payment intent object reference for more details.
    */
  def retrieve(id: String, data: IPaymentIntentRetrieveOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def retrieve(
    id: String,
    data: IPaymentIntentRetrieveOptions,
    options: HeaderOptions,
    response: IResponseFn[IPaymentIntent]
  ): js.Promise[IPaymentIntent] = js.native
  def retrieve(id: String, data: IPaymentIntentRetrieveOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  def retrieve(id: String, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
  
  def update(id: String, data: IPaymentIntentUpdateOptions): js.Promise[IPaymentIntent] = js.native
  /**
    * Updates a PaymentIntent object.
    */
  def update(id: String, data: IPaymentIntentUpdateOptions, options: HeaderOptions): js.Promise[IPaymentIntent] = js.native
  def update(
    id: String,
    data: IPaymentIntentUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IPaymentIntent]
  ): js.Promise[IPaymentIntent] = js.native
  def update(id: String, data: IPaymentIntentUpdateOptions, response: IResponseFn[IPaymentIntent]): js.Promise[IPaymentIntent] = js.native
}
