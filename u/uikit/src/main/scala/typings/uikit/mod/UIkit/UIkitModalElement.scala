package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitModalElement extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object UIkitModalElement {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): UIkitModalElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[UIkitModalElement]
  }
}

