package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClustererOptions extends StObject {
  
  var gridSize: js.UndefOr[Double] = js.native
  
  var groupByCoordinates: js.UndefOr[Boolean] = js.native
  
  var hasBalloon: js.UndefOr[Boolean] = js.native
  
  var hasHint: js.UndefOr[Boolean] = js.native
  
  var margin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  
  var maxZoom: js.UndefOr[js.Array[Double] | Double] = js.native
  
  var minClusterSize: js.UndefOr[Double] = js.native
  
  var preset: js.UndefOr[PresetKey] = js.native
  
  var showInAlphabeticalOrder: js.UndefOr[Boolean] = js.native
  
  var useMapMargin: js.UndefOr[Boolean] = js.native
  
  var viewportMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  
  var zoomMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
}
object IClustererOptions {
  
  @scala.inline
  def apply(): IClustererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClustererOptions]
  }
  
  @scala.inline
  implicit class IClustererOptionsMutableBuilder[Self <: IClustererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
    
    @scala.inline
    def setGroupByCoordinates(value: Boolean): Self = StObject.set(x, "groupByCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByCoordinatesUndefined: Self = StObject.set(x, "groupByCoordinates", js.undefined)
    
    @scala.inline
    def setHasBalloon(value: Boolean): Self = StObject.set(x, "hasBalloon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBalloonUndefined: Self = StObject.set(x, "hasBalloon", js.undefined)
    
    @scala.inline
    def setHasHint(value: Boolean): Self = StObject.set(x, "hasHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHintUndefined: Self = StObject.set(x, "hasHint", js.undefined)
    
    @scala.inline
    def setMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    @scala.inline
    def setMaxZoom(value: js.Array[Double] | Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMaxZoomVarargs(value: Double*): Self = StObject.set(x, "maxZoom", js.Array(value :_*))
    
    @scala.inline
    def setMinClusterSize(value: Double): Self = StObject.set(x, "minClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinClusterSizeUndefined: Self = StObject.set(x, "minClusterSize", js.undefined)
    
    @scala.inline
    def setPreset(value: PresetKey): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    @scala.inline
    def setShowInAlphabeticalOrder(value: Boolean): Self = StObject.set(x, "showInAlphabeticalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInAlphabeticalOrderUndefined: Self = StObject.set(x, "showInAlphabeticalOrder", js.undefined)
    
    @scala.inline
    def setUseMapMargin(value: Boolean): Self = StObject.set(x, "useMapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMapMarginUndefined: Self = StObject.set(x, "useMapMargin", js.undefined)
    
    @scala.inline
    def setViewportMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "viewportMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportMarginUndefined: Self = StObject.set(x, "viewportMargin", js.undefined)
    
    @scala.inline
    def setViewportMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "viewportMargin", js.Array(value :_*))
    
    @scala.inline
    def setZoomMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "zoomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMarginUndefined: Self = StObject.set(x, "zoomMargin", js.undefined)
    
    @scala.inline
    def setZoomMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "zoomMargin", js.Array(value :_*))
  }
}
