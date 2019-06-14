package typings
package winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs

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
  sealed trait changeDisabled
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  /** Indicates the picture or video was not set. */
  @js.native
  sealed trait failure
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  /** Indicates the picture was not set because the file size was too large. */
  @js.native
  sealed trait fileSizeError
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  /** Indicates that the picture was not set because the picture was too large. */
  @js.native
  sealed trait largeOrDynamicError
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  /** Indicates the picture was successfully set. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  /** Indicates that the video was not set because of its frame size was too large. */
  @js.native
  sealed trait videoFrameSizeError
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  /* 1 */ val changeDisabled: changeDisabled with scala.Double = js.native
  /* 5 */ val failure: failure with scala.Double = js.native
  /* 4 */ val fileSizeError: fileSizeError with scala.Double = js.native
  /* 2 */ val largeOrDynamicError: largeOrDynamicError with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 3 */ val videoFrameSizeError: videoFrameSizeError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult with scala.Double
  ] = js.native
}

