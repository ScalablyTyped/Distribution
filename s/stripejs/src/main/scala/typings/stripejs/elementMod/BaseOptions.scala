package typings.stripejs.elementMod

import typings.stripejs.AnonEmpty
import typings.stripejs.AnonInvalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * Set custom class names on the container DOM element when the Stripe Element is in a
    * particular state.
    */
  var classes: js.UndefOr[AnonEmpty] = js.undefined
  /**
    * Whether or not the input is disabled
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the icon should be hidden
    * @default false
    */
  var hideIcon: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize appearance using CSS properties
    */
  var style: js.UndefOr[AnonInvalid] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    classes: AnonEmpty = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    style: AnonInvalid = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

