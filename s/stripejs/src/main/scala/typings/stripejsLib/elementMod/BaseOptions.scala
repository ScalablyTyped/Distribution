package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * Set custom class names on the container DOM element when the Stripe Element is in a
    * particular state.
    */
  var classes: js.UndefOr[stripejsLib.Anon_BaseCompleteEmpty] = js.undefined
  /**
    * Whether or not the input is disabled
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not the icon should be hidden
    * @default false
    */
  var hideIcon: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Customize appearance using CSS properties
    */
  var style: js.UndefOr[stripejsLib.Anon_BaseCompleteEmptyInvalid] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    classes: stripejsLib.Anon_BaseCompleteEmpty = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hideIcon: js.UndefOr[scala.Boolean] = js.undefined,
    style: stripejsLib.Anon_BaseCompleteEmptyInvalid = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BaseOptions]
  }
}

