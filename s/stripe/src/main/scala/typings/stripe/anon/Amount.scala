package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
  var amount: Double
  var application: String
  /**
    * Three-letter ISO currency code representing the currency of the amount that was disputed.
    */
  var currency: String
  var description: String
  /**
    * Type of the fee, one of: "application_fee", "stripe_fee"" or "tax".
    */
  var `type`: String
}

object Amount {
  @scala.inline
  def apply(amount: Double, application: String, currency: String, description: String, `type`: String): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
}

