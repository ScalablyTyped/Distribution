package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranspileOptions extends StObject {
  
  var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
  
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  
  var moduleName: js.UndefOr[java.lang.String] = js.undefined
  
  var renamedDependencies: js.UndefOr[MapLike[java.lang.String]] = js.undefined
  
  var reportDiagnostics: js.UndefOr[Boolean] = js.undefined
  
  var transformers: js.UndefOr[CustomTransformers] = js.undefined
}
object TranspileOptions {
  
  inline def apply(): TranspileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranspileOptions]
  }
  
  extension [Self <: TranspileOptions](x: Self) {
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setModuleName(value: java.lang.String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    inline def setRenamedDependencies(value: MapLike[java.lang.String]): Self = StObject.set(x, "renamedDependencies", value.asInstanceOf[js.Any])
    
    inline def setRenamedDependenciesUndefined: Self = StObject.set(x, "renamedDependencies", js.undefined)
    
    inline def setReportDiagnostics(value: Boolean): Self = StObject.set(x, "reportDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setReportDiagnosticsUndefined: Self = StObject.set(x, "reportDiagnostics", js.undefined)
    
    inline def setTransformers(value: CustomTransformers): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
  }
}
