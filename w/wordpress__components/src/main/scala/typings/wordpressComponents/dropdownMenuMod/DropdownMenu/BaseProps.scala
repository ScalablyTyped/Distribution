package typings.wordpressComponents.dropdownMenuMod.DropdownMenu

import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.popoverMod.Popover.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  /**
    * A class name to apply to the dropdown wrapper element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The Dashicon icon slug to be shown in the collapsed menu button.
    * @defaultValue "menu"
    */
  var icon: js.UndefOr[Icon] = js.undefined
  /**
    * A human-readable label to present as accessibility text on the
    * focused collapsed menu button.
    */
  var label: String
  /**
    * A human-readable label to present as accessibility text on the
    * expanded menu container.
    * @defaultValue value of `label`
    */
  var menuLabel: js.UndefOr[String] = js.undefined
  /**
    * The direction in which the menu should open. Specify y- and x-axis
    * as a space-separated string.
    * @defaultValue "top center"
    */
  var position: js.UndefOr[Position] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    label: String,
    className: String = null,
    icon: Icon = null,
    menuLabel: String = null,
    position: Position = null
  ): BaseProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (menuLabel != null) __obj.updateDynamic("menuLabel")(menuLabel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

