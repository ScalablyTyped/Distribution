package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Additional information used to implement {@linkcode CustomDocumentBackup}.
	 */
trait CustomDocumentBackupContext extends StObject {
  
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
  
  inline def apply(destination: Uri): CustomDocumentBackupContext = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocumentBackupContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomDocumentBackupContext] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: Uri): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
