package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoneyParams extends _FormatterParams {
  // Money
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  var symbolAfter: js.UndefOr[scala.Boolean] = js.undefined
  var thousand: js.UndefOr[java.lang.String] = js.undefined
}

object MoneyParams {
  @scala.inline
  def apply(
    decimal: java.lang.String = null,
    precision: scala.Boolean | scala.Double = null,
    symbol: java.lang.String = null,
    symbolAfter: js.UndefOr[scala.Boolean] = js.undefined,
    thousand: java.lang.String = null
  ): MoneyParams = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(symbolAfter)) __obj.updateDynamic("symbolAfter")(symbolAfter)
    if (thousand != null) __obj.updateDynamic("thousand")(thousand)
    __obj.asInstanceOf[MoneyParams]
  }
}

