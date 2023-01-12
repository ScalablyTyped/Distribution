package typings.vite.mod

import typings.rollup.mod.OutputBundle
import typings.rollup.mod.OutputChunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexHtmlTransformContext extends StObject {
  
  var bundle: js.UndefOr[OutputBundle] = js.undefined
  
  var chunk: js.UndefOr[OutputChunk] = js.undefined
  
  /**
    * filename on disk
    */
  var filename: String
  
  var originalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * public path when served
    */
  var path: String
  
  var server: js.UndefOr[ViteDevServer] = js.undefined
}
object IndexHtmlTransformContext {
  
  inline def apply(filename: String, path: String): IndexHtmlTransformContext = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexHtmlTransformContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexHtmlTransformContext] (val x: Self) extends AnyVal {
    
    inline def setBundle(value: OutputBundle): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
    
    inline def setChunk(value: OutputChunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
    
    inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setServer(value: ViteDevServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
