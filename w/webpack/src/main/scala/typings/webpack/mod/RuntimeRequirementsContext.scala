package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeRequirementsContext extends StObject {
  
  /**
  	 * the chunk graph
  	 */
  var chunkGraph: ChunkGraph
  
  /**
  	 * the code generation results
  	 */
  var codeGenerationResults: CodeGenerationResults
}
object RuntimeRequirementsContext {
  
  inline def apply(chunkGraph: ChunkGraph, codeGenerationResults: CodeGenerationResults): RuntimeRequirementsContext = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeRequirementsContext]
  }
  
  extension [Self <: RuntimeRequirementsContext](x: Self) {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResults(value: CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
  }
}
