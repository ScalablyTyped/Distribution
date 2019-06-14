package typings
package winrtLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetAccountPictureResult extends js.Object

@JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
@js.native
object SetAccountPictureResult extends js.Object {
  @js.native
  sealed trait changeDisabled
    extends winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  @js.native
  sealed trait failure
    extends winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  @js.native
  sealed trait fileSizeError
    extends winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  @js.native
  sealed trait largeOrDynamicError
    extends winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  @js.native
  sealed trait success
    extends winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  @js.native
  sealed trait videoFrameSizeError
    extends winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult
  
  /* 1 */ val changeDisabled: changeDisabled with scala.Double = js.native
  /* 5 */ val failure: failure with scala.Double = js.native
  /* 4 */ val fileSizeError: fileSizeError with scala.Double = js.native
  /* 2 */ val largeOrDynamicError: largeOrDynamicError with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 3 */ val videoFrameSizeError: videoFrameSizeError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult with scala.Double
  ] = js.native
}

