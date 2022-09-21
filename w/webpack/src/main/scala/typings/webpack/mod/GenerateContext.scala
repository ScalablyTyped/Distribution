package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateContext extends StObject {
  
  /**
  	 * the chunk graph
  	 */
  var chunkGraph: ChunkGraph
  
  /**
  	 * code generation results of other modules (need to have a codeGenerationDependency to use that)
  	 */
  var codeGenerationResults: js.UndefOr[CodeGenerationResults] = js.undefined
  
  /**
  	 * when in concatenated module, information about other concatenated modules
  	 */
  var concatenationScope: js.UndefOr[ConcatenationScope] = js.undefined
  
  /**
  	 * mapping from dependencies to templates
  	 */
  var dependencyTemplates: DependencyTemplates
  
  /**
  	 * get access to the code generation data
  	 */
  var getData: js.UndefOr[js.Function0[Map[String, Any]]] = js.undefined
  
  /**
  	 * the module graph
  	 */
  var moduleGraph: ModuleGraph
  
  /**
  	 * the runtime
  	 */
  var runtime: RuntimeSpec
  
  /**
  	 * the requirements for runtime
  	 */
  var runtimeRequirements: Set[String]
  
  /**
  	 * the runtime template
  	 */
  var runtimeTemplate: RuntimeTemplate
  
  /**
  	 * which kind of code should be generated
  	 */
  var `type`: String
}
object GenerateContext {
  
  inline def apply(
    chunkGraph: ChunkGraph,
    dependencyTemplates: DependencyTemplates,
    moduleGraph: ModuleGraph,
    runtimeRequirements: Set[String],
    runtimeTemplate: RuntimeTemplate,
    `type`: String
  ): GenerateContext = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], dependencyTemplates = dependencyTemplates.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateContext]
  }
  
  extension [Self <: GenerateContext](x: Self) {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResults(value: CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResultsUndefined: Self = StObject.set(x, "codeGenerationResults", js.undefined)
    
    inline def setConcatenationScope(value: ConcatenationScope): Self = StObject.set(x, "concatenationScope", value.asInstanceOf[js.Any])
    
    inline def setConcatenationScopeUndefined: Self = StObject.set(x, "concatenationScope", js.undefined)
    
    inline def setDependencyTemplates(value: DependencyTemplates): Self = StObject.set(x, "dependencyTemplates", value.asInstanceOf[js.Any])
    
    inline def setGetData(value: () => Map[String, Any]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
