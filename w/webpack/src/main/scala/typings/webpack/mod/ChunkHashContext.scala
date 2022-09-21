package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkHashContext extends StObject {
  
  /**
  	 * the chunk graph
  	 */
  var chunkGraph: ChunkGraph
  
  /**
  	 * results of code generation
  	 */
  var codeGenerationResults: CodeGenerationResults
  
  /**
  	 * the module graph
  	 */
  var moduleGraph: ModuleGraph
  
  /**
  	 * the runtime template
  	 */
  var runtimeTemplate: RuntimeTemplate
}
object ChunkHashContext {
  
  inline def apply(
    chunkGraph: ChunkGraph,
    codeGenerationResults: CodeGenerationResults,
    moduleGraph: ModuleGraph,
    runtimeTemplate: RuntimeTemplate
  ): ChunkHashContext = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkHashContext]
  }
  
  extension [Self <: ChunkHashContext](x: Self) {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResults(value: CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
  }
}
