package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitLightboxElement extends js.Object {
  def hide(): Unit
  def show(index: Double): Unit
}

object UIkitLightboxElement {
  @scala.inline
  def apply(hide: () => Unit, show: Double => Unit): UIkitLightboxElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[UIkitLightboxElement]
  }
}

