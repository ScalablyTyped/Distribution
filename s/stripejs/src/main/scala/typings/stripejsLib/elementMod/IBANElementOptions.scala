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

