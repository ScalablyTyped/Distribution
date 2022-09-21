package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: js.UndefOr[js.Array[Double] | String] = js.undefined
  
  var layer: js.UndefOr[typings.yandexMaps.mod.panorama.Layer] = js.undefined
  
  var span: js.UndefOr[js.Array[Double] | String] = js.undefined
}
object Direction {
  
  inline def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: js.Array[Double] | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDirectionVarargs(value: Double*): Self = StObject.set(x, "direction", js.Array(value*))
    
    inline def setLayer(value: typings.yandexMaps.mod.panorama.Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setSpan(value: js.Array[Double] | String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value*))
  }
}
