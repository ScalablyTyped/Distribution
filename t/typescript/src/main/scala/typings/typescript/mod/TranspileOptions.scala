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
  
  @scala.inline
  def apply(): TranspileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranspileOptions]
  }
  
  @scala.inline
  implicit class TranspileOptionsMutableBuilder[Self <: TranspileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    @scala.inline
    def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setModuleName(value: java.lang.String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    @scala.inline
    def setRenamedDependencies(value: MapLike[java.lang.String]): Self = StObject.set(x, "renamedDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenamedDependenciesUndefined: Self = StObject.set(x, "renamedDependencies", js.undefined)
    
    @scala.inline
    def setReportDiagnostics(value: Boolean): Self = StObject.set(x, "reportDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportDiagnosticsUndefined: Self = StObject.set(x, "reportDiagnostics", js.undefined)
    
    @scala.inline
    def setTransformers(value: CustomTransformers): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
  }
}
