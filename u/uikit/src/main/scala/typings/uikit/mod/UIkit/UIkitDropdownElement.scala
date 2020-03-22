package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitDropdownElement extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object UIkitDropdownElement {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): UIkitDropdownElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[UIkitDropdownElement]
  }
}

