package typings.vueI18n.mod.VueI18n

import typings.vueI18n.vueI18nStrings.decimal
import typings.vueI18n.vueI18nStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecificNumberFormatOptions
  extends typings.std.Intl.NumberFormatOptions
     with _NumberFormatOptions {
  
  @JSName("currencyDisplay")
  var currencyDisplay_SpecificNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.native
  
  var formatMatcher: js.UndefOr[FormatMatcher] = js.native
  
  @JSName("localeMatcher")
  var localeMatcher_SpecificNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.native
  
  @JSName("style")
  var style_SpecificNumberFormatOptions: js.UndefOr[decimal | percent] = js.native
}
object SpecificNumberFormatOptions {
  
  @scala.inline
  def apply(): SpecificNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecificNumberFormatOptions]
  }
  
  @scala.inline
  implicit class SpecificNumberFormatOptionsOps[Self <: SpecificNumberFormatOptions] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setStyle(value: decimal | percent): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
