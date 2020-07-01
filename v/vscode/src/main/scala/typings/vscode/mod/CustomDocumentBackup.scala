package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A backup for an [`CustomDocument`](#CustomDocument).
  */
trait CustomDocumentBackup extends js.Object {
  /**
    * Unique identifier for the backup.
    *
    * This id is passed back to your extension in `openCustomDocument` when opening a custom editor from a backup.
    */
  val id: String
  /**
    * Delete the current backup.
    *
    * This is called by VS Code when it is clear the current backup is no longer needed, such as when a new backup
    * is made or when the file is saved.
    */
  def delete(): Unit
}

object CustomDocumentBackup {
  @scala.inline
  def apply(delete: () => Unit, id: String): CustomDocumentBackup = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentBackup]
  }
}

