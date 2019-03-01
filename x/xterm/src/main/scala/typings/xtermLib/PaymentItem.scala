package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentItem extends js.Object {
  var amount: PaymentCurrencyAmount
  var label: java.lang.String
  var pending: js.UndefOr[scala.Boolean] = js.undefined
}

object PaymentItem {
  @scala.inline
  def apply(
    amount: PaymentCurrencyAmount,
    label: java.lang.String,
    pending: js.UndefOr[scala.Boolean] = js.undefined
  ): PaymentItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("label")(label)
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[PaymentItem]
  }
}

