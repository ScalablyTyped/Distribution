package typings.wordpressComponents.dropdownMenuMod.DropdownMenu

import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.popoverMod.Popover.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProps extends js.Object {
  /**
    * A class name to apply to the dropdown wrapper element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The Dashicon icon slug to be shown in the collapsed menu button.
    * @defaultValue "menu"
    */
  var icon: js.UndefOr[Icon] = js.native
  /**
    * A human-readable label to present as accessibility text on the
    * focused collapsed menu button.
    */
  var label: String = js.native
  /**
    * A human-readable label to present as accessibility text on the
    * expanded menu container.
    * @defaultValue value of `label`
    */
  var menuLabel: js.UndefOr[String] = js.native
  /**
    * The direction in which the menu should open. Specify y- and x-axis
    * as a space-separated string.
    * @defaultValue "top center"
    */
  var position: js.UndefOr[Position] = js.native
}

object BaseProps {
  @scala.inline
  def apply(label: String): BaseProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMenuLabel(value: String): Self = this.set("menuLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuLabel: Self = this.set("menuLabel", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

