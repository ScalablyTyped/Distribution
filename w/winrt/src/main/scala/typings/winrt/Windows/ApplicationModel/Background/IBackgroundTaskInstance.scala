package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTaskInstance extends StObject {
  
  def getDeferral(): BackgroundTaskDeferral = js.native
  
  var instanceId: String = js.native
  
  var oncanceled: js.Any = js.native
  
  var progress: Double = js.native
  
  var suspendedCount: Double = js.native
  
  var task: BackgroundTaskRegistration = js.native
  
  var triggerDetails: js.Any = js.native
}
object IBackgroundTaskInstance {
  
  @scala.inline
  def apply(
    getDeferral: () => BackgroundTaskDeferral,
    instanceId: String,
    oncanceled: js.Any,
    progress: Double,
    suspendedCount: Double,
    task: BackgroundTaskRegistration,
    triggerDetails: js.Any
  ): IBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), instanceId = instanceId.asInstanceOf[js.Any], oncanceled = oncanceled.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], suspendedCount = suspendedCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], triggerDetails = triggerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskInstance]
  }
  
  @scala.inline
  implicit class IBackgroundTaskInstanceMutableBuilder[Self <: IBackgroundTaskInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => BackgroundTaskDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncanceled(value: js.Any): Self = StObject.set(x, "oncanceled", value.asInstanceOf[js.Any])
    
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
