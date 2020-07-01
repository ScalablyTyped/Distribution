package typings.vegaTypings.localeMod

import typings.vegaTypings.utilMod.Vector10
import typings.vegaTypings.utilMod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLocale extends js.Object {
  /**
    * The currency prefix and suffix (e.g., ["$", ""]).
    */
  var currency: Vector2[String]
  /**
    * The decimal point (e.g., ".").
    */
  var decimal: String
  /**
    * The array of group sizes (e.g., [3]), cycled as needed.
    */
  var grouping: js.Array[Double]
  /**
    * The minus sign (defaults to hyphen-minus, "-").
    */
  var minus: js.UndefOr[String] = js.undefined
  /**
    * The not-a-number value (defaults to "NaN").
    */
  var nan: js.UndefOr[String] = js.undefined
  /**
    * An array of ten strings to replace the numerals 0-9.
    */
  var numerals: js.UndefOr[Vector10[String]] = js.undefined
  /**
    * The percent sign (defaults to "%").
    */
  var percent: js.UndefOr[String] = js.undefined
  /**
    * The group separator (e.g., ",").
    */
  var thousands: String
}

object NumberLocale {
  @scala.inline
  def apply(
    currency: Vector2[String],
    decimal: String,
    grouping: js.Array[Double],
    thousands: String,
    minus: String = null,
    nan: String = null,
    numerals: Vector10[String] = null,
    percent: String = null
  ): NumberLocale = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    if (minus != null) __obj.updateDynamic("minus")(minus.asInstanceOf[js.Any])
    if (nan != null) __obj.updateDynamic("nan")(nan.asInstanceOf[js.Any])
    if (numerals != null) __obj.updateDynamic("numerals")(numerals.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLocale]
  }
}

