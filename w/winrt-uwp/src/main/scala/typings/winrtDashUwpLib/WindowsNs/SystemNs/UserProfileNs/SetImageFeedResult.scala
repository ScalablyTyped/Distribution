package typings
package winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetImageFeedResult extends js.Object

/** Specifies the result of a call to LockScreen.RequestSetImageFeedAsync */
@JSGlobal("Windows.System.UserProfile.SetImageFeedResult")
@js.native
object SetImageFeedResult extends js.Object {
  /** The feed was not set because the lock screen image slide show is disabled by group policy. */
  @js.native
  sealed trait changeDisabled
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetImageFeedResult
  
  /** The image feed was set successfully. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetImageFeedResult
  
  /** The operation was canceled by the user. */
  @js.native
  sealed trait userCanceled
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetImageFeedResult
  
  /* 1 */ val changeDisabled: changeDisabled with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 2 */ val userCanceled: userCanceled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetImageFeedResult with scala.Double
  ] = js.native
}

