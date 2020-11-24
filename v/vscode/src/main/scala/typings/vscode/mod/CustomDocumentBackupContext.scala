package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional information used to implement [`CustomEditableDocument.backup`](#CustomEditableDocument.backup).
  */
@js.native
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
  val destination: Uri = js.native
}
object CustomDocumentBackupContext {
  
  @scala.inline
  def apply(destination: Uri): CustomDocumentBackupContext = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentBackupContext]
  }
  
  @scala.inline
  implicit class CustomDocumentBackupContextOps[Self <: CustomDocumentBackupContext] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Uri): Self = this.set("destination", value.asInstanceOf[js.Any])
  }
}
