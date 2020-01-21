package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents completion information for a task at the time a completion notification is sent. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCompletedEventArgs")
@js.native
abstract class BackgroundTaskCompletedEventArgs () extends js.Object {
  /** Gets the identifier of the background task instance for this completion status notification. */
  var instanceId: String = js.native
  /** Throws an exception if the background task completed event has reported an error. */
  def checkResult(): Unit = js.native
}

