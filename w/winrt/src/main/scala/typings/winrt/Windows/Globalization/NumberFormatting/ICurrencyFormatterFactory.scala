package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICurrencyFormatterFactory extends js.Object {
  
  def createCurrencyFormatterCode(currencyCode: String): CurrencyFormatter = js.native
  
  def createCurrencyFormatterCodeContext(currencyCode: String, languages: IIterable[String], geographicRegion: String): CurrencyFormatter = js.native
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
  
  @scala.inline
  implicit class ICurrencyFormatterFactoryOps[Self <: ICurrencyFormatterFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateCurrencyFormatterCode(value: String => CurrencyFormatter): Self = this.set("createCurrencyFormatterCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateCurrencyFormatterCodeContext(value: (String, IIterable[String], String) => CurrencyFormatter): Self = this.set("createCurrencyFormatterCodeContext", js.Any.fromFunction3(value))
  }
}
