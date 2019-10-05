package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiExchangeRate")
@js.native
object nlapiExchangeRate extends js.Object {
  /**
    * Calculate exchange rate between two currencies as of today or an optional effective date.
    * @governance 10 units
    *
    * @param {string, int} fromCurrency internal ID or currency code of currency we are converting from
    * @param {string, int} toCurrency internal ID or currency code of currency we are converting to
    * @param {string} [date] string containing date of effective exchange rate. defaults to today
    * @return {float}
    *
    * @since 2009.1
    * @param fromCurrency
    * @param toCurrency
    * @param date?
    * @return
    */
  def apply(fromCurrency: js.Any, toCurrency: js.Any): js.Any = js.native
  def apply(fromCurrency: js.Any, toCurrency: js.Any, date: String): js.Any = js.native
}

