package typings.webpackDevServer.mod

import typings.webpackDevServer.anon.WatchOptionsaggregateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchFiles extends StObject {
  
  var options: js.UndefOr[WatchOptionsaggregateTime] = js.undefined
  
  var paths: String | js.Array[String]
}
object WatchFiles {
  
  inline def apply(paths: String | js.Array[String]): WatchFiles = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchFiles]
  }
  
  extension [Self <: WatchFiles](x: Self) {
    
    inline def setOptions(value: WatchOptionsaggregateTime): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPaths(value: String | js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
