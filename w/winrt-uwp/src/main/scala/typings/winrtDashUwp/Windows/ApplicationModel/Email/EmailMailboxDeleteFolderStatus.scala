package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxDeleteFolderStatus extends js.Object

/** Indicates the result of a call to TryDeleteFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus")
@js.native
object EmailMailboxDeleteFolderStatus extends js.Object {
  /** An error occurred while deleting parts of the folder. */
  @js.native
  sealed trait couldNotDeleteEverything extends EmailMailboxDeleteFolderStatus
  
  /** There was a network error while trying to delete the folder. */
  @js.native
  sealed trait networkError extends EmailMailboxDeleteFolderStatus
  
  /** There was a permissions error while trying to delete the folder. */
  @js.native
  sealed trait permissionsError extends EmailMailboxDeleteFolderStatus
  
  /** There was a server error while trying to delete the folder. */
  @js.native
  sealed trait serverError extends EmailMailboxDeleteFolderStatus
  
  /** The folder was successfully deleted. */
  @js.native
  sealed trait success extends EmailMailboxDeleteFolderStatus
  
  /** Folder deletion failed for an unknown reason. */
  @js.native
  sealed trait unknownFailure extends EmailMailboxDeleteFolderStatus
  
  /* 5 */ val couldNotDeleteEverything: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.couldNotDeleteEverything with Double = js.native
  /* 1 */ val networkError: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.networkError with Double = js.native
  /* 2 */ val permissionsError: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.permissionsError with Double = js.native
  /* 3 */ val serverError: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.serverError with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.success with Double = js.native
  /* 4 */ val unknownFailure: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxDeleteFolderStatus with Double] = js.native
}

