package typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs

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
  sealed trait complete extends FileUpdateStatus
  
  /** The file update was completed successfully and the file has been renamed. For example, this could occur if the user chose to save their changes under a different file name because of conflicting changes made to the remote version of the file. */
  @js.native
  sealed trait completeAndRenamed extends FileUpdateStatus
  
  /** The remote version of the file was not updated because the storage location wasn't available. The file remains valid and subsequent updates to the file may succeed. */
  @js.native
  sealed trait currentlyUnavailable extends FileUpdateStatus
  
  /** The file is now invalid and can't be updated now or in the future. For example, this could occur if the remote version of the file was deleted. */
  @js.native
  sealed trait failed extends FileUpdateStatus
  
  /** The file update was not fully completed and should be retried. */
  @js.native
  sealed trait incomplete extends FileUpdateStatus
  
  /** User input (like credentials) is needed to update the file. */
  @js.native
  sealed trait userInputNeeded extends FileUpdateStatus
  
  /* 1 */ val complete: typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.complete with Double = js.native
  /* 5 */ val completeAndRenamed: typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.completeAndRenamed with Double = js.native
  /* 3 */ val currentlyUnavailable: typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.currentlyUnavailable with Double = js.native
  /* 4 */ val failed: typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.failed with Double = js.native
  /* 0 */ val incomplete: typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.incomplete with Double = js.native
  /* 2 */ val userInputNeeded: typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus.userInputNeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileUpdateStatus with Double] = js.native
}

