package typings.vite.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.rollup.mod.SourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendOptions extends StObject {
  
  var cacheControl: js.UndefOr[String] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  
  var map: js.UndefOr[SourceMap | Null] = js.undefined
}
object SendOptions {
  
  inline def apply(): SendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendOptions]
  }
  
  extension [Self <: SendOptions](x: Self) {
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
