package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxDeleteFolderStatus with Double] = js.native
  /* 5 */ @js.native
  object couldNotDeleteEverything extends TopLevel[couldNotDeleteEverything with Double]
  
  /* 1 */ @js.native
  object networkError extends TopLevel[networkError with Double]
  
  /* 2 */ @js.native
  object permissionsError extends TopLevel[permissionsError with Double]
  
  /* 3 */ @js.native
  object serverError extends TopLevel[serverError with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 4 */ @js.native
  object unknownFailure extends TopLevel[unknownFailure with Double]
  
}

