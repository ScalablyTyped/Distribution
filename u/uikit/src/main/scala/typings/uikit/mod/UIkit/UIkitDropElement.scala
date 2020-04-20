package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitDropElement extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object UIkitDropElement {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): UIkitDropElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[UIkitDropElement]
  }
}

