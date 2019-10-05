package typings.winrt.Windows.System.UserProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetAccountPictureResult extends js.Object

@JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
@js.native
object SetAccountPictureResult extends js.Object {
  @js.native
  sealed trait changeDisabled extends SetAccountPictureResult
  
  @js.native
  sealed trait failure extends SetAccountPictureResult
  
  @js.native
  sealed trait fileSizeError extends SetAccountPictureResult
  
  @js.native
  sealed trait largeOrDynamicError extends SetAccountPictureResult
  
  @js.native
  sealed trait success extends SetAccountPictureResult
  
  @js.native
  sealed trait videoFrameSizeError extends SetAccountPictureResult
  
  /* 1 */ val changeDisabled: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.changeDisabled with Double = js.native
  /* 5 */ val failure: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.failure with Double = js.native
  /* 4 */ val fileSizeError: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.fileSizeError with Double = js.native
  /* 2 */ val largeOrDynamicError: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.largeOrDynamicError with Double = js.native
  /* 0 */ val success: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.success with Double = js.native
  /* 3 */ val videoFrameSizeError: typings.winrt.Windows.System.UserProfile.SetAccountPictureResult.videoFrameSizeError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SetAccountPictureResult with Double] = js.native
}

