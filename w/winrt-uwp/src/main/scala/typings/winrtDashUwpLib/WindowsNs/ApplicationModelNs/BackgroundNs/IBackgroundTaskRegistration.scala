package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a registered background task. */

trait IBackgroundTaskRegistration extends js.Object {
  /** Gets the name of a registered background task. */
  var name: java.lang.String
  /** Gets the identifier of a registered background task. */
  var taskId: java.lang.String
  /** Gets the trigger associated with the background task. */
  var trigger: IBackgroundTrigger
  /**
                   * Unregisters a registered background task.
                   * @param cancelTask True if currently running instances of this background task should be canceled. If this parameter is false, currently running instances of this background task should be allowed to finish. Canceled instances receive a Canceled event with a BackgroundTaskCancellationReason of Abort.
                   */
  def unregister(cancelTask: scala.Boolean): scala.Unit
}

