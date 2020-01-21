package typings.winrtUwp.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetFileNameResult extends js.Object

/** Indicates the result of a call to the fileSavePickerUI.trySetFileName method. */
@JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
@js.native
object SetFileNameResult extends js.Object {
  /** The file name and extension were not updated because the extension wasn't one of the allowedFileTypes . */
  @js.native
  sealed trait notAllowed extends SetFileNameResult
  
  /** The file name and extension were updated successfully. */
  @js.native
  sealed trait succeeded extends SetFileNameResult
  
  /** The file name and extension were not updated because the file picker UI wasn't available. The file picker UI is only available while the user is interacting with your app. */
  @js.native
  sealed trait unavailable extends SetFileNameResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SetFileNameResult with Double] = js.native
  /* 1 */ @js.native
  object notAllowed extends TopLevel[notAllowed with Double]
  
  /* 0 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
  /* 2 */ @js.native
  object unavailable extends TopLevel[unavailable with Double]
  
}

