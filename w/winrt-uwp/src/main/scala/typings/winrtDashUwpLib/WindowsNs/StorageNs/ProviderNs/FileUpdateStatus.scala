package typings
package winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileUpdateStatus extends js.Object

/** Describes the status of a file update request. */
@JSGlobal("Windows.Storage.Provider.FileUpdateStatus")
@js.native
object FileUpdateStatus extends js.Object {
  /** The file update was completed successfully. */
  @js.native
  sealed trait complete
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  /** The file update was completed successfully and the file has been renamed. For example, this could occur if the user chose to save their changes under a different file name because of conflicting changes made to the remote version of the file. */
  @js.native
  sealed trait completeAndRenamed
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  /** The remote version of the file was not updated because the storage location wasn't available. The file remains valid and subsequent updates to the file may succeed. */
  @js.native
  sealed trait currentlyUnavailable
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  /** The file is now invalid and can't be updated now or in the future. For example, this could occur if the remote version of the file was deleted. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  /** The file update was not fully completed and should be retried. */
  @js.native
  sealed trait incomplete
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  /** User input (like credentials) is needed to update the file. */
  @js.native
  sealed trait userInputNeeded
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  val complete: complete with java.lang.String = js.native
  val completeAndRenamed: completeAndRenamed with java.lang.String = js.native
  val currentlyUnavailable: currentlyUnavailable with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val incomplete: incomplete with java.lang.String = js.native
  val userInputNeeded: userInputNeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus with java.lang.String
  ] = js.native
}

