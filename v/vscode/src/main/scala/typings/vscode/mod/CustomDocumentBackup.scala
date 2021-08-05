package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A backup for an [`CustomDocument`](#CustomDocument).
  */
trait CustomDocumentBackup extends StObject {
  
  /**
    * Delete the current backup.
    *
    * This is called by VS Code when it is clear the current backup is no longer needed, such as when a new backup
    * is made or when the file is saved.
    */
  def delete(): Unit
  
  /**
    * Unique identifier for the backup.
    *
    * This id is passed back to your extension in `openCustomDocument` when opening a custom editor from a backup.
    */
  val id: String
}
object CustomDocumentBackup {
  
  inline def apply(delete: () => Unit, id: String): CustomDocumentBackup = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentBackup]
  }
  
  extension [Self <: CustomDocumentBackup](x: Self) {
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
