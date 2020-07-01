package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information used to implement [`CustomEditableDocument.backup`](#CustomEditableDocument.backup).
  */
trait CustomDocumentBackupContext extends js.Object {
  /**
    * Suggested file location to write the new backup.
    *
    * Note that your extension is free to ignore this and use its own strategy for backup.
    *
    * If the editor is for a resource from the current workspace, `destination` will point to a file inside
    * `ExtensionContext.storagePath`. The parent folder of `destination` may not exist, so make sure to created it
    * before writing the backup to this location.
    */
  val destination: Uri
}

object CustomDocumentBackupContext {
  @scala.inline
  def apply(destination: Uri): CustomDocumentBackupContext = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentBackupContext]
  }
}

