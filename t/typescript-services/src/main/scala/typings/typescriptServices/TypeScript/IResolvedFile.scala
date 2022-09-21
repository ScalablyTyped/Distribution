package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResolvedFile extends StObject {
  
  var importedFiles: js.Array[String]
  
  var path: String
  
  var referencedFiles: js.Array[String]
}
object IResolvedFile {
  
  inline def apply(importedFiles: js.Array[String], path: String, referencedFiles: js.Array[String]): IResolvedFile = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResolvedFile]
  }
  
  extension [Self <: IResolvedFile](x: Self) {
    
    inline def setImportedFiles(value: js.Array[String]): Self = StObject.set(x, "importedFiles", value.asInstanceOf[js.Any])
    
    inline def setImportedFilesVarargs(value: String*): Self = StObject.set(x, "importedFiles", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setReferencedFiles(value: js.Array[String]): Self = StObject.set(x, "referencedFiles", value.asInstanceOf[js.Any])
    
    inline def setReferencedFilesVarargs(value: String*): Self = StObject.set(x, "referencedFiles", js.Array(value*))
  }
}
