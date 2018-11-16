package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait nameCollision
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus
  
  /** There was a network error while trying to create the folder. */
  @js.native
  sealed trait networkError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus
  
  /** There was a permissions error while trying to create the folder. */
  @js.native
  sealed trait permissionsError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus
  
  /** There was a server error while trying to create the folder. */
  @js.native
  sealed trait serverError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus
  
  /** The server rejected the request to create a new folder. */
  @js.native
  sealed trait serverRejected
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus
  
  /** The folder was created successfully. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus
  
  /** Folder creation failed for an unknown reason. */
  @js.native
  sealed trait unknownFailure
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus
  
  val nameCollision: nameCollision with java.lang.String = js.native
  val networkError: networkError with java.lang.String = js.native
  val permissionsError: permissionsError with java.lang.String = js.native
  val serverError: serverError with java.lang.String = js.native
  val serverRejected: serverRejected with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unknownFailure: unknownFailure with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxCreateFolderStatus with java.lang.String
  ] = js.native
}

