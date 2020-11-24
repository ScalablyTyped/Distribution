package typings.vueI18n.mod.VueI18n

import typings.vueI18n.vueI18nStrings.currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyNumberFormatOptions
  extends typings.std.Intl.NumberFormatOptions
     with _NumberFormatOptions {
  
   // Obligatory if style is 'currency'
  @JSName("currencyDisplay")
  var currencyDisplay_CurrencyNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.native
  
  @JSName("currency")
  var currency_CurrencyNumberFormatOptions: String = js.native
  
  var formatMatcher: js.UndefOr[FormatMatcher] = js.native
  
  @JSName("localeMatcher")
  var localeMatcher_CurrencyNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.native
  
  @JSName("style")
  var style_CurrencyNumberFormatOptions: currency = js.native
}
object CurrencyNumberFormatOptions {
  
  @scala.inline
  def apply(currency: String, style: currency): CurrencyNumberFormatOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyNumberFormatOptions]
  }
  
  @scala.inline
  implicit class CurrencyNumberFormatOptionsOps[Self <: CurrencyNumberFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: currency): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplay(value: CurrencyDisplay): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyDisplay: Self = this.set("currencyDisplay", js.undefined)
    
    @scala.inline
    def setFormatMatcher(value: FormatMatcher): Self = this.set("formatMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatMatcher: Self = this.set("formatMatcher", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: LocaleMatcher): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
  }
}
