package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceResolver extends StObject {
  
  /* private */ def getNormalizedFilePath(path: js.Any, parentFilePath: js.Any): js.Any
  
  /* private */ def getUniqueFileId(filePath: js.Any): js.Any
  
  /* private */ var host: js.Any
  
  /* private */ var inputFileNames: js.Any
  
  /* private */ def isSameFile(filePath1: js.Any, filePath2: js.Any): js.Any
  
  /* private */ def isVisited(filePath: js.Any): js.Any
  
  /* private */ def recordVisitedFile(filePath: js.Any): js.Any
  
  /* private */ def resolveFile(normalizedPath: js.Any, resolutionResult: js.Any): js.Any
  
  /* private */ def resolveImportedFile(path: js.Any, referenceLocation: js.Any, resolutionResult: js.Any): js.Any
  
  /* private */ def resolveIncludedFile(path: js.Any, referenceLocation: js.Any, resolutionResult: js.Any): js.Any
  
  def resolveInputFiles(): ReferenceResolutionResult
  
  /* private */ var useCaseSensitiveFileResolution: js.Any
  
  /* private */ var visited: js.Any
}
object ReferenceResolver {
  
  inline def apply(
    getNormalizedFilePath: (js.Any, js.Any) => js.Any,
    getUniqueFileId: js.Any => js.Any,
    host: js.Any,
    inputFileNames: js.Any,
    isSameFile: (js.Any, js.Any) => js.Any,
    isVisited: js.Any => js.Any,
    recordVisitedFile: js.Any => js.Any,
    resolveFile: (js.Any, js.Any) => js.Any,
    resolveImportedFile: (js.Any, js.Any, js.Any) => js.Any,
    resolveIncludedFile: (js.Any, js.Any, js.Any) => js.Any,
    resolveInputFiles: () => ReferenceResolutionResult,
    useCaseSensitiveFileResolution: js.Any,
    visited: js.Any
  ): ReferenceResolver = {
    val __obj = js.Dynamic.literal(getNormalizedFilePath = js.Any.fromFunction2(getNormalizedFilePath), getUniqueFileId = js.Any.fromFunction1(getUniqueFileId), host = host.asInstanceOf[js.Any], inputFileNames = inputFileNames.asInstanceOf[js.Any], isSameFile = js.Any.fromFunction2(isSameFile), isVisited = js.Any.fromFunction1(isVisited), recordVisitedFile = js.Any.fromFunction1(recordVisitedFile), resolveFile = js.Any.fromFunction2(resolveFile), resolveImportedFile = js.Any.fromFunction3(resolveImportedFile), resolveIncludedFile = js.Any.fromFunction3(resolveIncludedFile), resolveInputFiles = js.Any.fromFunction0(resolveInputFiles), useCaseSensitiveFileResolution = useCaseSensitiveFileResolution.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceResolver]
  }
  
  extension [Self <: ReferenceResolver](x: Self) {
    
    inline def setGetNormalizedFilePath(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "getNormalizedFilePath", js.Any.fromFunction2(value))
    
    inline def setGetUniqueFileId(value: js.Any => js.Any): Self = StObject.set(x, "getUniqueFileId", js.Any.fromFunction1(value))
    
    inline def setHost(value: js.Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setInputFileNames(value: js.Any): Self = StObject.set(x, "inputFileNames", value.asInstanceOf[js.Any])
    
    inline def setIsSameFile(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "isSameFile", js.Any.fromFunction2(value))
    
    inline def setIsVisited(value: js.Any => js.Any): Self = StObject.set(x, "isVisited", js.Any.fromFunction1(value))
    
    inline def setRecordVisitedFile(value: js.Any => js.Any): Self = StObject.set(x, "recordVisitedFile", js.Any.fromFunction1(value))
    
    inline def setResolveFile(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "resolveFile", js.Any.fromFunction2(value))
    
    inline def setResolveImportedFile(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "resolveImportedFile", js.Any.fromFunction3(value))
    
    inline def setResolveIncludedFile(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "resolveIncludedFile", js.Any.fromFunction3(value))
    
    inline def setResolveInputFiles(value: () => ReferenceResolutionResult): Self = StObject.set(x, "resolveInputFiles", js.Any.fromFunction0(value))
    
    inline def setUseCaseSensitiveFileResolution(value: js.Any): Self = StObject.set(x, "useCaseSensitiveFileResolution", value.asInstanceOf[js.Any])
    
    inline def setVisited(value: js.Any): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
  }
}
