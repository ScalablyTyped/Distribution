package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathData extends StObject {
  
  var basename: js.UndefOr[String] = js.undefined
  
  var chunk: js.UndefOr[Chunk | ChunkPathData] = js.undefined
  
  var chunkGraph: js.UndefOr[ChunkGraph] = js.undefined
  
  var contentHash: js.UndefOr[String] = js.undefined
  
  var contentHashType: js.UndefOr[String] = js.undefined
  
  var contentHashWithLength: js.UndefOr[js.Function1[/* arg0 */ Double, String]] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
  
  var hashWithLength: js.UndefOr[js.Function1[/* arg0 */ Double, String]] = js.undefined
  
  var module: js.UndefOr[Module | ModulePathData] = js.undefined
  
  var noChunkHash: js.UndefOr[Boolean] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var runtime: js.UndefOr[RuntimeSpec] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PathData {
  
  inline def apply(): PathData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathData] (val x: Self) extends AnyVal {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    inline def setChunk(value: Chunk | ChunkPathData): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setChunkGraphUndefined: Self = StObject.set(x, "chunkGraph", js.undefined)
    
    inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
    
    inline def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    inline def setContentHashType(value: String): Self = StObject.set(x, "contentHashType", value.asInstanceOf[js.Any])
    
    inline def setContentHashTypeUndefined: Self = StObject.set(x, "contentHashType", js.undefined)
    
    inline def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    inline def setContentHashWithLength(value: /* arg0 */ Double => String): Self = StObject.set(x, "contentHashWithLength", js.Any.fromFunction1(value))
    
    inline def setContentHashWithLengthUndefined: Self = StObject.set(x, "contentHashWithLength", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setHashWithLength(value: /* arg0 */ Double => String): Self = StObject.set(x, "hashWithLength", js.Any.fromFunction1(value))
    
    inline def setHashWithLengthUndefined: Self = StObject.set(x, "hashWithLength", js.undefined)
    
    inline def setModule(value: Module | ModulePathData): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setNoChunkHash(value: Boolean): Self = StObject.set(x, "noChunkHash", value.asInstanceOf[js.Any])
    
    inline def setNoChunkHashUndefined: Self = StObject.set(x, "noChunkHash", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
