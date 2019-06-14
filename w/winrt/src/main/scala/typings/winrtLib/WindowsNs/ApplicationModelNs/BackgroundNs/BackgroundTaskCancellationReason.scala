package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTaskCancellationReason extends js.Object

@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCancellationReason")
@js.native
object BackgroundTaskCancellationReason extends js.Object {
  @js.native
  sealed trait abort
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCancellationReason
  
  @js.native
  sealed trait loggingOff
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCancellationReason
  
  @js.native
  sealed trait servicingUpdate
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCancellationReason
  
  @js.native
  sealed trait terminating
    extends winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCancellationReason
  
  /* 0 */ val abort: abort with scala.Double = js.native
  /* 2 */ val loggingOff: loggingOff with scala.Double = js.native
  /* 3 */ val servicingUpdate: servicingUpdate with scala.Double = js.native
  /* 1 */ val terminating: terminating with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCancellationReason with scala.Double
  ] = js.native
}

