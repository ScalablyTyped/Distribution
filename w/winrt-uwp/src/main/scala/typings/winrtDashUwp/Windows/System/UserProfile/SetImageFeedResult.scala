package typings.winrtDashUwp.Windows.System.UserProfile

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
  sealed trait changeDisabled extends SetImageFeedResult
  
  /** The image feed was set successfully. */
  @js.native
  sealed trait success extends SetImageFeedResult
  
  /** The operation was canceled by the user. */
  @js.native
  sealed trait userCanceled extends SetImageFeedResult
  
  /* 1 */ val changeDisabled: typings.winrtDashUwp.Windows.System.UserProfile.SetImageFeedResult.changeDisabled with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.Windows.System.UserProfile.SetImageFeedResult.success with Double = js.native
  /* 2 */ val userCanceled: typings.winrtDashUwp.Windows.System.UserProfile.SetImageFeedResult.userCanceled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SetImageFeedResult with Double] = js.native
}

