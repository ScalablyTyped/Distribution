package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait couldNotDeleteEverything
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxDeleteFolderStatus
  
  /** There was a network error while trying to delete the folder. */
  @js.native
  sealed trait networkError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxDeleteFolderStatus
  
  /** There was a permissions error while trying to delete the folder. */
  @js.native
  sealed trait permissionsError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxDeleteFolderStatus
  
  /** There was a server error while trying to delete the folder. */
  @js.native
  sealed trait serverError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxDeleteFolderStatus
  
  /** The folder was successfully deleted. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxDeleteFolderStatus
  
  /** Folder deletion failed for an unknown reason. */
  @js.native
  sealed trait unknownFailure
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxDeleteFolderStatus
  
  val couldNotDeleteEverything: couldNotDeleteEverything with java.lang.String = js.native
  val networkError: networkError with java.lang.String = js.native
  val permissionsError: permissionsError with java.lang.String = js.native
  val serverError: serverError with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unknownFailure: unknownFailure with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxDeleteFolderStatus with java.lang.String
  ] = js.native
}

