package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatenationBailoutReasonContext extends StObject {
  
  /**
  	 * the chunk graph
  	 */
  var chunkGraph: ChunkGraph
  
  /**
  	 * the module graph
  	 */
  var moduleGraph: ModuleGraph
}
object ConcatenationBailoutReasonContext {
  
  inline def apply(chunkGraph: ChunkGraph, moduleGraph: ModuleGraph): ConcatenationBailoutReasonContext = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatenationBailoutReasonContext]
  }
  
  extension [Self <: ConcatenationBailoutReasonContext](x: Self) {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
  }
}
