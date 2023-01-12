package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceResolver extends StObject {
  
  /* private */ def getNormalizedFilePath(path: Any, parentFilePath: Any): Any
  
  /* private */ def getUniqueFileId(filePath: Any): Any
  
  /* private */ var host: Any
  
  /* private */ var inputFileNames: Any
  
  /* private */ def isSameFile(filePath1: Any, filePath2: Any): Any
  
  /* private */ def isVisited(filePath: Any): Any
  
  /* private */ def recordVisitedFile(filePath: Any): Any
  
  /* private */ def resolveFile(normalizedPath: Any, resolutionResult: Any): Any
  
  /* private */ def resolveImportedFile(path: Any, referenceLocation: Any, resolutionResult: Any): Any
  
  /* private */ def resolveIncludedFile(path: Any, referenceLocation: Any, resolutionResult: Any): Any
  
  def resolveInputFiles(): ReferenceResolutionResult
  
  /* private */ var useCaseSensitiveFileResolution: Any
  
  /* private */ var visited: Any
}
object ReferenceResolver {
  
  inline def apply(
    getNormalizedFilePath: (Any, Any) => Any,
    getUniqueFileId: Any => Any,
    host: Any,
    inputFileNames: Any,
    isSameFile: (Any, Any) => Any,
    isVisited: Any => Any,
    recordVisitedFile: Any => Any,
    resolveFile: (Any, Any) => Any,
    resolveImportedFile: (Any, Any, Any) => Any,
    resolveIncludedFile: (Any, Any, Any) => Any,
    resolveInputFiles: () => ReferenceResolutionResult,
    useCaseSensitiveFileResolution: Any,
    visited: Any
  ): ReferenceResolver = {
    val __obj = js.Dynamic.literal(getNormalizedFilePath = js.Any.fromFunction2(getNormalizedFilePath), getUniqueFileId = js.Any.fromFunction1(getUniqueFileId), host = host.asInstanceOf[js.Any], inputFileNames = inputFileNames.asInstanceOf[js.Any], isSameFile = js.Any.fromFunction2(isSameFile), isVisited = js.Any.fromFunction1(isVisited), recordVisitedFile = js.Any.fromFunction1(recordVisitedFile), resolveFile = js.Any.fromFunction2(resolveFile), resolveImportedFile = js.Any.fromFunction3(resolveImportedFile), resolveIncludedFile = js.Any.fromFunction3(resolveIncludedFile), resolveInputFiles = js.Any.fromFunction0(resolveInputFiles), useCaseSensitiveFileResolution = useCaseSensitiveFileResolution.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceResolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceResolver] (val x: Self) extends AnyVal {
    
    inline def setGetNormalizedFilePath(value: (Any, Any) => Any): Self = StObject.set(x, "getNormalizedFilePath", js.Any.fromFunction2(value))
    
    inline def setGetUniqueFileId(value: Any => Any): Self = StObject.set(x, "getUniqueFileId", js.Any.fromFunction1(value))
    
    inline def setHost(value: Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setInputFileNames(value: Any): Self = StObject.set(x, "inputFileNames", value.asInstanceOf[js.Any])
    
    inline def setIsSameFile(value: (Any, Any) => Any): Self = StObject.set(x, "isSameFile", js.Any.fromFunction2(value))
    
    inline def setIsVisited(value: Any => Any): Self = StObject.set(x, "isVisited", js.Any.fromFunction1(value))
    
    inline def setRecordVisitedFile(value: Any => Any): Self = StObject.set(x, "recordVisitedFile", js.Any.fromFunction1(value))
    
    inline def setResolveFile(value: (Any, Any) => Any): Self = StObject.set(x, "resolveFile", js.Any.fromFunction2(value))
    
    inline def setResolveImportedFile(value: (Any, Any, Any) => Any): Self = StObject.set(x, "resolveImportedFile", js.Any.fromFunction3(value))
    
    inline def setResolveIncludedFile(value: (Any, Any, Any) => Any): Self = StObject.set(x, "resolveIncludedFile", js.Any.fromFunction3(value))
    
    inline def setResolveInputFiles(value: () => ReferenceResolutionResult): Self = StObject.set(x, "resolveInputFiles", js.Any.fromFunction0(value))
    
    inline def setUseCaseSensitiveFileResolution(value: Any): Self = StObject.set(x, "useCaseSensitiveFileResolution", value.asInstanceOf[js.Any])
    
    inline def setVisited(value: Any): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
  }
}
