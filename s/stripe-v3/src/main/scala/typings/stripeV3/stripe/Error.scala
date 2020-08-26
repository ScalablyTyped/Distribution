package typings.stripeV3.stripe

import typings.stripeV3.stripe.paymentIntents.PaymentIntent
import typings.stripeV3.stripe.paymentMethod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  /**
    * For card errors, the ID of the failed charge.
    */
  var charge: String = js.native
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for
    * the decline if they provide one.
    */
  var decline_code: js.UndefOr[String] = js.native
  /**
    * A URL to more information about the error code reported.
    */
  var doc_url: js.UndefOr[String] = js.native
  /**
    * A human-readable message providing more details about the
    * error. For card errors, these messages can be shown to
    * your users.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * If the error is parameter-specific, the parameter related
    * to the error. For example, you can use this to display a
    * message near the correct form field.
    */
  var param: js.UndefOr[String] = js.native
  /**
    * The PaymentIntent object for errors returned on a request
    * involving a PaymentIntent.
    */
  var payment_intent: js.UndefOr[PaymentIntent] = js.native
  /**
    * The PaymentMethod object for errors returned on a
    * request involving a PaymentMethod.
    */
  var payment_method: js.UndefOr[PaymentMethod] = js.native
  /**
    * The source object for errors returned on a request involving
    * a source.
    */
  var source: js.UndefOr[Source] = js.native
  /**
    * The type of error returned.
    */
  var `type`: ErrorType = js.native
}

object Error {
  @scala.inline
  def apply(charge: String, `type`: ErrorType): Error = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharge(value: String): Self = this.set("charge", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ErrorType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDecline_code(value: String): Self = this.set("decline_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecline_code: Self = this.set("decline_code", js.undefined)
    @scala.inline
    def setDoc_url(value: String): Self = this.set("doc_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc_url: Self = this.set("doc_url", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
    @scala.inline
    def setPayment_intent(value: PaymentIntent): Self = this.set("payment_intent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_intent: Self = this.set("payment_intent", js.undefined)
    @scala.inline
    def setPayment_method(value: PaymentMethod): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

