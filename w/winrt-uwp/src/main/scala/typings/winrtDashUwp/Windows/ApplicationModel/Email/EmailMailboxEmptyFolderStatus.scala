package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxEmptyFolderStatus extends js.Object

/** Indicates the result of a call to TryEmptyFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus")
@js.native
object EmailMailboxEmptyFolderStatus extends js.Object {
  /** An error occurred while deleting parts of the folder. */
  @js.native
  sealed trait couldNotDeleteEverything extends EmailMailboxEmptyFolderStatus
  
  /** There was a network error while trying to empty the folder. */
  @js.native
  sealed trait networkError extends EmailMailboxEmptyFolderStatus
  
  /** There was a permissions error while trying to empty the folder. */
  @js.native
  sealed trait permissionsError extends EmailMailboxEmptyFolderStatus
  
  /** There was a server error while trying to empty the folder. */
  @js.native
  sealed trait serverError extends EmailMailboxEmptyFolderStatus
  
  /** The folder was successfully emptied. */
  @js.native
  sealed trait success extends EmailMailboxEmptyFolderStatus
  
  /** There was an unknown error while trying to empty the folder. */
  @js.native
  sealed trait unknownFailure extends EmailMailboxEmptyFolderStatus
  
  /* 5 */ val couldNotDeleteEverything: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.couldNotDeleteEverything with Double = js.native
  /* 1 */ val networkError: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.networkError with Double = js.native
  /* 2 */ val permissionsError: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.permissionsError with Double = js.native
  /* 3 */ val serverError: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.serverError with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.success with Double = js.native
  /* 4 */ val unknownFailure: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxEmptyFolderStatus with Double] = js.native
}

