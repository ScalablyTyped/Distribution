package typings.stripe.mod.balance

import typings.stripe.anon.Alipayaccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceType extends js.Object {
  var amount: Double
  var currency: String
  var source_types: Alipayaccount
}

object ISourceType {
  @scala.inline
  def apply(amount: Double, currency: String, source_types: Alipayaccount): ISourceType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], source_types = source_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceType]
  }
}

