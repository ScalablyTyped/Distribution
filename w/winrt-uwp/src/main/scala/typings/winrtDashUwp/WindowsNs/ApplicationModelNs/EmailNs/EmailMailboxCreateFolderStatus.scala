package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxCreateFolderStatus extends js.Object

/** Indicates the result of a call to TryCreateFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus")
@js.native
object EmailMailboxCreateFolderStatus extends js.Object {
  /** The folder already exists. */
  @js.native
  sealed trait nameCollision extends EmailMailboxCreateFolderStatus
  
  /** There was a network error while trying to create the folder. */
  @js.native
  sealed trait networkError extends EmailMailboxCreateFolderStatus
  
  /** There was a permissions error while trying to create the folder. */
  @js.native
  sealed trait permissionsError extends EmailMailboxCreateFolderStatus
  
  /** There was a server error while trying to create the folder. */
  @js.native
  sealed trait serverError extends EmailMailboxCreateFolderStatus
  
  /** The server rejected the request to create a new folder. */
  @js.native
  sealed trait serverRejected extends EmailMailboxCreateFolderStatus
  
  /** The folder was created successfully. */
  @js.native
  sealed trait success extends EmailMailboxCreateFolderStatus
  
  /** Folder creation failed for an unknown reason. */
  @js.native
  sealed trait unknownFailure extends EmailMailboxCreateFolderStatus
  
  /* 5 */ val nameCollision: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus.nameCollision with Double = js.native
  /* 1 */ val networkError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus.networkError with Double = js.native
  /* 2 */ val permissionsError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus.permissionsError with Double = js.native
  /* 3 */ val serverError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus.serverError with Double = js.native
  /* 6 */ val serverRejected: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus.serverRejected with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus.success with Double = js.native
  /* 4 */ val unknownFailure: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxCreateFolderStatus with Double] = js.native
}

