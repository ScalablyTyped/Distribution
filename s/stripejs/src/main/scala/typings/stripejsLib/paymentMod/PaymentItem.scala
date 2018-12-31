package typings
package stripejsLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentItem extends js.Object {
  /**
    * The amount the user has to pay in the given currency
    * @see StripePaymentOptions.currency
    */
  var amount: scala.Double
  /**
    * A text that should be shown to the user
    */
  var label: java.lang.String
  /**
    * Whether or not the payment should be executed immediately
    * If you might change this amount later (for example, after you have calculated shipping costs), set this to `true`
    */
  var pending: js.UndefOr[scala.Boolean] = js.undefined
}

