package typings.webpackDevServer.mod

import typings.webpackDevServer.webpackDevServerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedStatic extends StObject {
  
  var directory: String
  
  var publicPath: js.Array[String]
  
  var serveIndex: `false` | ServeIndexOptions
  
  var staticOptions: ServeStaticOptions
  
  var watch: `false` | WatchOptions
}
object NormalizedStatic {
  
  inline def apply(
    directory: String,
    publicPath: js.Array[String],
    serveIndex: `false` | ServeIndexOptions,
    staticOptions: ServeStaticOptions,
    watch: `false` | WatchOptions
  ): NormalizedStatic = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any], serveIndex = serveIndex.asInstanceOf[js.Any], staticOptions = staticOptions.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedStatic]
  }
  
  extension [Self <: NormalizedStatic](x: Self) {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setPublicPath(value: js.Array[String]): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathVarargs(value: String*): Self = StObject.set(x, "publicPath", js.Array(value*))
    
    inline def setServeIndex(value: `false` | ServeIndexOptions): Self = StObject.set(x, "serveIndex", value.asInstanceOf[js.Any])
    
    inline def setStaticOptions(value: ServeStaticOptions): Self = StObject.set(x, "staticOptions", value.asInstanceOf[js.Any])
    
    inline def setWatch(value: `false` | WatchOptions): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
  }
}
