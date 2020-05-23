package typings.wordpressComponents.dropdownMenuMod.DropdownMenu

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typings.wordpressComponents.popoverMod.Popover.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren
  - typings.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def PropsWithChildren(
    children: RenderProps => Element,
    label: String,
    className: String = null,
    icon: Icon = null,
    menuLabel: String = null,
    position: Position = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (menuLabel != null) __obj.updateDynamic("menuLabel")(menuLabel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def PropsWithControls(
    controls: js.Array[Control],
    label: String,
    className: String = null,
    icon: Icon = null,
    menuLabel: String = null,
    position: Position = null
  ): Props = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (menuLabel != null) __obj.updateDynamic("menuLabel")(menuLabel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

