package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxCreateFolderStatus with Double] = js.native
  /* 5 */ @js.native
  object nameCollision extends TopLevel[nameCollision with Double]
  
  /* 1 */ @js.native
  object networkError extends TopLevel[networkError with Double]
  
  /* 2 */ @js.native
  object permissionsError extends TopLevel[permissionsError with Double]
  
  /* 3 */ @js.native
  object serverError extends TopLevel[serverError with Double]
  
  /* 6 */ @js.native
  object serverRejected extends TopLevel[serverRejected with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 4 */ @js.native
  object unknownFailure extends TopLevel[unknownFailure with Double]
  
}

