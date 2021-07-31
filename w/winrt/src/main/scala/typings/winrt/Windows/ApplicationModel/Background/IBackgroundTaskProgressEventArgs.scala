package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTaskProgressEventArgs extends StObject {
  
  var instanceId: String
  
  var progress: Double
}
object IBackgroundTaskProgressEventArgs {
  
  @scala.inline
  def apply(instanceId: String, progress: Double): IBackgroundTaskProgressEventArgs = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskProgressEventArgs]
  }
  
  @scala.inline
  implicit class IBackgroundTaskProgressEventArgsMutableBuilder[Self <: IBackgroundTaskProgressEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
