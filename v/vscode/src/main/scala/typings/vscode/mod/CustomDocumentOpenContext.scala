package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional information about the opening custom document.
  */
trait CustomDocumentOpenContext extends StObject {
  
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
  def apply(): CustomDocumentOpenContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDocumentOpenContext]
  }
  
  @scala.inline
  implicit class CustomDocumentOpenContextMutableBuilder[Self <: CustomDocumentOpenContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
  }
}
