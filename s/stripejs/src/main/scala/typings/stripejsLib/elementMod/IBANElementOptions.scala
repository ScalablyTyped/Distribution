package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBANElementOptions extends BaseOptions {
  /**
    * Appearance of the icon in the Element
    */
  var iconStyle: js.UndefOr[stripejsLib.stripejsLibStrings.solid | stripejsLib.stripejsLibStrings.default] = js.undefined
  /**
    * Customize the country and format of the placeholder IBAN
    * @default 'DE"
    */
  var placeholderCountry: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the list of countries or country-groups whose IBANs you want to allow
    */
  var supportedCountries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IBANElementOptions {
  @scala.inline
  def apply(
    classes: stripejsLib.Anon_BaseCompleteEmpty = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hideIcon: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: stripejsLib.stripejsLibStrings.solid | stripejsLib.stripejsLibStrings.default = null,
    placeholderCountry: java.lang.String = null,
    style: stripejsLib.Anon_BaseCompleteEmptyInvalid = null,
    supportedCountries: js.Array[java.lang.String] = null
  ): IBANElementOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (placeholderCountry != null) __obj.updateDynamic("placeholderCountry")(placeholderCountry)
    if (style != null) __obj.updateDynamic("style")(style)
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries)
    __obj.asInstanceOf[IBANElementOptions]
  }
}

