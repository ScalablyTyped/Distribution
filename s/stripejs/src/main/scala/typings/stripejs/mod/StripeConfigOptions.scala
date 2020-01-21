package typings.stripejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeConfigOptions extends js.Object {
  var stripeAccount: String
}

object StripeConfigOptions {
  @scala.inline
  def apply(stripeAccount: String): StripeConfigOptions = {
    val __obj = js.Dynamic.literal(stripeAccount = stripeAccount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StripeConfigOptions]
  }
}

