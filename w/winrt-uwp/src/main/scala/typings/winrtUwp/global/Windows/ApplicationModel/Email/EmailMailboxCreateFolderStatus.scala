package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the result of a call to TryCreateFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus")
@js.native
object EmailMailboxCreateFolderStatus extends js.Object {
  /* 5 */ val nameCollision: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.nameCollision with Double = js.native
  /* 1 */ val networkError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.networkError with Double = js.native
  /* 2 */ val permissionsError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.permissionsError with Double = js.native
  /* 3 */ val serverError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.serverError with Double = js.native
  /* 6 */ val serverRejected: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.serverRejected with Double = js.native
  /* 0 */ val success: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.success with Double = js.native
  /* 4 */ val unknownFailure: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus with Double
  ] = js.native
}

