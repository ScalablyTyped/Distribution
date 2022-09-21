package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheGroupsContext extends StObject {
  
  var chunkGraph: ChunkGraph
  
  var moduleGraph: ModuleGraph
}
object CacheGroupsContext {
  
  inline def apply(chunkGraph: ChunkGraph, moduleGraph: ModuleGraph): CacheGroupsContext = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheGroupsContext]
  }
  
  extension [Self <: CacheGroupsContext](x: Self) {
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
  }
}
