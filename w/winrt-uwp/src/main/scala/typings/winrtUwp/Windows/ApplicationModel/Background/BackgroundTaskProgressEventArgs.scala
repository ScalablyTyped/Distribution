package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents progress information for a task at the time a progress update notification is sent. */
trait BackgroundTaskProgressEventArgs extends StObject {
  
  /** Gets the identifier of the background task instance for this progress status notification. */
  var instanceId: String
  
  /** Gets progress status for a background task instance. */
  var progress: Double
}
object BackgroundTaskProgressEventArgs {
  
  inline def apply(instanceId: String, progress: Double): BackgroundTaskProgressEventArgs = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskProgressEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundTaskProgressEventArgs] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
