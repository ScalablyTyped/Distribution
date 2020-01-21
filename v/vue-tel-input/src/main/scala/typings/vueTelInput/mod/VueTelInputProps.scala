package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputProps extends js.Object {
  var autocomplete: String
  var defaultCountry: String
  var disabled: Boolean
  var disabledFetchingCountry: Boolean
  var disabledFormatting: Boolean
  var dropdownOptions: VueTelInputDowndownOption
  var enabledCountryCode: Boolean
  var enabledFlags: Boolean
  var ignoredCountries: js.Array[_]
  var inputClasses: String
  var inputOptions: VueTelInputInputOption
  var invalidMsg: String
  var maxLen: Double
  var name: String
  var onlyCountries: js.Array[_]
  var placeholder: String
  var preferredCountries: Boolean
  var required: Boolean
  var value: String
  var wrapperClasses: String
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
}

