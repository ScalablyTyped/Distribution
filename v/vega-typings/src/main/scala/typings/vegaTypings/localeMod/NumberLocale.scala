package typings.vegaTypings.localeMod

import typings.vegaTypings.utilMod.Vector10
import typings.vegaTypings.utilMod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberLocale extends js.Object {
  /**
    * The currency prefix and suffix (e.g., ["$", ""]).
    */
  var currency: Vector2[String] = js.native
  /**
    * The decimal point (e.g., ".").
    */
  var decimal: String = js.native
  /**
    * The array of group sizes (e.g., [3]), cycled as needed.
    */
  var grouping: js.Array[Double] = js.native
  /**
    * The minus sign (defaults to hyphen-minus, "-").
    */
  var minus: js.UndefOr[String] = js.native
  /**
    * The not-a-number value (defaults to "NaN").
    */
  var nan: js.UndefOr[String] = js.native
  /**
    * An array of ten strings to replace the numerals 0-9.
    */
  var numerals: js.UndefOr[Vector10[String]] = js.native
  /**
    * The percent sign (defaults to "%").
    */
  var percent: js.UndefOr[String] = js.native
  /**
    * The group separator (e.g., ",").
    */
  var thousands: String = js.native
}

object NumberLocale {
  @scala.inline
  def apply(currency: Vector2[String], decimal: String, grouping: js.Array[Double], thousands: String): NumberLocale = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLocale]
  }
  @scala.inline
  implicit class NumberLocaleOps[Self <: NumberLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: Vector2[String]): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupingVarargs(value: Double*): Self = this.set("grouping", js.Array(value :_*))
    @scala.inline
    def setGrouping(value: js.Array[Double]): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setThousands(value: String): Self = this.set("thousands", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinus(value: String): Self = this.set("minus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinus: Self = this.set("minus", js.undefined)
    @scala.inline
    def setNan(value: String): Self = this.set("nan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNan: Self = this.set("nan", js.undefined)
    @scala.inline
    def setNumerals(value: Vector10[String]): Self = this.set("numerals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumerals: Self = this.set("numerals", js.undefined)
    @scala.inline
    def setPercent(value: String): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
  }
  
}

