package typings.winrt.WindowsNs.SystemNs.UserProfileNs

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
  
  /* 1 */ val changeDisabled: typings.winrt.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult.changeDisabled with Double = js.native
  /* 5 */ val failure: typings.winrt.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult.failure with Double = js.native
  /* 4 */ val fileSizeError: typings.winrt.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult.fileSizeError with Double = js.native
  /* 2 */ val largeOrDynamicError: typings.winrt.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult.largeOrDynamicError with Double = js.native
  /* 0 */ val success: typings.winrt.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult.success with Double = js.native
  /* 3 */ val videoFrameSizeError: typings.winrt.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult.videoFrameSizeError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SetAccountPictureResult with Double] = js.native
}

