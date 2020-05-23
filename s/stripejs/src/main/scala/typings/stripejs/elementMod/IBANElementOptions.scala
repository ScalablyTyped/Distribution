package typings.stripejs.elementMod

import typings.stripejs.anon.Empty
import typings.stripejs.anon.Invalid
import typings.stripejs.stripejsStrings.default
import typings.stripejs.stripejsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBANElementOptions extends BaseOptions {
  /**
    * Appearance of the icon in the Element
    */
  var iconStyle: js.UndefOr[solid | default] = js.undefined
  /**
    * Customize the country and format of the placeholder IBAN
    * @default 'DE"
    */
  var placeholderCountry: js.UndefOr[String] = js.undefined
  /**
    * Specify the list of countries or country-groups whose IBANs you want to allow
    */
  var supportedCountries: js.UndefOr[js.Array[String]] = js.undefined
}

object IBANElementOptions {
  @scala.inline
  def apply(
    classes: Empty = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    iconStyle: solid | default = null,
    placeholderCountry: String = null,
    style: Invalid = null,
    supportedCountries: js.Array[String] = null
  ): IBANElementOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon.get.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (placeholderCountry != null) __obj.updateDynamic("placeholderCountry")(placeholderCountry.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBANElementOptions]
  }
}

