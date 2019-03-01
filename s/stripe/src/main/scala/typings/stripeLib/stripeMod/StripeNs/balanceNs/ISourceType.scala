package typings
package stripeLib.stripeMod.StripeNs.balanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceType extends js.Object {
  var amount: scala.Double
  var currency: java.lang.String
  var source_types: stripeLib.Anon_Alipayaccount
}

object ISourceType {
  @scala.inline
  def apply(amount: scala.Double, currency: java.lang.String, source_types: stripeLib.Anon_Alipayaccount): ISourceType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("source_types")(source_types)
    __obj.asInstanceOf[ISourceType]
  }
}

