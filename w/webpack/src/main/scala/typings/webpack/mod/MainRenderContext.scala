package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainRenderContext extends StObject {
  
  /**
  	 * the chunk
  	 */
  var chunk: Chunk
  
  /**
  	 * the chunk graph
  	 */
  var chunkGraph: ChunkGraph
  
  /**
  	 * results of code generation
  	 */
  var codeGenerationResults: CodeGenerationResults
  
  /**
  	 * the dependency templates
  	 */
  var dependencyTemplates: DependencyTemplates
  
  /**
  	 * hash to be used for render call
  	 */
  var hash: String
  
  /**
  	 * the module graph
  	 */
  var moduleGraph: ModuleGraph
  
  /**
  	 * the runtime template
  	 */
  var runtimeTemplate: RuntimeTemplate
  
  /**
  	 * rendering in strict context
  	 */
  var strictMode: Boolean
}
object MainRenderContext {
  
  inline def apply(
    chunk: Chunk,
    chunkGraph: ChunkGraph,
    codeGenerationResults: CodeGenerationResults,
    dependencyTemplates: DependencyTemplates,
    hash: String,
    moduleGraph: ModuleGraph,
    runtimeTemplate: RuntimeTemplate,
    strictMode: Boolean
  ): MainRenderContext = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], chunkGraph = chunkGraph.asInstanceOf[js.Any], codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any], dependencyTemplates = dependencyTemplates.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any], strictMode = strictMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainRenderContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MainRenderContext] (val x: Self) extends AnyVal {
    
    inline def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResults(value: CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setDependencyTemplates(value: DependencyTemplates): Self = StObject.set(x, "dependencyTemplates", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
  }
}
