package typings.useDashDarkDashMode.useDashDarkDashModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkMode extends js.Object {
  /**
    * The current state of dark mode.
    */
  var value: Boolean
  /**
    * A function that allows you to set dark mode to `false`.
    */
  def disable(): Unit
  /**
    * A function that allows you to set dark mode to `true`.
    */
  def enable(): Unit
  /**
    * A function that allows you to toggle dark mode.
    */
  def toggle(): Unit
}

object DarkMode {
  @scala.inline
  def apply(disable: () => Unit, enable: () => Unit, toggle: () => Unit, value: Boolean): DarkMode = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), toggle = js.Any.fromFunction0(toggle), value = value)
  
    __obj.asInstanceOf[DarkMode]
  }
}

