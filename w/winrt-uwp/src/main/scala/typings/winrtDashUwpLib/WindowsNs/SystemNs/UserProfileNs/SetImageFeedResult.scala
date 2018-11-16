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
  
  val changeDisabled: changeDisabled with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val userCanceled: userCanceled with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetImageFeedResult with java.lang.String
  ] = js.native
}

