package typings.winrtDashUwp.Windows.System.UserProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetAccountPictureResult extends js.Object

/** A result that is returned when you try to set the image for a user account. */
@JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
@js.native
object SetAccountPictureResult extends js.Object {
  /** Indicates that the picture was not set because the AccountPictureChangeEnabled property is disabled, or the user cancelled the consent prompt. */
  @js.native
  sealed trait changeDisabled extends SetAccountPictureResult
  
  /** Indicates the picture or video was not set. */
  @js.native
  sealed trait failure extends SetAccountPictureResult
  
  /** Indicates the picture was not set because the file size was too large. */
  @js.native
  sealed trait fileSizeError extends SetAccountPictureResult
  
  /** Indicates that the picture was not set because the picture was too large. */
  @js.native
  sealed trait largeOrDynamicError extends SetAccountPictureResult
  
  /** Indicates the picture was successfully set. */
  @js.native
  sealed trait success extends SetAccountPictureResult
  
  /** Indicates that the video was not set because of its frame size was too large. */
  @js.native
  sealed trait videoFrameSizeError extends SetAccountPictureResult
  
  /* 1 */ val changeDisabled: typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.changeDisabled with Double = js.native
  /* 5 */ val failure: typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.failure with Double = js.native
  /* 4 */ val fileSizeError: typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.fileSizeError with Double = js.native
  /* 2 */ val largeOrDynamicError: typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.largeOrDynamicError with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.success with Double = js.native
  /* 3 */ val videoFrameSizeError: typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.videoFrameSizeError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SetAccountPictureResult with Double] = js.native
}

