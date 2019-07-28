package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
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

object Anon_Amount {
  @scala.inline
  def apply(amount: Double, application: String, currency: String, description: String, `type`: String): Anon_Amount = {
    val __obj = js.Dynamic.literal(amount = amount, application = application, currency = currency, description = description)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Amount]
  }
}

