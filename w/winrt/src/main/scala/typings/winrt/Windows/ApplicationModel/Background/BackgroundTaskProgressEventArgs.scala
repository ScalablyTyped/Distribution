package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundTaskProgressEventArgs
  extends StObject
     with IBackgroundTaskProgressEventArgs
object BackgroundTaskProgressEventArgs {
  
  @scala.inline
  def apply(instanceId: String, progress: Double): BackgroundTaskProgressEventArgs = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskProgressEventArgs]
  }
}
