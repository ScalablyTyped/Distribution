package typings.useDarkMode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkMode extends js.Object {
  val value: Boolean
  def disable(): Unit
  def enable(): Unit
  def toggle(): Unit
}

object DarkMode {
  @scala.inline
  def apply(disable: () => Unit, enable: () => Unit, toggle: () => Unit, value: Boolean): DarkMode = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), toggle = js.Any.fromFunction0(toggle), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DarkMode]
  }
}

