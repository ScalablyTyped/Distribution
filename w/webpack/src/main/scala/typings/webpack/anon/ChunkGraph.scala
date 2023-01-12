package typings.webpack.anon

import org.scalablytyped.runtime.Instantiable0
import typings.webpack.mod.RequestShortener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkGraph extends StObject {
  
  /**
  				 * chunk graph
  				 */
  var chunkGraph: typings.webpack.mod.ChunkGraph
  
  /**
  				 * the hash function to use
  				 */
  var hashFunction: String | Instantiable0[typings.webpack.mod.Hash]
  
  /**
  				 * requestShortener
  				 */
  var requestShortener: RequestShortener
}
object ChunkGraph {
  
  inline def apply(
    chunkGraph: typings.webpack.mod.ChunkGraph,
    hashFunction: String | Instantiable0[typings.webpack.mod.Hash],
    requestShortener: RequestShortener
  ): ChunkGraph = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], hashFunction = hashFunction.asInstanceOf[js.Any], requestShortener = requestShortener.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkGraph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkGraph] (val x: Self) extends AnyVal {
    
    inline def setChunkGraph(value: typings.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setHashFunction(value: String | Instantiable0[typings.webpack.mod.Hash]): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
    
    inline def setRequestShortener(value: RequestShortener): Self = StObject.set(x, "requestShortener", value.asInstanceOf[js.Any])
  }
}
