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

@js.native
trait ElementCreatorOptions extends js.Object {
  /**
    * Fonts that should be used for styling the element
    * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
    */
  var fonts: js.UndefOr[js.Array[FontCSSElement | FontConfigElement]] = js.native
  /**
    * The translation that should be used for the element text
    * `auto` defaults to the browser language
    *
    * @default 'auto'
    */
  var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String] = js.native
}

object ElementCreatorOptions {
  @scala.inline
  def apply(): ElementCreatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementCreatorOptions]
  }
  @scala.inline
  implicit class ElementCreatorOptionsOps[Self <: ElementCreatorOptions] (val x: Self) extends AnyVal {
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
    def setFontsVarargs(value: (FontCSSElement | FontConfigElement)*): Self = this.set("fonts", js.Array(value :_*))
    @scala.inline
    def setFonts(value: js.Array[FontCSSElement | FontConfigElement]): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    @scala.inline
    def setLocale(value: auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
  
}

