package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrencyFormatterFactory extends js.Object {
  def createCurrencyFormatterCode(currencyCode: String): CurrencyFormatter
  def createCurrencyFormatterCodeContext(currencyCode: String, languages: IIterable[String], geographicRegion: String): CurrencyFormatter
}

object ICurrencyFormatterFactory {
  @scala.inline
  def apply(
    createCurrencyFormatterCode: String => CurrencyFormatter,
    createCurrencyFormatterCodeContext: (String, IIterable[String], String) => CurrencyFormatter
  ): ICurrencyFormatterFactory = {
    val __obj = js.Dynamic.literal(createCurrencyFormatterCode = js.Any.fromFunction1(createCurrencyFormatterCode), createCurrencyFormatterCodeContext = js.Any.fromFunction3(createCurrencyFormatterCodeContext))
    __obj.asInstanceOf[ICurrencyFormatterFactory]
  }
}

