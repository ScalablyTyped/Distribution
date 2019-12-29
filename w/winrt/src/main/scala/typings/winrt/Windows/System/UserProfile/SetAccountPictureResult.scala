package typings.winrt.Windows.System.UserProfile

import org.scalablytyped.runtime.TopLevel
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

