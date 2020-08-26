package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information about the opening custom document.
  */
@js.native
trait CustomDocumentOpenContext extends js.Object {
  /**
    * The id of the backup to restore the document from or `undefined` if there is no backup.
    *
    * If this is provided, your extension should restore the editor from the backup instead of reading the file
    * from the user's workspace.
    */
  val backupId: js.UndefOr[String] = js.native
}

object CustomDocumentOpenContext {
  @scala.inline
  def apply(): CustomDocumentOpenContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDocumentOpenContext]
  }
  @scala.inline
  implicit class CustomDocumentOpenContextOps[Self <: CustomDocumentOpenContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackupId(value: String): Self = this.set("backupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupId: Self = this.set("backupId", js.undefined)
  }
  
}

