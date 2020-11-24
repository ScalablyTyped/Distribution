package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A backup for an [`CustomDocument`](#CustomDocument).
  */
@js.native
trait CustomDocumentBackup extends js.Object {
  
  /**
    * Delete the current backup.
    *
    * This is called by VS Code when it is clear the current backup is no longer needed, such as when a new backup
    * is made or when the file is saved.
    */
  def delete(): Unit = js.native
  
  /**
    * Unique identifier for the backup.
    *
    * This id is passed back to your extension in `openCustomDocument` when opening a custom editor from a backup.
    */
  val id: String = js.native
}
object CustomDocumentBackup {
  
  @scala.inline
  def apply(delete: () => Unit, id: String): CustomDocumentBackup = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentBackup]
  }
  
  @scala.inline
  implicit class CustomDocumentBackupOps[Self <: CustomDocumentBackup] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: () => Unit): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
