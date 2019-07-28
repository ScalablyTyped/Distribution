package typings.stripejs.elementMod

import typings.stripejs.stripejsStrings.auto
import typings.stripejs.stripejsStrings.da
import typings.stripejs.stripejsStrings.de
import typings.stripejs.stripejsStrings.en
import typings.stripejs.stripejsStrings.es
import typings.stripejs.stripejsStrings.fi
import typings.stripejs.stripejsStrings.fr
import typings.stripejs.stripejsStrings.it
import typings.stripejs.stripejsStrings.ja
import typings.stripejs.stripejsStrings.nl
import typings.stripejs.stripejsStrings.no
import typings.stripejs.stripejsStrings.sv
import typings.stripejs.stripejsStrings.zh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCreatorOptions extends js.Object {
  /**
    * Fonts that should be used for styling the element
    * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
    */
  var fonts: js.UndefOr[js.Array[FontCSSElement | FontConfigElement]] = js.undefined
  /**
    * The translation that should be used for the element text
    * `auto` defaults to the browser language
    *
    * @default 'auto'
    */
  var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String] = js.undefined
}

object ElementCreatorOptions {
  @scala.inline
  def apply(
    fonts: js.Array[FontCSSElement | FontConfigElement] = null,
    locale: auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String = null
  ): ElementCreatorOptions = {
    val __obj = js.Dynamic.literal()
    if (fonts != null) __obj.updateDynamic("fonts")(fonts)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCreatorOptions]
  }
}

