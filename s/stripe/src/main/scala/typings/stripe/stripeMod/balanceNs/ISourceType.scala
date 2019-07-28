package typings.stripe.stripeMod.balanceNs

import typings.stripe.Anon_Alipayaccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceType extends js.Object {
  var amount: Double
  var currency: String
  var source_types: Anon_Alipayaccount
}

object ISourceType {
  @scala.inline
  def apply(amount: Double, currency: String, source_types: Anon_Alipayaccount): ISourceType = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, source_types = source_types)
  
    __obj.asInstanceOf[ISourceType]
  }
}

