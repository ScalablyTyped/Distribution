package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkRenderContext extends StObject {
  
  /**
  	 * the chunk
  	 */
  var chunk: Chunk
  
  /**
  	 * the chunk graph
  	 */
  var chunkGraph: ChunkGraph
  
  /**
  	 * init fragments for the chunk
  	 */
  var chunkInitFragments: js.Array[InitFragment[ChunkRenderContext]]
  
  /**
  	 * results of code generation
  	 */
  var codeGenerationResults: CodeGenerationResults
  
  /**
  	 * the dependency templates
  	 */
  var dependencyTemplates: DependencyTemplates
  
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
object ChunkRenderContext {
  
  inline def apply(
    chunk: Chunk,
    chunkGraph: ChunkGraph,
    chunkInitFragments: js.Array[InitFragment[ChunkRenderContext]],
    codeGenerationResults: CodeGenerationResults,
    dependencyTemplates: DependencyTemplates,
    moduleGraph: ModuleGraph,
    runtimeTemplate: RuntimeTemplate,
    strictMode: Boolean
  ): ChunkRenderContext = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], chunkGraph = chunkGraph.asInstanceOf[js.Any], chunkInitFragments = chunkInitFragments.asInstanceOf[js.Any], codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any], dependencyTemplates = dependencyTemplates.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any], strictMode = strictMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkRenderContext]
  }
  
  extension [Self <: ChunkRenderContext](x: Self) {
    
    inline def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setChunkInitFragments(value: js.Array[InitFragment[ChunkRenderContext]]): Self = StObject.set(x, "chunkInitFragments", value.asInstanceOf[js.Any])
    
    inline def setChunkInitFragmentsVarargs(value: InitFragment[ChunkRenderContext]*): Self = StObject.set(x, "chunkInitFragments", js.Array(value*))
    
    inline def setCodeGenerationResults(value: CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setDependencyTemplates(value: DependencyTemplates): Self = StObject.set(x, "dependencyTemplates", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
  }
}
