package typings.stripejs.elementMod

import typings.stripejs.anon.Empty
import typings.stripejs.anon.Invalid
import typings.stripejs.stripejsStrings.default
import typings.stripejs.stripejsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardElementOptions extends BaseOptions {
  /**
    * Whether or not to hide the postal code
    * NOTE: If you are already collecting a full billing address or postal code elsewhere, set this to `true`
    * @default false
    */
  var hidePostalCode: js.UndefOr[Boolean] = js.undefined
  /**
    * Appearance of the icon in the Element
    */
  var iconStyle: js.UndefOr[solid | default] = js.undefined
  /**
    * A placeholder text
    * NOTE: This is only available for `cardNumber`, `cardExpiry` & `cardCvc` elements
    */
  var placeholder: js.UndefOr[String] = js.undefined
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
    classes: Empty = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    hidePostalCode: js.UndefOr[Boolean] = js.undefined,
    iconStyle: solid | default = null,
    placeholder: String = null,
    style: Invalid = null,
    value: js.Any = null
  ): CardElementOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePostalCode)) __obj.updateDynamic("hidePostalCode")(hidePostalCode.get.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardElementOptions]
  }
}

