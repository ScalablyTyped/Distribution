package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddFileResult extends js.Object

/** Indicates the result of a call to the fileOpenPickerUI.addFile method. */
@JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
@js.native
object AddFileResult extends js.Object {
  /** The file was successfully added to the file picker UI. */
  @js.native
  sealed trait added
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult
  
  /** The file was already in the file picker UI. */
  @js.native
  sealed trait alreadyAdded
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult
  
  /** The file wasn't added because it is not one of the allowed file types. */
  @js.native
  sealed trait notAllowed
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult
  
  /** The file wasn't added because the file picker UI is unavailable. The file picker UI is only available while the user is interacting with your app. */
  @js.native
  sealed trait unavailable
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult
  
  val added: added with java.lang.String = js.native
  val alreadyAdded: alreadyAdded with java.lang.String = js.native
  val notAllowed: notAllowed with java.lang.String = js.native
  val unavailable: unavailable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.AddFileResult with java.lang.String
  ] = js.native
}

