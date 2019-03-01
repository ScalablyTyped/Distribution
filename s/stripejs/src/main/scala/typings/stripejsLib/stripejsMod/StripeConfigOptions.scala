package typings
package stripejsLib.stripejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeConfigOptions extends js.Object {
  var stripeAccount: java.lang.String
}

object StripeConfigOptions {
  @scala.inline
  def apply(stripeAccount: java.lang.String): StripeConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stripeAccount")(stripeAccount)
    __obj.asInstanceOf[StripeConfigOptions]
  }
}

