package typings.stripejs.elementMod

import typings.stripejs.stripejsStrings.default
import typings.stripejs.stripejsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardElementOptions extends BaseOptions {
  /**
    * Whether or not to hide the postal code
    * NOTE: If you are already collecting a full billing address or postal code elsewhere, set this to `true`
    * @default false
    */
  var hidePostalCode: js.UndefOr[Boolean] = js.native
  /**
    * Appearance of the icon in the Element
    */
  var iconStyle: js.UndefOr[solid | default] = js.native
  /**
    * A placeholder text
    * NOTE: This is only available for `cardNumber`, `cardExpiry` & `cardCvc` elements
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * A pre-filled value
    * NOTE: Sensitive card information (card number, CVC, and expiration date) cannot be pre-filled
    * @see placeholder
    *
    * @example {postalCode: '94110'}
    */
  var value: js.UndefOr[js.Any] = js.native
}

object CardElementOptions {
  @scala.inline
  def apply(): CardElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardElementOptions]
  }
  @scala.inline
  implicit class CardElementOptionsOps[Self <: CardElementOptions] (val x: Self) extends AnyVal {
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
    def setHidePostalCode(value: Boolean): Self = this.set("hidePostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePostalCode: Self = this.set("hidePostalCode", js.undefined)
    @scala.inline
    def setIconStyle(value: solid | default): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

