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
  
  /* 1 */ val complete: complete with scala.Double = js.native
  /* 5 */ val completeAndRenamed: completeAndRenamed with scala.Double = js.native
  /* 3 */ val currentlyUnavailable: currentlyUnavailable with scala.Double = js.native
  /* 4 */ val failed: failed with scala.Double = js.native
  /* 0 */ val incomplete: incomplete with scala.Double = js.native
  /* 2 */ val userInputNeeded: userInputNeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus with scala.Double
  ] = js.native
}

