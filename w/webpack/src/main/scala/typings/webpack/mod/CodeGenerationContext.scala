package typings.webpack.mod

import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenerationContext extends StObject {
  
  /**
  	 * the chunk graph
  	 */
  var chunkGraph: ChunkGraph
  
  /**
  	 * code generation results of other modules (need to have a codeGenerationDependency to use that)
  	 */
  var codeGenerationResults: CodeGenerationResults
  
  /**
  	 * the compilation
  	 */
  var compilation: js.UndefOr[Compilation] = js.undefined
  
  /**
  	 * when in concatenated module, information about other concatenated modules
  	 */
  var concatenationScope: js.UndefOr[ConcatenationScope] = js.undefined
  
  /**
  	 * the dependency templates
  	 */
  var dependencyTemplates: DependencyTemplates
  
  /**
  	 * the module graph
  	 */
  var moduleGraph: ModuleGraph
  
  /**
  	 * the runtimes code should be generated for
  	 */
  var runtime: RuntimeSpec
  
  /**
  	 * the runtime template
  	 */
  var runtimeTemplate: RuntimeTemplate
  
  /**
  	 * source types
  	 */
  var sourceTypes: js.UndefOr[ReadonlySet[String]] = js.undefined
}
object CodeGenerationContext {
  
  inline def apply(
    chunkGraph: ChunkGraph,
    codeGenerationResults: CodeGenerationResults,
    dependencyTemplates: DependencyTemplates,
    moduleGraph: ModuleGraph,
    runtimeTemplate: RuntimeTemplate
  ): CodeGenerationContext = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any], dependencyTemplates = dependencyTemplates.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenerationContext]
  }
  
  extension [Self <: CodeGenerationContext](x: Self) {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResults(value: CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setCompilation(value: Compilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setCompilationUndefined: Self = StObject.set(x, "compilation", js.undefined)
    
    inline def setConcatenationScope(value: ConcatenationScope): Self = StObject.set(x, "concatenationScope", value.asInstanceOf[js.Any])
    
    inline def setConcatenationScopeUndefined: Self = StObject.set(x, "concatenationScope", js.undefined)
    
    inline def setDependencyTemplates(value: DependencyTemplates): Self = StObject.set(x, "dependencyTemplates", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSourceTypes(value: ReadonlySet[String]): Self = StObject.set(x, "sourceTypes", value.asInstanceOf[js.Any])
    
    inline def setSourceTypesUndefined: Self = StObject.set(x, "sourceTypes", js.undefined)
  }
}
