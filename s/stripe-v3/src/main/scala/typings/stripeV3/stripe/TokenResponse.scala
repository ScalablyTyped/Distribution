package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenResponse extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var token: js.UndefOr[Token] = js.undefined
}

object TokenResponse {
  @scala.inline
  def apply(error: Error = null, token: Token = null): TokenResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
}

