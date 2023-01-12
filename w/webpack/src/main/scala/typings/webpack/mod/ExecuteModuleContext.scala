package typings.webpack.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteModuleContext extends StObject {
  
  var __webpack_require__ : js.UndefOr[js.Function1[/* arg0 */ String, Any]] = js.undefined
  
  var assets: Map[String, typings.webpack.anon.Source]
  
  var chunk: Chunk
  
  var chunkGraph: ChunkGraph
}
object ExecuteModuleContext {
  
  inline def apply(assets: Map[String, typings.webpack.anon.Source], chunk: Chunk, chunkGraph: ChunkGraph): ExecuteModuleContext = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], chunk = chunk.asInstanceOf[js.Any], chunkGraph = chunkGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteModuleContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteModuleContext] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: Map[String, typings.webpack.anon.Source]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def set__webpack_require__(value: /* arg0 */ String => Any): Self = StObject.set(x, "__webpack_require__", js.Any.fromFunction1(value))
    
    inline def set__webpack_require__Undefined: Self = StObject.set(x, "__webpack_require__", js.undefined)
  }
}
