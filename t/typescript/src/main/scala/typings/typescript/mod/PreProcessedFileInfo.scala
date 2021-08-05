package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreProcessedFileInfo extends StObject {
  
  var ambientExternalModules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var importedFiles: js.Array[FileReference]
  
  var isLibFile: Boolean
  
  var libReferenceDirectives: js.Array[FileReference]
  
  var referencedFiles: js.Array[FileReference]
  
  var typeReferenceDirectives: js.Array[FileReference]
}
object PreProcessedFileInfo {
  
  inline def apply(
    importedFiles: js.Array[FileReference],
    isLibFile: Boolean,
    libReferenceDirectives: js.Array[FileReference],
    referencedFiles: js.Array[FileReference],
    typeReferenceDirectives: js.Array[FileReference]
  ): PreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], isLibFile = isLibFile.asInstanceOf[js.Any], libReferenceDirectives = libReferenceDirectives.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any], typeReferenceDirectives = typeReferenceDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProcessedFileInfo]
  }
  
  extension [Self <: PreProcessedFileInfo](x: Self) {
    
    inline def setAmbientExternalModules(value: js.Array[java.lang.String]): Self = StObject.set(x, "ambientExternalModules", value.asInstanceOf[js.Any])
    
    inline def setAmbientExternalModulesUndefined: Self = StObject.set(x, "ambientExternalModules", js.undefined)
    
    inline def setAmbientExternalModulesVarargs(value: java.lang.String*): Self = StObject.set(x, "ambientExternalModules", js.Array(value :_*))
    
    inline def setImportedFiles(value: js.Array[FileReference]): Self = StObject.set(x, "importedFiles", value.asInstanceOf[js.Any])
    
    inline def setImportedFilesVarargs(value: FileReference*): Self = StObject.set(x, "importedFiles", js.Array(value :_*))
    
    inline def setIsLibFile(value: Boolean): Self = StObject.set(x, "isLibFile", value.asInstanceOf[js.Any])
    
    inline def setLibReferenceDirectives(value: js.Array[FileReference]): Self = StObject.set(x, "libReferenceDirectives", value.asInstanceOf[js.Any])
    
    inline def setLibReferenceDirectivesVarargs(value: FileReference*): Self = StObject.set(x, "libReferenceDirectives", js.Array(value :_*))
    
    inline def setReferencedFiles(value: js.Array[FileReference]): Self = StObject.set(x, "referencedFiles", value.asInstanceOf[js.Any])
    
    inline def setReferencedFilesVarargs(value: FileReference*): Self = StObject.set(x, "referencedFiles", js.Array(value :_*))
    
    inline def setTypeReferenceDirectives(value: js.Array[FileReference]): Self = StObject.set(x, "typeReferenceDirectives", value.asInstanceOf[js.Any])
    
    inline def setTypeReferenceDirectivesVarargs(value: FileReference*): Self = StObject.set(x, "typeReferenceDirectives", js.Array(value :_*))
  }
}
