package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs

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
  sealed trait notAllowed
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult
  
  /** The file name and extension were updated successfully. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult
  
  /** The file name and extension were not updated because the file picker UI wasn't available. The file picker UI is only available while the user is interacting with your app. */
  @js.native
  sealed trait unavailable
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult
  
  val notAllowed: notAllowed with java.lang.String = js.native
  val succeeded: succeeded with java.lang.String = js.native
  val unavailable: unavailable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.SetFileNameResult with java.lang.String
  ] = js.native
}

