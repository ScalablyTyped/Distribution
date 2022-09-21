package typings.webpackDevServer.mod

import typings.node.httpMod.ServerResponse
import typings.serveIndex.mod.Options
import typings.webpackDevServer.anon.WatchOptionsaggregateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Static extends StObject {
  
  var directory: js.UndefOr[String] = js.undefined
  
  var publicPath: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var serveIndex: js.UndefOr[Boolean | Options] = js.undefined
  
  var staticOptions: js.UndefOr[
    typings.serveStatic.mod.ServeStaticOptions[ServerResponse[typings.node.httpMod.IncomingMessage]]
  ] = js.undefined
  
  var watch: js.UndefOr[Boolean | WatchOptionsaggregateTime] = js.undefined
}
object Static {
  
  inline def apply(): Static = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Static]
  }
  
  extension [Self <: Static](x: Self) {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setPublicPath(value: String | js.Array[String]): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setPublicPathVarargs(value: String*): Self = StObject.set(x, "publicPath", js.Array(value*))
    
    inline def setServeIndex(value: Boolean | Options): Self = StObject.set(x, "serveIndex", value.asInstanceOf[js.Any])
    
    inline def setServeIndexUndefined: Self = StObject.set(x, "serveIndex", js.undefined)
    
    inline def setStaticOptions(
      value: typings.serveStatic.mod.ServeStaticOptions[ServerResponse[typings.node.httpMod.IncomingMessage]]
    ): Self = StObject.set(x, "staticOptions", value.asInstanceOf[js.Any])
    
    inline def setStaticOptionsUndefined: Self = StObject.set(x, "staticOptions", js.undefined)
    
    inline def setWatch(value: Boolean | WatchOptionsaggregateTime): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
