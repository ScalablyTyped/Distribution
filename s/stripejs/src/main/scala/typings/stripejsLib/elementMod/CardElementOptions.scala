package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardElementOptions extends BaseOptions {
  /**
    * Whether or not to hide the postal code
    * NOTE: If you are already collecting a full billing address or postal code elsewhere, set this to `true`
    * @default false
    */
  var hidePostalCode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Appearance of the icon in the Element
    */
  var iconStyle: js.UndefOr[stripejsLib.stripejsLibStrings.solid | stripejsLib.stripejsLibStrings.default] = js.undefined
  /**
    * A placeholder text
    * NOTE: This is only available for `cardNumber`, `cardExpiry` & `cardCvc` elements
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A pre-filled value
    * NOTE: Sensitive card information (card number, CVC, and expiration date) cannot be pre-filled
    * @see placeholder
    *
    * @example {postalCode: '94110'}
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object CardElementOptions {
  @scala.inline
  def apply(
    classes: stripejsLib.Anon_BaseCompleteEmpty = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hideIcon: js.UndefOr[scala.Boolean] = js.undefined,
    hidePostalCode: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: stripejsLib.stripejsLibStrings.solid | stripejsLib.stripejsLibStrings.default = null,
    placeholder: java.lang.String = null,
    style: stripejsLib.Anon_BaseCompleteEmptyInvalid = null,
    value: js.Any = null
  ): CardElementOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon)
    if (!js.isUndefined(hidePostalCode)) __obj.updateDynamic("hidePostalCode")(hidePostalCode)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CardElementOptions]
  }
}

