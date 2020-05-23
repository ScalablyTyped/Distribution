package typings.webgme.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarDropDownButton extends ToolbarItem {
  def addButton(params: ToolbarParams): ToolbarButton
}

object ToolbarDropDownButton {
  @scala.inline
  def apply(
    addButton: ToolbarParams => ToolbarButton,
    destroy: () => Unit,
    enabled: Boolean => Unit,
    hide: () => Unit,
    show: () => Unit
  ): ToolbarDropDownButton = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton), destroy = js.Any.fromFunction0(destroy), enabled = js.Any.fromFunction1(enabled), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ToolbarDropDownButton]
  }
}

