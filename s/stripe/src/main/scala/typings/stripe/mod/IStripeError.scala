package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stripe uses conventional HTTP response codes to indicate success or failure of an API request.
  * In general, codes in the 2xx range indicate success, codes in the 4xx range indicate an error that
  * resulted from the provided information (e.g. a required parameter was missing, a charge failed, etc.),
  * and codes in the 5xx range indicate an error with Stripe's servers. Not all errors map cleanly onto HTTP
  * response codes, however. When a request is valid but does not complete successfully (e.g. a card is
  * declined), we return a 402 error code.
  *
  * 200 - OK                           Everything worked as expected.
  * 400 - Bad Request                  Often missing a required parameter.
  * 401 - Unauthorized                 No valid API key provided.
  * 402 - Request Failed               Parameters were valid but request failed.
  * 404 - Not Found                    The requested item doesn't exist.
  * 500, 502, 503, 504 - Server Errors Something went wrong on Stripe's end.
  */
@js.native
trait IStripeError extends js.Object {
  /**
    * For card errors, a short string from amongst those listed on the right describing the kind of card
    * error that occurred.
    *
    * incorrect_number          The card number is incorrect.
    * invalid_number            The card number is not a valid credit card number.
    * invalid_expiry_month      The card's expiration month is invalid.
    * invalid_expiry_year       The card's expiration year is invalid.
    * invalid_cvc               The card's security code is invalid.
    * expired_card              The card has expired.
    * incorrect_cvc             The card's security code is incorrect.
    * incorrect_zip             The card's zip code failed validation.
    * card_declined             The card was declined.
    * missing                   There is no card on a customer that is being charged.
    * processing_error          An error occurred while processing the card.
    * rate_limit                An error occurred due to requests hitting the API too
    *                             quickly. Please let us know if you're consistently running
    *                             into this error.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * A human-readable message giving more details about the error. For card errors, these messages can
    * be shown to your users.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The parameter the error relates to if the error is parameter-specific. You can use this to display a
    * message near the correct form field, for example.
    */
  var param: js.UndefOr[String] = js.native
  /**
    * The type of error returned. Can be invalid_request_error, api_error, or card_error.
    *
    *
    * invalid_request_error Invalid request errors arise when your request has invalid parameters.
    *
    * api_error             API errors cover any other type of problem (e.g. a temporary problem with Stripe's
    *                       servers) and should turn up only very infrequently.
    *
    * card_error            Card errors are the most common type of error you should expect to handle. They result
    *                       when the user enters a card that can't be charged for some reason.
    */
  var `type`: String = js.native
}

object IStripeError {
  @scala.inline
  def apply(`type`: String): IStripeError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStripeError]
  }
  @scala.inline
  implicit class IStripeErrorOps[Self <: IStripeError] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
  }
  
}

