package typings.wordpressComponents.dropdownMenuMod.DropdownMenu

import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.popoverMod.Popover.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithControls
  extends BaseProps
     with Props {
  /**
    * An array of objects describing the options to be shown in the
    * expanded menu.
    */
  var controls: js.Array[Control]
}

object PropsWithControls {
  @scala.inline
  def apply(
    controls: js.Array[Control],
    label: String,
    className: String = null,
    icon: Icon = null,
    menuLabel: String = null,
    position: Position = null
  ): PropsWithControls = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (menuLabel != null) __obj.updateDynamic("menuLabel")(menuLabel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithControls]
  }
}

