package typings.wordpressComponents.toggleControlMod.ToggleControl

import typings.react.mod.ReactNode
import typings.wordpressComponents.baseControlMod.BaseControl.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends ControlProps {
  /**
    * If checked is `true` the toggle will be checked. If checked is
    * `false` the toggle will be unchecked. If no value is passed the
    * toggle will be unchecked.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that receives the checked state as input.
    */
  var onChange: js.UndefOr[js.Function1[/* isChecked */ Boolean, Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    help: ReactNode = null,
    hideLabelFromVision: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    onChange: /* isChecked */ Boolean => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabelFromVision)) __obj.updateDynamic("hideLabelFromVision")(hideLabelFromVision.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Props]
  }
}

