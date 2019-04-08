package typings
package useDashDarkDashModeLib.useDashDarkDashModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkMode extends js.Object {
  /**
    * The current state of dark mode.
    */
  var value: scala.Boolean
  /**
    * A function that allows you to set dark mode to `false`.
    */
  def disable(): scala.Unit
  /**
    * A function that allows you to set dark mode to `true`.
    */
  def enable(): scala.Unit
  /**
    * A function that allows you to toggle dark mode.
    */
  def toggle(): scala.Unit
}

object DarkMode {
  @scala.inline
  def apply(
    disable: () => scala.Unit,
    enable: () => scala.Unit,
    toggle: () => scala.Unit,
    value: scala.Boolean
  ): DarkMode = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), toggle = js.Any.fromFunction0(toggle), value = value)
  
    __obj.asInstanceOf[DarkMode]
  }
}

