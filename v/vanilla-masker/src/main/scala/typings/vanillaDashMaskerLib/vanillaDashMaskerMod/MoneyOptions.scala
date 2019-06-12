package typings
package vanillaDashMaskerLib.vanillaDashMaskerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoneyOptions extends js.Object {
  // Number delimiter -> "12.345.678"
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  // Decimal precision -> "90"
  var precision: js.UndefOr[scala.Double] = js.undefined
  // Decimal separator -> ",90"
  var separator: js.UndefOr[java.lang.String] = js.undefined
  // Money unit -> "12.345.678,90 R$"
  var suffixUnit: js.UndefOr[java.lang.String] = js.undefined
  // Money unit -> "R$ 12.345.678,90"
  var unit: js.UndefOr[java.lang.String] = js.undefined
  // Force type only number instead decimal,
  // masking decimals with ",00"
  // Zero cents -> "R$ 1.234.567.890,00"
  var zeroCents: js.UndefOr[scala.Boolean] = js.undefined
}

object MoneyOptions {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    separator: java.lang.String = null,
    suffixUnit: java.lang.String = null,
    unit: java.lang.String = null,
    zeroCents: js.UndefOr[scala.Boolean] = js.undefined
  ): MoneyOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (suffixUnit != null) __obj.updateDynamic("suffixUnit")(suffixUnit)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (!js.isUndefined(zeroCents)) __obj.updateDynamic("zeroCents")(zeroCents)
    __obj.asInstanceOf[MoneyOptions]
  }
}

