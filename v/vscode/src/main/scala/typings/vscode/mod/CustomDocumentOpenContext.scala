package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information about the opening custom document.
  */
trait CustomDocumentOpenContext extends js.Object {
  /**
    * The id of the backup to restore the document from or `undefined` if there is no backup.
    *
    * If this is provided, your extension should restore the editor from the backup instead of reading the file
    * from the user's workspace.
    */
  val backupId: js.UndefOr[String] = js.undefined
}

object CustomDocumentOpenContext {
  @scala.inline
  def apply(backupId: String = null): CustomDocumentOpenContext = {
    val __obj = js.Dynamic.literal()
    if (backupId != null) __obj.updateDynamic("backupId")(backupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentOpenContext]
  }
}

