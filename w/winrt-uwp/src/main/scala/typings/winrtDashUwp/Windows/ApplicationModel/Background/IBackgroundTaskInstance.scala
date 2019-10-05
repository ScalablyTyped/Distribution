package typings.winrtDashUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a background task instance. */
trait IBackgroundTaskInstance extends js.Object {
  /** Gets the instance ID of the background task instance. */
  var instanceId: String
  /** Gets or sets progress status for a background task instance. */
  var progress: Double
  /** Gets the number of times resource management policy caused the background task to be suspended. */
  var suspendedCount: Double
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
  def getThrottleCount(counter: BackgroundTaskThrottleCounter): Double
}

object IBackgroundTaskInstance {
  @scala.inline
  def apply(
    getDeferral: () => BackgroundTaskDeferral,
    getThrottleCount: BackgroundTaskThrottleCounter => Double,
    instanceId: String,
    progress: Double,
    suspendedCount: Double,
    task: BackgroundTaskRegistration,
    triggerDetails: js.Any
  ): IBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), getThrottleCount = js.Any.fromFunction1(getThrottleCount), instanceId = instanceId, progress = progress, suspendedCount = suspendedCount, task = task, triggerDetails = triggerDetails)
  
    __obj.asInstanceOf[IBackgroundTaskInstance]
  }
}

