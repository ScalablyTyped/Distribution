package typings.vueI18n.mod.VueI18n

import typings.vueI18n.vueI18nStrings.currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _NumberFormatOptions extends js.Object
object _NumberFormatOptions {
  
  @scala.inline
  def SpecificNumberFormatOptions(): _NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_NumberFormatOptions]
  }
  
  @scala.inline
  def CurrencyNumberFormatOptions(currency: String, style: currency): _NumberFormatOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NumberFormatOptions]
  }
}
