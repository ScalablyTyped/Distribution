package typings.yandexMaps.mod

import typings.yandexMaps.mod.control.RulerControl
import typings.yandexMaps.mod.control.TypeSelector
import typings.yandexMaps.mod.control.ZoomControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapState extends StObject {
  
  var behaviors: js.UndefOr[js.Array[String]] = js.undefined
  
  var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  
  var controls: js.UndefOr[js.Array[String | ZoomControl | RulerControl | TypeSelector]] = js.undefined
  
  var margin: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.undefined
  
  var `type`: js.UndefOr["yandex#map" | "yandex#satellite" | "yandex#hybrid"] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object IMapState {
  
  inline def apply(): IMapState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapState]
  }
  
  extension [Self <: IMapState](x: Self) {
    
    inline def setBehaviors(value: js.Array[String]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    inline def setBehaviorsVarargs(value: String*): Self = StObject.set(x, "behaviors", js.Array(value*))
    
    inline def setBounds(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setControls(value: js.Array[String | ZoomControl | RulerControl | TypeSelector]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: (String | ZoomControl | RulerControl | TypeSelector)*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setMargin(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setType(value: "yandex#map" | "yandex#satellite" | "yandex#hybrid"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
