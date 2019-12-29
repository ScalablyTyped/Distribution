package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToastDismissalReason extends js.Object

@JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
@js.native
object ToastDismissalReason extends js.Object {
  @js.native
  sealed trait applicationHidden extends ToastDismissalReason
  
  @js.native
  sealed trait timedOut extends ToastDismissalReason
  
  @js.native
  sealed trait userCanceled extends ToastDismissalReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToastDismissalReason with Double] = js.native
  /* 1 */ @js.native
  object applicationHidden extends TopLevel[applicationHidden with Double]
  
  /* 2 */ @js.native
  object timedOut extends TopLevel[timedOut with Double]
  
  /* 0 */ @js.native
  object userCanceled extends TopLevel[userCanceled with Double]
  
}

