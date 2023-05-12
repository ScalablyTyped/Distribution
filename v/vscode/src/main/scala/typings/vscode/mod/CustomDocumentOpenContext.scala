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
  
  /**
  		 * If the URI is an untitled file, this will be populated with the byte data of that file
  		 *
  		 * If this is provided, your extension should utilize this byte data rather than executing fs APIs on the URI passed in
  		 */
  val untitledDocumentData: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object CustomDocumentOpenContext {
  
  inline def apply(): CustomDocumentOpenContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDocumentOpenContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomDocumentOpenContext] (val x: Self) extends AnyVal {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setUntitledDocumentData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "untitledDocumentData", value.asInstanceOf[js.Any])
    
    inline def setUntitledDocumentDataUndefined: Self = StObject.set(x, "untitledDocumentData", js.undefined)
  }
}
