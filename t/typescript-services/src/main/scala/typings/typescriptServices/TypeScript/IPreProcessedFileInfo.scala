package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPreProcessedFileInfo extends StObject {
  
  var diagnostics: js.Array[Diagnostic]
  
  var importedFiles: js.Array[IFileReference]
  
  var isLibFile: Boolean
  
  var referencedFiles: js.Array[IFileReference]
}
object IPreProcessedFileInfo {
  
  inline def apply(
    diagnostics: js.Array[Diagnostic],
    importedFiles: js.Array[IFileReference],
    isLibFile: Boolean,
    referencedFiles: js.Array[IFileReference]
  ): IPreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], importedFiles = importedFiles.asInstanceOf[js.Any], isLibFile = isLibFile.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreProcessedFileInfo]
  }
  
  extension [Self <: IPreProcessedFileInfo](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    inline def setImportedFiles(value: js.Array[IFileReference]): Self = StObject.set(x, "importedFiles", value.asInstanceOf[js.Any])
    
    inline def setImportedFilesVarargs(value: IFileReference*): Self = StObject.set(x, "importedFiles", js.Array(value :_*))
    
    inline def setIsLibFile(value: Boolean): Self = StObject.set(x, "isLibFile", value.asInstanceOf[js.Any])
    
    inline def setReferencedFiles(value: js.Array[IFileReference]): Self = StObject.set(x, "referencedFiles", value.asInstanceOf[js.Any])
    
    inline def setReferencedFilesVarargs(value: IFileReference*): Self = StObject.set(x, "referencedFiles", js.Array(value :_*))
  }
}
