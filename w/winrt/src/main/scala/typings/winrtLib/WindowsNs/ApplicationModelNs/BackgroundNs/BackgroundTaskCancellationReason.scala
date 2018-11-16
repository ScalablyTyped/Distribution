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
  
  val abort: abort with java.lang.String = js.native
  val loggingOff: loggingOff with java.lang.String = js.native
  val servicingUpdate: servicingUpdate with java.lang.String = js.native
  val terminating: terminating with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCancellationReason with java.lang.String
  ] = js.native
}

