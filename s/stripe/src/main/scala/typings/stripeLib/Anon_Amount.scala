package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: scala.Double
  var application: java.lang.String
  /**
    * Three-letter ISO currency code representing the currency of the amount that was disputed.
    */
  var currency: java.lang.String
  var description: java.lang.String
  /**
    * Type of the fee, one of: "application_fee", "stripe_fee"" or "tax".
    */
  var `type`: java.lang.String
}

object Anon_Amount {
  @scala.inline
  def apply(
    amount: scala.Double,
    application: java.lang.String,
    currency: java.lang.String,
    description: java.lang.String,
    `type`: java.lang.String
  ): Anon_Amount = {
    val __obj = js.Dynamic.literal(amount = amount, application = application, currency = currency, description = description)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Amount]
  }
}

