package typings.tsLoader.interfacesMod

import typings.std.Map
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionDiagnostics extends StObject {
  
  var global: js.Array[Diagnostic]
  
  var perFile: Map[FilePathKey, js.Array[Diagnostic]]
  
  var transpileErrors: js.Array[js.Tuple2[js.UndefOr[FilePathKey], js.Array[Diagnostic]]]
}
object SolutionDiagnostics {
  
  inline def apply(
    global: js.Array[Diagnostic],
    perFile: Map[FilePathKey, js.Array[Diagnostic]],
    transpileErrors: js.Array[js.Tuple2[js.UndefOr[FilePathKey], js.Array[Diagnostic]]]
  ): SolutionDiagnostics = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], perFile = perFile.asInstanceOf[js.Any], transpileErrors = transpileErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionDiagnostics]
  }
  
  extension [Self <: SolutionDiagnostics](x: Self) {
    
    inline def setGlobal(value: js.Array[Diagnostic]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: Diagnostic*): Self = StObject.set(x, "global", js.Array(value*))
    
    inline def setPerFile(value: Map[FilePathKey, js.Array[Diagnostic]]): Self = StObject.set(x, "perFile", value.asInstanceOf[js.Any])
    
    inline def setTranspileErrors(value: js.Array[js.Tuple2[js.UndefOr[FilePathKey], js.Array[Diagnostic]]]): Self = StObject.set(x, "transpileErrors", value.asInstanceOf[js.Any])
    
    inline def setTranspileErrorsVarargs(value: (js.Tuple2[js.UndefOr[FilePathKey], js.Array[Diagnostic]])*): Self = StObject.set(x, "transpileErrors", js.Array(value*))
  }
}
