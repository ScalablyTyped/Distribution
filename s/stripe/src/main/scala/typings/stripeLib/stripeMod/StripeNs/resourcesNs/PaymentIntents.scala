package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentIntents
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def cancel(paymentIntentId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def cancel(paymentIntentId: java.lang.String, data: stripeLib.Anon_Cancellationreason): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  /**
    * A PaymentIntent object can be canceled when it is in one of these statuses: `requires_payment_method`, `requires_capture`, `requires_confirmation`, `requires_action`.
    * Once canceled, no additional charges will be made by the PaymentIntent and any operations on the PaymentIntent will fail with an error. For PaymentIntents with `status='requires_capture'`, the remaining `amount_capturable` will automatically be refunded.
    *
    * @returns Returns a PaymentIntent object if the cancellation succeeded. Returns an error if the PaymentIntent has already been canceled or is not in a cancelable state.
    */
  def cancel(
    paymentIntentId: java.lang.String,
    data: stripeLib.Anon_Cancellationreason,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def cancel(
    paymentIntentId: java.lang.String,
    data: stripeLib.Anon_Cancellationreason,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def cancel(
    paymentIntentId: java.lang.String,
    data: stripeLib.Anon_Cancellationreason,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def cancel(paymentIntentId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def cancel(
    paymentIntentId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def cancel(
    paymentIntentId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def capture(paymentIntentId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def capture(
    paymentIntentId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentCaptureOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  /**
    * Capture the funds of an existing uncaptured PaymentIntent where `required_action="requires_capture"`.
    * Uncaptured PaymentIntents will be canceled exactly seven days after they are created.
    *
    * @returns Returns a PaymentIntent object with `status="succeeded"` if the PaymentIntent was capturable. Returns an error if the PaymentIntent was not capturable or an invalid amount to capture was provided.
    */
  def capture(
    paymentIntentId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentCaptureOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def capture(
    paymentIntentId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentCaptureOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def capture(
    paymentIntentId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentCaptureOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def capture(paymentIntentId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def capture(
    paymentIntentId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def capture(
    paymentIntentId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def confirm(paymentIntentId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def confirm(
    paymentIntentId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentConfirmOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  /**
    * Confirm that your customer intends to pay with current or provided `source`. Upon confirmation, the PaymentIntent will attempt to initiate a payment.
    *
    * If the selected source requires additional authentication steps, the PaymentIntent will transition to the `requires_action` status and suggest additional actions via `next_source_action`. If payment fails, the PaymentIntent will transition to the `requires_payment_method` status. If payment succeeds, the PaymentIntent will transition to the `succeeded` status (or `requires_capture`, if `capture_method` is set to `manual`).
    *
    * When using a publishable key, the client_secret must be provided to confirm the PaymentIntent.
    */
  def confirm(
    paymentIntentId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentConfirmOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def confirm(
    paymentIntentId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentConfirmOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def confirm(
    paymentIntentId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentConfirmOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def confirm(paymentIntentId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def confirm(
    paymentIntentId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def confirm(
    paymentIntentId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def create(data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  /**
    * Creates a PaymentIntent object.
    */
  def create(
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def list(): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ] = js.native
  /**
    * Returns a list of PaymentIntents.
    *
    * @returns A object with a data property that contains an array of up to limit PaymentIntents, starting after PaymentIntent starting_after. Each entry in the array is a separate PaymentIntent object. If no more PaymentIntents are available, the resulting array will be empty. This request should never throw an error.
    */
  def list(
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ] = js.native
  def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentRetrieveOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  /**
    * Retrieves the details of a PaymentIntent that has previously been created.
    * Client-side retrieval using a publishable key is allowed when the client_secret is provided in the query string.
    * When retrieved with a publishable key, only a subset of properties will be returned. Please refer to the payment intent object reference for more details.
    */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentRetrieveOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentRetrieveOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentRetrieveOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentUpdateOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  /**
    * Updates a PaymentIntent object.
    */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntentUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent]
  ): js.Promise[stripeLib.stripeMod.StripeNs.paymentIntentsNs.IPaymentIntent] = js.native
}

