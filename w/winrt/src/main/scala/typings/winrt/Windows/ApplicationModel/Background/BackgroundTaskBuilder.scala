package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundTaskBuilder
  extends StObject
     with IBackgroundTaskBuilder
object BackgroundTaskBuilder {
  
  inline def apply(
    addCondition: IBackgroundCondition => Unit,
    name: String,
    register: () => BackgroundTaskRegistration,
    setTrigger: IBackgroundTrigger => Unit,
    taskEntryPoint: String
  ): BackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1(addCondition), name = name.asInstanceOf[js.Any], register = js.Any.fromFunction0(register), setTrigger = js.Any.fromFunction1(setTrigger), taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskBuilder]
  }
}
