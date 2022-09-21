package typings.webpack.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyTemplateContext extends StObject {
  
  /**
  	 * the chunk graph
  	 */
  var chunkGraph: ChunkGraph
  
  /**
  	 * the code generation results
  	 */
  var codeGenerationResults: CodeGenerationResults
  
  /**
  	 * when in a concatenated module, information about other concatenated modules
  	 */
  var concatenationScope: js.UndefOr[ConcatenationScope] = js.undefined
  
  /**
  	 * the dependency templates
  	 */
  var dependencyTemplates: DependencyTemplates
  
  /**
  	 * mutable array of init fragments for the current module
  	 */
  var initFragments: js.Array[InitFragment[GenerateContext]]
  
  /**
  	 * current module
  	 */
  var module: Module
  
  /**
  	 * the module graph
  	 */
  var moduleGraph: ModuleGraph
  
  /**
  	 * current runtimes, for which code is generated
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
}
object DependencyTemplateContext {
  
  inline def apply(
    chunkGraph: ChunkGraph,
    codeGenerationResults: CodeGenerationResults,
    dependencyTemplates: DependencyTemplates,
    initFragments: js.Array[InitFragment[GenerateContext]],
    module: Module,
    moduleGraph: ModuleGraph,
    runtimeRequirements: Set[String],
    runtimeTemplate: RuntimeTemplate
  ): DependencyTemplateContext = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any], dependencyTemplates = dependencyTemplates.asInstanceOf[js.Any], initFragments = initFragments.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyTemplateContext]
  }
  
  extension [Self <: DependencyTemplateContext](x: Self) {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResults(value: CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setConcatenationScope(value: ConcatenationScope): Self = StObject.set(x, "concatenationScope", value.asInstanceOf[js.Any])
    
    inline def setConcatenationScopeUndefined: Self = StObject.set(x, "concatenationScope", js.undefined)
    
    inline def setDependencyTemplates(value: DependencyTemplates): Self = StObject.set(x, "dependencyTemplates", value.asInstanceOf[js.Any])
    
    inline def setInitFragments(value: js.Array[InitFragment[GenerateContext]]): Self = StObject.set(x, "initFragments", value.asInstanceOf[js.Any])
    
    inline def setInitFragmentsVarargs(value: InitFragment[GenerateContext]*): Self = StObject.set(x, "initFragments", js.Array(value*))
    
    inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
