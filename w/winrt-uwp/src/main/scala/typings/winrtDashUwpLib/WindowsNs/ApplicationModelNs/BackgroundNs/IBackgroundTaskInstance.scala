package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a background task instance. */
trait IBackgroundTaskInstance extends js.Object {
  /** Gets the instance ID of the background task instance. */
  var instanceId: java.lang.String
  /** Gets or sets progress status for a background task instance. */
  var progress: scala.Double
  /** Gets the number of times resource management policy caused the background task to be suspended. */
  var suspendedCount: scala.Double
  /** Gets access to the registered background task for this background task instance. */
  var task: BackgroundTaskRegistration
  /** Gets additional information associated with a background task instance. */
  var triggerDetails: js.Any
  /**
    * Informs the system that the background task might continue to perform work after the IBackgroundTask.Run method returns.
    * @return A background task deferral.
    */
  def getDeferral(): BackgroundTaskDeferral
  /**
    * Retrieves the number of times the background task has been suspended for using too many resources.
    * @param counter Indicates the type of resource to include in the throttle count: network, CPU, or both.
    * @return This method returns the number of times the background task has been suspended for exceeding its quota of the indicated resource type.
    */
  def getThrottleCount(counter: BackgroundTaskThrottleCounter): scala.Double
}

object IBackgroundTaskInstance {
  @scala.inline
  def apply(
    getDeferral: js.Function0[BackgroundTaskDeferral],
    getThrottleCount: js.Function1[BackgroundTaskThrottleCounter, scala.Double],
    instanceId: java.lang.String,
    progress: scala.Double,
    suspendedCount: scala.Double,
    task: BackgroundTaskRegistration,
    triggerDetails: js.Any
  ): IBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDeferral")(getDeferral)
    __obj.updateDynamic("getThrottleCount")(getThrottleCount)
    __obj.updateDynamic("instanceId")(instanceId)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("suspendedCount")(suspendedCount)
    __obj.updateDynamic("task")(task)
    __obj.updateDynamic("triggerDetails")(triggerDetails)
    __obj.asInstanceOf[IBackgroundTaskInstance]
  }
}

