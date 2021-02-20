package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTaskRegistration extends StObject {
  
  var name: String = js.native
  
  var oncompleted: js.Any = js.native
  
  var onprogress: js.Any = js.native
  
  var taskId: String = js.native
  
  def unregister(cancelTask: Boolean): Unit = js.native
}
object IBackgroundTaskRegistration {
  
  @scala.inline
  def apply(name: String, oncompleted: js.Any, onprogress: js.Any, taskId: String, unregister: Boolean => Unit): IBackgroundTaskRegistration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[IBackgroundTaskRegistration]
  }
  
  @scala.inline
  implicit class IBackgroundTaskRegistrationMutableBuilder[Self <: IBackgroundTaskRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncompleted(value: js.Any): Self = StObject.set(x, "oncompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprogress(value: js.Any): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregister(value: Boolean => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
  }
}
