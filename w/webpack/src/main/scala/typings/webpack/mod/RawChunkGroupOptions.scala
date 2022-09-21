package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawChunkGroupOptions extends StObject {
  
  var prefetchOrder: js.UndefOr[Double] = js.undefined
  
  var preloadOrder: js.UndefOr[Double] = js.undefined
}
object RawChunkGroupOptions {
  
  inline def apply(): RawChunkGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawChunkGroupOptions]
  }
  
  extension [Self <: RawChunkGroupOptions](x: Self) {
    
    inline def setPrefetchOrder(value: Double): Self = StObject.set(x, "prefetchOrder", value.asInstanceOf[js.Any])
    
    inline def setPrefetchOrderUndefined: Self = StObject.set(x, "prefetchOrder", js.undefined)
    
    inline def setPreloadOrder(value: Double): Self = StObject.set(x, "preloadOrder", value.asInstanceOf[js.Any])
    
    inline def setPreloadOrderUndefined: Self = StObject.set(x, "preloadOrder", js.undefined)
  }
}
