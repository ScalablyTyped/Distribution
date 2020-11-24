package typings.stripejs.elementMod

import typings.stripejs.stripejsStrings.default
import typings.stripejs.stripejsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBANElementOptions extends BaseOptions {
  
  /**
    * Appearance of the icon in the Element
    */
  var iconStyle: js.UndefOr[solid | default] = js.native
  
  /**
    * Customize the country and format of the placeholder IBAN
    * @default 'DE"
    */
  var placeholderCountry: js.UndefOr[String] = js.native
  
  /**
    * Specify the list of countries or country-groups whose IBANs you want to allow
    */
  var supportedCountries: js.UndefOr[js.Array[String]] = js.native
}
object IBANElementOptions {
  
  @scala.inline
  def apply(): IBANElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBANElementOptions]
  }
  
  @scala.inline
  implicit class IBANElementOptionsOps[Self <: IBANElementOptions] (val x: Self) extends AnyVal {
    
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
    def setIconStyle(value: solid | default): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    
    @scala.inline
    def setPlaceholderCountry(value: String): Self = this.set("placeholderCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderCountry: Self = this.set("placeholderCountry", js.undefined)
    
    @scala.inline
    def setSupportedCountriesVarargs(value: String*): Self = this.set("supportedCountries", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCountries(value: js.Array[String]): Self = this.set("supportedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCountries: Self = this.set("supportedCountries", js.undefined)
  }
}
