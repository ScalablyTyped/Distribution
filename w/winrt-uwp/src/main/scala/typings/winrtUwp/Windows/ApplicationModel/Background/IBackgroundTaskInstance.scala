package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a background task instance. */
@js.native
trait IBackgroundTaskInstance extends StObject {
  
  /**
    * Informs the system that the background task might continue to perform work after the IBackgroundTask.Run method returns.
    * @return A background task deferral.
    */
  def getDeferral(): BackgroundTaskDeferral = js.native
  
  /**
    * Retrieves the number of times the background task has been suspended for using too many resources.
    * @param counter Indicates the type of resource to include in the throttle count: network, CPU, or both.
    * @return This method returns the number of times the background task has been suspended for exceeding its quota of the indicated resource type.
    */
  def getThrottleCount(counter: BackgroundTaskThrottleCounter): Double = js.native
  
  /** Gets the instance ID of the background task instance. */
  var instanceId: String = js.native
  
  /** Gets or sets progress status for a background task instance. */
  var progress: Double = js.native
  
  /** Gets the number of times resource management policy caused the background task to be suspended. */
  var suspendedCount: Double = js.native
  
  /** Gets access to the registered background task for this background task instance. */
  var task: BackgroundTaskRegistration = js.native
  
  /** Gets additional information associated with a background task instance. */
  var triggerDetails: js.Any = js.native
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
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), getThrottleCount = js.Any.fromFunction1(getThrottleCount), instanceId = instanceId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], suspendedCount = suspendedCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], triggerDetails = triggerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskInstance]
  }
  
  @scala.inline
  implicit class IBackgroundTaskInstanceMutableBuilder[Self <: IBackgroundTaskInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => BackgroundTaskDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThrottleCount(value: BackgroundTaskThrottleCounter => Double): Self = StObject.set(x, "getThrottleCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedCount(value: Double): Self = StObject.set(x, "suspendedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: BackgroundTaskRegistration): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerDetails(value: js.Any): Self = StObject.set(x, "triggerDetails", value.asInstanceOf[js.Any])
  }
}
