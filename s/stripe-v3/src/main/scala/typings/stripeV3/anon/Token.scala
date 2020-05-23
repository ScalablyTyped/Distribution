package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /*
    * Converts the provided token into a PaymentMethod to use for
    * confirmation.
    */
  var token: String
}

object Token {
  @scala.inline
  def apply(token: String): Token = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

