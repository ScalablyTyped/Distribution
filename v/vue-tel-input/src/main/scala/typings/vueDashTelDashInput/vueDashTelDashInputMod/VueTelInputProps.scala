package typings.vueDashTelDashInput.vueDashTelDashInputMod

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
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, defaultCountry = defaultCountry, disabled = disabled, disabledFetchingCountry = disabledFetchingCountry, disabledFormatting = disabledFormatting, dropdownOptions = dropdownOptions, enabledCountryCode = enabledCountryCode, enabledFlags = enabledFlags, ignoredCountries = ignoredCountries, inputClasses = inputClasses, inputOptions = inputOptions, invalidMsg = invalidMsg, maxLen = maxLen, name = name, onlyCountries = onlyCountries, placeholder = placeholder, preferredCountries = preferredCountries, required = required, value = value, wrapperClasses = wrapperClasses)
  
    __obj.asInstanceOf[VueTelInputProps]
  }
}

