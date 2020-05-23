package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoneyParams extends _FormatterParams {
  // Money
  var decimal: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Boolean | Double] = js.undefined
  var symbol: js.UndefOr[String] = js.undefined
  var symbolAfter: js.UndefOr[Boolean] = js.undefined
  var thousand: js.UndefOr[String] = js.undefined
}

object MoneyParams {
  @scala.inline
  def apply(
    decimal: String = null,
    precision: Boolean | Double = null,
    symbol: String = null,
    symbolAfter: js.UndefOr[Boolean] = js.undefined,
    thousand: String = null
  ): MoneyParams = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolAfter)) __obj.updateDynamic("symbolAfter")(symbolAfter.get.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoneyParams]
  }
}

