package typings.wixDashStyleDashReact.buttonMod

import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var as: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataHook: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var prefixIcon: js.UndefOr[ReactElement] = js.undefined
  var priority: js.UndefOr[ButtonPriority] = js.undefined
  var size: js.UndefOr[ButtonSize] = js.undefined
  var skin: js.UndefOr[ButtonSkin] = js.undefined
  var suffixIcon: js.UndefOr[ReactElement] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    className: String = null,
    dataHook: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEventHandler[HTMLElement] = null,
    prefixIcon: ReactElement = null,
    priority: ButtonPriority = null,
    size: ButtonSize = null,
    skin: ButtonSkin = null,
    suffixIcon: ReactElement = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dataHook != null) __obj.updateDynamic("dataHook")(dataHook)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (prefixIcon != null) __obj.updateDynamic("prefixIcon")(prefixIcon)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (size != null) __obj.updateDynamic("size")(size)
    if (skin != null) __obj.updateDynamic("skin")(skin)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon)
    __obj.asInstanceOf[ButtonProps]
  }
}

