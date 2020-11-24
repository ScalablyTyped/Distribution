package typings.winrt.Windows.System.UserProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
