package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTaskCancellationReason extends js.Object
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCancellationReason")
@js.native
object BackgroundTaskCancellationReason extends js.Object {
  
  @js.native
  sealed trait abort extends BackgroundTaskCancellationReason
  
  @js.native
  sealed trait loggingOff extends BackgroundTaskCancellationReason
  
  @js.native
  sealed trait servicingUpdate extends BackgroundTaskCancellationReason
  
  @js.native
  sealed trait terminating extends BackgroundTaskCancellationReason
}
