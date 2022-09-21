package typings.vscodeLanguageserverProtocol.protocolFileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameFilesParams extends StObject {
  
  /**
    * An array of all files/folders renamed in this operation. When a folder is renamed, only
    * the folder will be included, and not its children.
    */
  var files: js.Array[FileRename]
}
object RenameFilesParams {
  
  inline def apply(files: js.Array[FileRename]): RenameFilesParams = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameFilesParams]
  }
  
  extension [Self <: RenameFilesParams](x: Self) {
    
    inline def setFiles(value: js.Array[FileRename]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: FileRename*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
