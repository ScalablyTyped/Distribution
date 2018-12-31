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

