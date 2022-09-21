package typings.vscodeLanguageserverProtocol.protocolFileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileRename extends StObject {
  
  /**
    * A file:// URI for the new location of the file/folder being renamed.
    */
  var newUri: String
  
  /**
    * A file:// URI for the original location of the file/folder being renamed.
    */
  var oldUri: String
}
object FileRename {
  
  inline def apply(newUri: String, oldUri: String): FileRename = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRename]
  }
  
  extension [Self <: FileRename](x: Self) {
    
    inline def setNewUri(value: String): Self = StObject.set(x, "newUri", value.asInstanceOf[js.Any])
    
    inline def setOldUri(value: String): Self = StObject.set(x, "oldUri", value.asInstanceOf[js.Any])
  }
}
