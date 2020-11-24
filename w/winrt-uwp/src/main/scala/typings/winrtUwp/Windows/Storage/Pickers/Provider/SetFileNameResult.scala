package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
