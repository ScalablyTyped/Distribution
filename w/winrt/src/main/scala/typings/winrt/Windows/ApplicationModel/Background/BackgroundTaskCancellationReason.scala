package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val abort: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.abort with Double = js.native
  /* 2 */ val loggingOff: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.loggingOff with Double = js.native
  /* 3 */ val servicingUpdate: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.servicingUpdate with Double = js.native
  /* 1 */ val terminating: typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.terminating with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTaskCancellationReason with Double] = js.native
}

