package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTaskCancellationReason extends StObject
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCancellationReason")
@js.native
object BackgroundTaskCancellationReason extends StObject {
  
  @js.native
  sealed trait abort
    extends StObject
       with BackgroundTaskCancellationReason
  
  @js.native
  sealed trait loggingOff
    extends StObject
       with BackgroundTaskCancellationReason
  
  @js.native
  sealed trait servicingUpdate
    extends StObject
       with BackgroundTaskCancellationReason
  
  @js.native
  sealed trait terminating
    extends StObject
       with BackgroundTaskCancellationReason
}
