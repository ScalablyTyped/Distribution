package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitOffcanvasElement extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object UIkitOffcanvasElement {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): UIkitOffcanvasElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[UIkitOffcanvasElement]
  }
}

