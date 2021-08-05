package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait IStripeError extends StObject {
  
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
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable message giving more details about the error. For card errors, these messages can
    * be shown to your users.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The parameter the error relates to if the error is parameter-specific. You can use this to display a
    * message near the correct form field, for example.
    */
  var param: js.UndefOr[String] = js.undefined
  
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
  var `type`: String
}
object IStripeError {
  
  inline def apply(`type`: String): IStripeError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStripeError]
  }
  
  extension [Self <: IStripeError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
