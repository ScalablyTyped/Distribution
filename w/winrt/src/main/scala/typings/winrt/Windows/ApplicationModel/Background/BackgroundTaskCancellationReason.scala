package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.abort
import typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.loggingOff
import typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.servicingUpdate
import typings.winrt.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.terminating
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTaskCancellationReason with Double] = js.native
  /* 0 */ @js.native
  object abort extends TopLevel[abort with Double]
  
  /* 2 */ @js.native
  object loggingOff extends TopLevel[loggingOff with Double]
  
  /* 3 */ @js.native
  object servicingUpdate extends TopLevel[servicingUpdate with Double]
  
  /* 1 */ @js.native
  object terminating extends TopLevel[terminating with Double]
  
}

