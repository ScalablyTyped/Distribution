package typings.vscodeLanguageserverProtocol.protocolFileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFilesParams extends StObject {
  
  /**
    * An array of all files/folders created in this operation.
    */
  var files: js.Array[FileCreate]
}
object CreateFilesParams {
  
  inline def apply(files: js.Array[FileCreate]): CreateFilesParams = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilesParams]
  }
  
  extension [Self <: CreateFilesParams](x: Self) {
    
    inline def setFiles(value: js.Array[FileCreate]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: FileCreate*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
