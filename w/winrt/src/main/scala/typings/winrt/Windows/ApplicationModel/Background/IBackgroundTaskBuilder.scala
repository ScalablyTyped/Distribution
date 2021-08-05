package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTaskBuilder extends StObject {
  
  def addCondition(condition: IBackgroundCondition): Unit
  
  var name: String
  
  def register(): BackgroundTaskRegistration
  
  def setTrigger(trigger: IBackgroundTrigger): Unit
  
  var taskEntryPoint: String
}
object IBackgroundTaskBuilder {
  
  inline def apply(
    addCondition: IBackgroundCondition => Unit,
    name: String,
    register: () => BackgroundTaskRegistration,
    setTrigger: IBackgroundTrigger => Unit,
    taskEntryPoint: String
  ): IBackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1(addCondition), name = name.asInstanceOf[js.Any], register = js.Any.fromFunction0(register), setTrigger = js.Any.fromFunction1(setTrigger), taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskBuilder]
  }
  
  extension [Self <: IBackgroundTaskBuilder](x: Self) {
    
    inline def setAddCondition(value: IBackgroundCondition => Unit): Self = StObject.set(x, "addCondition", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: () => BackgroundTaskRegistration): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
    
    inline def setSetTrigger(value: IBackgroundTrigger => Unit): Self = StObject.set(x, "setTrigger", js.Any.fromFunction1(value))
    
    inline def setTaskEntryPoint(value: String): Self = StObject.set(x, "taskEntryPoint", value.asInstanceOf[js.Any])
  }
}
