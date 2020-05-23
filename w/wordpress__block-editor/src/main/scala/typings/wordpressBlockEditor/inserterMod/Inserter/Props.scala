package typings.wordpressBlockEditor.inserterMod.Inserter

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typings.wordpressComponents.popoverMod.Popover.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Pick<@wordpress/components.@wordpress/components.Dropdown.Props, 'position' | 'renderToggle'>> */
trait Props extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isAppender: js.UndefOr[Boolean] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var renderToggle: js.UndefOr[js.Function1[/* props */ RenderProps, Element]] = js.undefined
  var rootClientId: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    clientId: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isAppender: js.UndefOr[Boolean] = js.undefined,
    onToggle: /* isOpen */ Boolean => Unit = null,
    position: Position = null,
    renderToggle: /* props */ RenderProps => Element = null,
    rootClientId: String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAppender)) __obj.updateDynamic("isAppender")(isAppender.get.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (renderToggle != null) __obj.updateDynamic("renderToggle")(js.Any.fromFunction1(renderToggle))
    if (rootClientId != null) __obj.updateDynamic("rootClientId")(rootClientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

