package typings.winrtDashUwp.Windows.System.UserProfile

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.changeDisabled
import typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.failure
import typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.fileSizeError
import typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.largeOrDynamicError
import typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.success
import typings.winrtDashUwp.Windows.System.UserProfile.SetAccountPictureResult.videoFrameSizeError
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SetAccountPictureResult with Double] = js.native
  /* 1 */ @js.native
  object changeDisabled extends TopLevel[changeDisabled with Double]
  
  /* 5 */ @js.native
  object failure extends TopLevel[failure with Double]
  
  /* 4 */ @js.native
  object fileSizeError extends TopLevel[fileSizeError with Double]
  
  /* 2 */ @js.native
  object largeOrDynamicError extends TopLevel[largeOrDynamicError with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 3 */ @js.native
  object videoFrameSizeError extends TopLevel[videoFrameSizeError with Double]
  
}

