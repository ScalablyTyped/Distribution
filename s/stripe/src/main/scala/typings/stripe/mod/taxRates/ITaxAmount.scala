package typings.stripe.mod.taxRates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaxAmount extends js.Object {
  /**
    * The amount, in cents, of the tax.
    */
  var amount: Double
  /**
    * Whether this tax amount is inclusive or exclusive.
    */
  var inclusive: Boolean
  /**
    * The tax rate that was applied to get this tax amount.
    */
  var tax_rate: String | ITaxRate
}

object ITaxAmount {
  @scala.inline
  def apply(amount: Double, inclusive: Boolean, tax_rate: String | ITaxRate): ITaxAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], tax_rate = tax_rate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITaxAmount]
  }
}

