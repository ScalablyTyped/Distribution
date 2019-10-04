package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountInclusive extends js.Object {
  /**
    * The amount, in pence, of the tax.
    */
  var amount: Double
  /**
    * Whether this tax amount is inclusive or exclusive.
    */
  var inclusive: Boolean
  /**
    * The tax rate that was applied to get this tax amount.
    */
  var tax_rate: String
}

object Anon_AmountInclusive {
  @scala.inline
  def apply(amount: Double, inclusive: Boolean, tax_rate: String): Anon_AmountInclusive = {
    val __obj = js.Dynamic.literal(amount = amount, inclusive = inclusive, tax_rate = tax_rate)
  
    __obj.asInstanceOf[Anon_AmountInclusive]
  }
}

