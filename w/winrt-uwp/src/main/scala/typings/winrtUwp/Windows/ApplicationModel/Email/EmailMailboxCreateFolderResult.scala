package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a TryCreateFolderAsync operation. */
trait EmailMailboxCreateFolderResult extends js.Object {
  /** Get the newly created folder after a TryCreateFolderAsync operation. */
  var folder: EmailFolder
  /** Gets the status of a TryCreateFolderAsync operation. */
  var status: EmailMailboxCreateFolderStatus
}

object EmailMailboxCreateFolderResult {
  @scala.inline
  def apply(folder: EmailFolder, status: EmailMailboxCreateFolderStatus): EmailMailboxCreateFolderResult = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxCreateFolderResult]
  }
}

