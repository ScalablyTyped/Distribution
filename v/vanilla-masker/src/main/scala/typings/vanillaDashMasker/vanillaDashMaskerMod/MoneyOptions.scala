package typings.vanillaDashMasker.vanillaDashMaskerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoneyOptions extends js.Object {
  // Number delimiter -> "12.345.678"
  var delimiter: js.UndefOr[String] = js.undefined
  // Decimal precision -> "90"
  var precision: js.UndefOr[Double] = js.undefined
  // Decimal separator -> ",90"
  var separator: js.UndefOr[String] = js.undefined
  // Money unit -> "12.345.678,90 R$"
  var suffixUnit: js.UndefOr[String] = js.undefined
  // Money unit -> "R$ 12.345.678,90"
  var unit: js.UndefOr[String] = js.undefined
  // Force type only number instead decimal,
  // masking decimals with ",00"
  // Zero cents -> "R$ 1.234.567.890,00"
  var zeroCents: js.UndefOr[Boolean] = js.undefined
}

object MoneyOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    precision: Int | Double = null,
    separator: String = null,
    suffixUnit: String = null,
    unit: String = null,
    zeroCents: js.UndefOr[Boolean] = js.undefined
  ): MoneyOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (suffixUnit != null) __obj.updateDynamic("suffixUnit")(suffixUnit.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroCents)) __obj.updateDynamic("zeroCents")(zeroCents.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoneyOptions]
  }
}

