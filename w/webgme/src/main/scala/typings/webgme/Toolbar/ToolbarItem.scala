package typings.webgme.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarItem extends js.Object {
  def destroy(): Unit
  def enabled(value: Boolean): Unit
  def hide(): Unit
  def show(): Unit
}

object ToolbarItem {
  @scala.inline
  def apply(destroy: () => Unit, enabled: Boolean => Unit, hide: () => Unit, show: () => Unit): ToolbarItem = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = js.Any.fromFunction1(enabled), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ToolbarItem]
  }
}

