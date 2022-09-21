package typings.vscodeLanguageserverProtocol.protocolFileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFilesParams extends StObject {
  
  /**
    * An array of all files/folders deleted in this operation.
    */
  var files: js.Array[FileDelete]
}
object DeleteFilesParams {
  
  inline def apply(files: js.Array[FileDelete]): DeleteFilesParams = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilesParams]
  }
  
  extension [Self <: DeleteFilesParams](x: Self) {
    
    inline def setFiles(value: js.Array[FileDelete]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: FileDelete*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
