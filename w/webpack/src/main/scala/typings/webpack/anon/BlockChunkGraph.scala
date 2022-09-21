package typings.webpack.anon

import typings.std.Set
import typings.webpack.mod.AsyncDependenciesBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockChunkGraph extends StObject {
  
  /**
  		 * the async block
  		 */
  var block: AsyncDependenciesBlock
  
  /**
  		 * the chunk graph
  		 */
  var chunkGraph: typings.webpack.mod.ChunkGraph
  
  /**
  		 * request string used originally
  		 */
  var request: js.UndefOr[String] = js.undefined
  
  /**
  		 * if set, will be filled with runtime requirements
  		 */
  var runtimeRequirements: Set[String]
}
object BlockChunkGraph {
  
  inline def apply(
    block: AsyncDependenciesBlock,
    chunkGraph: typings.webpack.mod.ChunkGraph,
    runtimeRequirements: Set[String]
  ): BlockChunkGraph = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], chunkGraph = chunkGraph.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockChunkGraph]
  }
  
  extension [Self <: BlockChunkGraph](x: Self) {
    
    inline def setBlock(value: AsyncDependenciesBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setChunkGraph(value: typings.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
  }
}
