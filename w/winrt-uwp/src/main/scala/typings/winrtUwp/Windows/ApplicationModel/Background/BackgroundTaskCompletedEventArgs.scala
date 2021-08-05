package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents completion information for a task at the time a completion notification is sent. */
trait BackgroundTaskCompletedEventArgs extends StObject {
  
  /** Throws an exception if the background task completed event has reported an error. */
  def checkResult(): Unit
  
  /** Gets the identifier of the background task instance for this completion status notification. */
  var instanceId: String
}
object BackgroundTaskCompletedEventArgs {
  
  inline def apply(checkResult: () => Unit, instanceId: String): BackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(checkResult = js.Any.fromFunction0(checkResult), instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskCompletedEventArgs]
  }
  
  extension [Self <: BackgroundTaskCompletedEventArgs](x: Self) {
    
    inline def setCheckResult(value: () => Unit): Self = StObject.set(x, "checkResult", js.Any.fromFunction0(value))
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
  }
}
