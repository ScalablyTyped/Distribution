package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTelInputProps extends js.Object {
  
  var autocomplete: String = js.native
  
  var defaultCountry: String = js.native
  
  var disabled: Boolean = js.native
  
  var disabledFetchingCountry: Boolean = js.native
  
  var disabledFormatting: Boolean = js.native
  
  var dropdownOptions: VueTelInputDowndownOption = js.native
  
  var enabledCountryCode: Boolean = js.native
  
  var enabledFlags: Boolean = js.native
  
  var ignoredCountries: js.Array[_] = js.native
  
  var inputClasses: String = js.native
  
  var inputOptions: VueTelInputInputOption = js.native
  
  var invalidMsg: String = js.native
  
  var maxLen: Double = js.native
  
  var name: String = js.native
  
  var onlyCountries: js.Array[_] = js.native
  
  var placeholder: String = js.native
  
  var preferredCountries: Boolean = js.native
  
  var required: Boolean = js.native
  
  var value: String = js.native
  
  var wrapperClasses: String = js.native
}
object VueTelInputProps {
  
  @scala.inline
  def apply(
    autocomplete: String,
    defaultCountry: String,
    disabled: Boolean,
    disabledFetchingCountry: Boolean,
    disabledFormatting: Boolean,
    dropdownOptions: VueTelInputDowndownOption,
    enabledCountryCode: Boolean,
    enabledFlags: Boolean,
    ignoredCountries: js.Array[_],
    inputClasses: String,
    inputOptions: VueTelInputInputOption,
    invalidMsg: String,
    maxLen: Double,
    name: String,
    onlyCountries: js.Array[_],
    placeholder: String,
    preferredCountries: Boolean,
    required: Boolean,
    value: String,
    wrapperClasses: String
  ): VueTelInputProps = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], defaultCountry = defaultCountry.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledFetchingCountry = disabledFetchingCountry.asInstanceOf[js.Any], disabledFormatting = disabledFormatting.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any], enabledCountryCode = enabledCountryCode.asInstanceOf[js.Any], enabledFlags = enabledFlags.asInstanceOf[js.Any], ignoredCountries = ignoredCountries.asInstanceOf[js.Any], inputClasses = inputClasses.asInstanceOf[js.Any], inputOptions = inputOptions.asInstanceOf[js.Any], invalidMsg = invalidMsg.asInstanceOf[js.Any], maxLen = maxLen.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onlyCountries = onlyCountries.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], preferredCountries = preferredCountries.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], wrapperClasses = wrapperClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputProps]
  }
  
  @scala.inline
  implicit class VueTelInputPropsOps[Self <: VueTelInputProps] (val x: Self) extends AnyVal {
    
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
    def setAutocomplete(value: String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCountry(value: String): Self = this.set("defaultCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledFetchingCountry(value: Boolean): Self = this.set("disabledFetchingCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledFormatting(value: Boolean): Self = this.set("disabledFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownOptions(value: VueTelInputDowndownOption): Self = this.set("dropdownOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledCountryCode(value: Boolean): Self = this.set("enabledCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledFlags(value: Boolean): Self = this.set("enabledFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredCountriesVarargs(value: js.Any*): Self = this.set("ignoredCountries", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredCountries(value: js.Array[_]): Self = this.set("ignoredCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputClasses(value: String): Self = this.set("inputClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputOptions(value: VueTelInputInputOption): Self = this.set("inputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMsg(value: String): Self = this.set("invalidMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLen(value: Double): Self = this.set("maxLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyCountriesVarargs(value: js.Any*): Self = this.set("onlyCountries", js.Array(value :_*))
    
    @scala.inline
    def setOnlyCountries(value: js.Array[_]): Self = this.set("onlyCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredCountries(value: Boolean): Self = this.set("preferredCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperClasses(value: String): Self = this.set("wrapperClasses", value.asInstanceOf[js.Any])
  }
}
