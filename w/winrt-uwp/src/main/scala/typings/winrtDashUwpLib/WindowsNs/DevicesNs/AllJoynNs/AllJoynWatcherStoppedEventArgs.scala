package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the stopped session watcher object. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynWatcherStoppedEventArgs")
@js.native
class AllJoynWatcherStoppedEventArgs protected () extends js.Object {
  /**
    * Generates an AllJoynWatcherStoppedEventArgs object that contains status information that identifies the reason the watcher object was stopped.
    * @param status The AllJoyn status code.
    */
  def this(status: scala.Double) = this()
  /** Returns a status code that was returned when the watcher object is stopped. This value is represented by AllJoynStatus . */
  var status: scala.Double = js.native
}

