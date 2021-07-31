package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTaskCompletedEventArgs extends StObject {
  
  def checkResult(): Unit
  
  var instanceId: String
}
object IBackgroundTaskCompletedEventArgs {
  
  @scala.inline
  def apply(checkResult: () => Unit, instanceId: String): IBackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(checkResult = js.Any.fromFunction0(checkResult), instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskCompletedEventArgs]
  }
  
  @scala.inline
  implicit class IBackgroundTaskCompletedEventArgsMutableBuilder[Self <: IBackgroundTaskCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckResult(value: () => Unit): Self = StObject.set(x, "checkResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
  }
}
