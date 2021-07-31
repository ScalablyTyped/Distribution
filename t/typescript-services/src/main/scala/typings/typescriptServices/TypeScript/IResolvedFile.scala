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
  
  @scala.inline
  def apply(importedFiles: js.Array[String], path: String, referencedFiles: js.Array[String]): IResolvedFile = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResolvedFile]
  }
  
  @scala.inline
  implicit class IResolvedFileMutableBuilder[Self <: IResolvedFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportedFiles(value: js.Array[String]): Self = StObject.set(x, "importedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedFilesVarargs(value: String*): Self = StObject.set(x, "importedFiles", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedFiles(value: js.Array[String]): Self = StObject.set(x, "referencedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedFilesVarargs(value: String*): Self = StObject.set(x, "referencedFiles", js.Array(value :_*))
  }
}
