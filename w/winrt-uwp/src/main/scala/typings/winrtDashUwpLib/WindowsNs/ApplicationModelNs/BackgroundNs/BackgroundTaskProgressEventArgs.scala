package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents progress information for a task at the time a progress update notification is sent. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs")
@js.native
abstract class BackgroundTaskProgressEventArgs () extends js.Object {
  /** Gets the identifier of the background task instance for this progress status notification. */
  var instanceId: java.lang.String = js.native
  /** Gets progress status for a background task instance. */
  var progress: scala.Double = js.native
}

