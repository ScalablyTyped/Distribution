package typings.webpack.anon

import org.scalablytyped.runtime.Instantiable0
import typings.webpack.mod.RequestShortener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashFunction extends StObject {
  
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
object HashFunction {
  
  inline def apply(
    chunkGraph: typings.webpack.mod.ChunkGraph,
    hashFunction: String | Instantiable0[typings.webpack.mod.Hash],
    requestShortener: RequestShortener
  ): HashFunction = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], hashFunction = hashFunction.asInstanceOf[js.Any], requestShortener = requestShortener.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashFunction]
  }
  
  extension [Self <: HashFunction](x: Self) {
    
    inline def setChunkGraph(value: typings.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setHashFunction(value: String | Instantiable0[typings.webpack.mod.Hash]): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
    
    inline def setRequestShortener(value: RequestShortener): Self = StObject.set(x, "requestShortener", value.asInstanceOf[js.Any])
  }
}
