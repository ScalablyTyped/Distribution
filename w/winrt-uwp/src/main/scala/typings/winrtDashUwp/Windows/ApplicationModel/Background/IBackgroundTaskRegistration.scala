package typings.winrtDashUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a registered background task. */
trait IBackgroundTaskRegistration extends js.Object {
  /** Gets the name of a registered background task. */
  var name: String
  /** Gets the identifier of a registered background task. */
  var taskId: String
  /** Gets the trigger associated with the background task. */
  var trigger: IBackgroundTrigger
  /**
    * Unregisters a registered background task.
    * @param cancelTask True if currently running instances of this background task should be canceled. If this parameter is false, currently running instances of this background task should be allowed to finish. Canceled instances receive a Canceled event with a BackgroundTaskCancellationReason of Abort.
    */
  def unregister(cancelTask: Boolean): Unit
}

object IBackgroundTaskRegistration {
  @scala.inline
  def apply(name: String, taskId: String, trigger: IBackgroundTrigger, unregister: Boolean => Unit): IBackgroundTaskRegistration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[IBackgroundTaskRegistration]
  }
}

