package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task deferral returned by the IBackgroundTaskInstance.GetDeferral method. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskDeferral")
@js.native
abstract class BackgroundTaskDeferral () extends js.Object {
  /** Informs the system that an asynchronous operation associated with a background task has finished. */
  def complete(): Unit = js.native
}

