package typings
package stripejsLib.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenResult extends js.Object {
  /**
    * There was an error. This includes client-side validation errors.
    */
  var error: js.UndefOr[stripejsLib.stripejsMod.StripeError] = js.undefined
  /**
    * The generated string that can be used for communication with the backend
    */
  var token: js.UndefOr[Token] = js.undefined
}

object TokenResult {
  @scala.inline
  def apply(error: stripejsLib.stripejsMod.StripeError = null, token: Token = null): TokenResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[TokenResult]
  }
}

