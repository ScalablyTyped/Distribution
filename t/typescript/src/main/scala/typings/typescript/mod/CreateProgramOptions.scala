package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProgramOptions extends StObject {
  
  var configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  
  var host: js.UndefOr[CompilerHost] = js.native
  
  var oldProgram: js.UndefOr[Program] = js.native
  
  var options: CompilerOptions = js.native
  
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
  
  var rootNames: js.Array[java.lang.String] = js.native
}
object CreateProgramOptions {
  
  @scala.inline
  def apply(options: CompilerOptions, rootNames: js.Array[java.lang.String]): CreateProgramOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProgramOptions]
  }
  
  @scala.inline
  implicit class CreateProgramOptionsMutableBuilder[Self <: CreateProgramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigFileParsingDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "configFileParsingDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFileParsingDiagnosticsUndefined: Self = StObject.set(x, "configFileParsingDiagnostics", js.undefined)
    
    @scala.inline
    def setConfigFileParsingDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "configFileParsingDiagnostics", js.Array(value :_*))
    
    @scala.inline
    def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setOldProgram(value: Program): Self = StObject.set(x, "oldProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldProgramUndefined: Self = StObject.set(x, "oldProgram", js.undefined)
    
    @scala.inline
    def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferences(value: js.Array[ProjectReference]): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferencesUndefined: Self = StObject.set(x, "projectReferences", js.undefined)
    
    @scala.inline
    def setProjectReferencesVarargs(value: ProjectReference*): Self = StObject.set(x, "projectReferences", js.Array(value :_*))
    
    @scala.inline
    def setRootNames(value: js.Array[java.lang.String]): Self = StObject.set(x, "rootNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNamesVarargs(value: java.lang.String*): Self = StObject.set(x, "rootNames", js.Array(value :_*))
  }
}
