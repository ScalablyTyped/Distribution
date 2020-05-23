package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the stopped session watcher object. */
trait AllJoynWatcherStoppedEventArgs extends js.Object {
  /** Returns a status code that was returned when the watcher object is stopped. This value is represented by AllJoynStatus . */
  var status: Double
}

object AllJoynWatcherStoppedEventArgs {
  @scala.inline
  def apply(status: Double): AllJoynWatcherStoppedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynWatcherStoppedEventArgs]
  }
}

