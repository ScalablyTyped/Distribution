package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTaskBuilder extends StObject {
  
  def addCondition(condition: IBackgroundCondition): Unit = js.native
  
  var name: String = js.native
  
  def register(): BackgroundTaskRegistration = js.native
  
  def setTrigger(trigger: IBackgroundTrigger): Unit = js.native
  
  var taskEntryPoint: String = js.native
}
object IBackgroundTaskBuilder {
  
  @scala.inline
  def apply(
    addCondition: IBackgroundCondition => Unit,
    name: String,
    register: () => BackgroundTaskRegistration,
    setTrigger: IBackgroundTrigger => Unit,
    taskEntryPoint: String
  ): IBackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1(addCondition), name = name.asInstanceOf[js.Any], register = js.Any.fromFunction0(register), setTrigger = js.Any.fromFunction1(setTrigger), taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskBuilder]
  }
  
  @scala.inline
  implicit class IBackgroundTaskBuilderMutableBuilder[Self <: IBackgroundTaskBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCondition(value: IBackgroundCondition => Unit): Self = StObject.set(x, "addCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: () => BackgroundTaskRegistration): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTrigger(value: IBackgroundTrigger => Unit): Self = StObject.set(x, "setTrigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTaskEntryPoint(value: String): Self = StObject.set(x, "taskEntryPoint", value.asInstanceOf[js.Any])
  }
}
