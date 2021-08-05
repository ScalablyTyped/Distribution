package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceResolutionResult extends StObject {
  
  var diagnostics: js.Array[Diagnostic]
  
  var resolvedFiles: js.Array[IResolvedFile]
  
  var seenNoDefaultLibTag: Boolean
}
object ReferenceResolutionResult {
  
  inline def apply(
    diagnostics: js.Array[Diagnostic],
    resolvedFiles: js.Array[IResolvedFile],
    seenNoDefaultLibTag: Boolean
  ): ReferenceResolutionResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], resolvedFiles = resolvedFiles.asInstanceOf[js.Any], seenNoDefaultLibTag = seenNoDefaultLibTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceResolutionResult]
  }
  
  extension [Self <: ReferenceResolutionResult](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    inline def setResolvedFiles(value: js.Array[IResolvedFile]): Self = StObject.set(x, "resolvedFiles", value.asInstanceOf[js.Any])
    
    inline def setResolvedFilesVarargs(value: IResolvedFile*): Self = StObject.set(x, "resolvedFiles", js.Array(value :_*))
    
    inline def setSeenNoDefaultLibTag(value: Boolean): Self = StObject.set(x, "seenNoDefaultLibTag", value.asInstanceOf[js.Any])
  }
}
