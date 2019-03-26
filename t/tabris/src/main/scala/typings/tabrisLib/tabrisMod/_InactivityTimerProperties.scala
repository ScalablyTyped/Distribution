package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// InactivityTimer
trait _InactivityTimerProperties extends _NativeObjectProperties {
  /**
    * The interval of user inactivity that will trigger the timer. Given in milliseconds. Changes to this
    * property will not affect a running timer.
    */
  var delay: scala.Double
}

object _InactivityTimerProperties {
  @scala.inline
  def apply(delay: scala.Double): _InactivityTimerProperties = {
    val __obj = js.Dynamic.literal(delay = delay)
  
    __obj.asInstanceOf[_InactivityTimerProperties]
  }
}

