package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrencyFormatterFactory extends js.Object {
  def createCurrencyFormatterCode(currencyCode: java.lang.String): CurrencyFormatter
  def createCurrencyFormatterCodeContext(
    currencyCode: java.lang.String,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    geographicRegion: java.lang.String
  ): CurrencyFormatter
}

object ICurrencyFormatterFactory {
  @scala.inline
  def apply(
    createCurrencyFormatterCode: java.lang.String => CurrencyFormatter,
    createCurrencyFormatterCodeContext: (java.lang.String, winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], java.lang.String) => CurrencyFormatter
  ): ICurrencyFormatterFactory = {
    val __obj = js.Dynamic.literal(createCurrencyFormatterCode = js.Any.fromFunction1(createCurrencyFormatterCode), createCurrencyFormatterCodeContext = js.Any.fromFunction3(createCurrencyFormatterCodeContext))
  
    __obj.asInstanceOf[ICurrencyFormatterFactory]
  }
}

