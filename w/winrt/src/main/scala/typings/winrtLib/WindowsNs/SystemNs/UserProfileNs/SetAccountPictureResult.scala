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
  
  val changeDisabled: changeDisabled with java.lang.String = js.native
  val failure: failure with java.lang.String = js.native
  val fileSizeError: fileSizeError with java.lang.String = js.native
  val largeOrDynamicError: largeOrDynamicError with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val videoFrameSizeError: videoFrameSizeError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SystemNs.UserProfileNs.SetAccountPictureResult with java.lang.String
  ] = js.native
}

