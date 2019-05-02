package typings
package vueDashTelDashInputLib.vueDashTelDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputProps extends js.Object {
  var autocomplete: java.lang.String
  var defaultCountry: java.lang.String
  var disabled: scala.Boolean
  var disabledFetchingCountry: scala.Boolean
  var disabledFormatting: scala.Boolean
  var dropdownOptions: VueTelInputDowndownOption
  var enabledCountryCode: scala.Boolean
  var enabledFlags: scala.Boolean
  var ignoredCountries: js.Array[_]
  var inputClasses: java.lang.String
  var inputOptions: VueTelInputInputOption
  var invalidMsg: java.lang.String
  var maxLen: scala.Double
  var name: java.lang.String
  var onlyCountries: js.Array[_]
  var placeholder: java.lang.String
  var preferredCountries: scala.Boolean
  var required: scala.Boolean
  var value: java.lang.String
  var wrapperClasses: java.lang.String
}

object VueTelInputProps {
  @scala.inline
  def apply(
    autocomplete: java.lang.String,
    defaultCountry: java.lang.String,
    disabled: scala.Boolean,
    disabledFetchingCountry: scala.Boolean,
    disabledFormatting: scala.Boolean,
    dropdownOptions: VueTelInputDowndownOption,
    enabledCountryCode: scala.Boolean,
    enabledFlags: scala.Boolean,
    ignoredCountries: js.Array[_],
    inputClasses: java.lang.String,
    inputOptions: VueTelInputInputOption,
    invalidMsg: java.lang.String,
    maxLen: scala.Double,
    name: java.lang.String,
    onlyCountries: js.Array[_],
    placeholder: java.lang.String,
    preferredCountries: scala.Boolean,
    required: scala.Boolean,
    value: java.lang.String,
    wrapperClasses: java.lang.String
  ): VueTelInputProps = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, defaultCountry = defaultCountry, disabled = disabled, disabledFetchingCountry = disabledFetchingCountry, disabledFormatting = disabledFormatting, dropdownOptions = dropdownOptions, enabledCountryCode = enabledCountryCode, enabledFlags = enabledFlags, ignoredCountries = ignoredCountries, inputClasses = inputClasses, inputOptions = inputOptions, invalidMsg = invalidMsg, maxLen = maxLen, name = name, onlyCountries = onlyCountries, placeholder = placeholder, preferredCountries = preferredCountries, required = required, value = value, wrapperClasses = wrapperClasses)
  
    __obj.asInstanceOf[VueTelInputProps]
  }
}

