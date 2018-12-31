package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCreatorOptions extends js.Object {
  /**
    * Fonts that should be used for styling the element
    * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
    */
  var fonts: js.UndefOr[js.Array[FontCSSElement] | js.Array[FontConfigElement]] = js.undefined
  /**
    * The translation that should be used for the element text
    * `auto` defaults to the browser language
    *
    * @default 'auto'
    */
  var locale: js.UndefOr[
    stripejsLib.stripejsLibStrings.auto | stripejsLib.stripejsLibStrings.da | stripejsLib.stripejsLibStrings.de | stripejsLib.stripejsLibStrings.en | stripejsLib.stripejsLibStrings.es | stripejsLib.stripejsLibStrings.fi | stripejsLib.stripejsLibStrings.fr | stripejsLib.stripejsLibStrings.it | stripejsLib.stripejsLibStrings.ja | stripejsLib.stripejsLibStrings.no | stripejsLib.stripejsLibStrings.nl | stripejsLib.stripejsLibStrings.sv | stripejsLib.stripejsLibStrings.zh | java.lang.String
  ] = js.undefined
}

