package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClustererOptionsInject extends StObject {
  
  var gridSize: js.UndefOr[Double] = js.undefined
  
  var groupByCoordinates: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr[js.Array[Double] | Double] = js.undefined
  
  var maxZoom: js.UndefOr[js.Array[Double] | Double] = js.undefined
  
  var minClusterSize: js.UndefOr[Double] = js.undefined
  
  var preset: js.UndefOr[PresetKey] = js.undefined
  
  var showInAlphabeticalOrder: js.UndefOr[Boolean] = js.undefined
  
  var useMapMargin: js.UndefOr[Boolean] = js.undefined
  
  var viewportMargin: js.UndefOr[js.Array[Double] | Double] = js.undefined
  
  var zoomMargin: js.UndefOr[js.Array[Double] | Double] = js.undefined
}
object IClustererOptionsInject {
  
  inline def apply(): IClustererOptionsInject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClustererOptionsInject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClustererOptionsInject] (val x: Self) extends AnyVal {
    
    inline def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    inline def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
    
    inline def setGroupByCoordinates(value: Boolean): Self = StObject.set(x, "groupByCoordinates", value.asInstanceOf[js.Any])
    
    inline def setGroupByCoordinatesUndefined: Self = StObject.set(x, "groupByCoordinates", js.undefined)
    
    inline def setMargin(value: js.Array[Double] | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setMaxZoom(value: js.Array[Double] | Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMaxZoomVarargs(value: Double*): Self = StObject.set(x, "maxZoom", js.Array(value*))
    
    inline def setMinClusterSize(value: Double): Self = StObject.set(x, "minClusterSize", value.asInstanceOf[js.Any])
    
    inline def setMinClusterSizeUndefined: Self = StObject.set(x, "minClusterSize", js.undefined)
    
    inline def setPreset(value: PresetKey): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setShowInAlphabeticalOrder(value: Boolean): Self = StObject.set(x, "showInAlphabeticalOrder", value.asInstanceOf[js.Any])
    
    inline def setShowInAlphabeticalOrderUndefined: Self = StObject.set(x, "showInAlphabeticalOrder", js.undefined)
    
    inline def setUseMapMargin(value: Boolean): Self = StObject.set(x, "useMapMargin", value.asInstanceOf[js.Any])
    
    inline def setUseMapMarginUndefined: Self = StObject.set(x, "useMapMargin", js.undefined)
    
    inline def setViewportMargin(value: js.Array[Double] | Double): Self = StObject.set(x, "viewportMargin", value.asInstanceOf[js.Any])
    
    inline def setViewportMarginUndefined: Self = StObject.set(x, "viewportMargin", js.undefined)
    
    inline def setViewportMarginVarargs(value: Double*): Self = StObject.set(x, "viewportMargin", js.Array(value*))
    
    inline def setZoomMargin(value: js.Array[Double] | Double): Self = StObject.set(x, "zoomMargin", value.asInstanceOf[js.Any])
    
    inline def setZoomMarginUndefined: Self = StObject.set(x, "zoomMargin", js.undefined)
    
    inline def setZoomMarginVarargs(value: Double*): Self = StObject.set(x, "zoomMargin", js.Array(value*))
  }
}
