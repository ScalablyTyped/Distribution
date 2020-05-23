package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the stopped session watcher object. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynWatcherStoppedEventArgs")
@js.native
class AllJoynWatcherStoppedEventArgs protected ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynWatcherStoppedEventArgs {
  /**
    * Generates an AllJoynWatcherStoppedEventArgs object that contains status information that identifies the reason the watcher object was stopped.
    * @param status The AllJoyn status code.
    */
  def this(status: Double) = this()
  /** Returns a status code that was returned when the watcher object is stopped. This value is represented by AllJoynStatus . */
  /* CompleteClass */
  override var status: Double = js.native
}

