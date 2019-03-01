package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentRequestButtonStyle extends js.Object {
  /**
    * The height of the button
    * @example '25px'
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The theme of the button that should be used
    * @default 'dark'
    */
  var theme: js.UndefOr[
    stripejsLib.stripejsLibStrings.dark | stripejsLib.stripejsLibStrings.light | stripejsLib.stripejsLibStrings.`light-outline`
  ] = js.undefined
  /**
    * The type of button that should be shown
    * @default 'default'
    */
  var `type`: js.UndefOr[
    stripejsLib.stripejsLibStrings.default | stripejsLib.stripejsLibStrings.donate | stripejsLib.stripejsLibStrings.buy
  ] = js.undefined
}

object PaymentRequestButtonStyle {
  @scala.inline
  def apply(
    height: java.lang.String = null,
    theme: stripejsLib.stripejsLibStrings.dark | stripejsLib.stripejsLibStrings.light | stripejsLib.stripejsLibStrings.`light-outline` = null,
    `type`: stripejsLib.stripejsLibStrings.default | stripejsLib.stripejsLibStrings.donate | stripejsLib.stripejsLibStrings.buy = null
  ): PaymentRequestButtonStyle = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestButtonStyle]
  }
}

