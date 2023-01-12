package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapPaint
  extends StObject
     with AnyPaint {
  
  var `heatmap-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `heatmap-intensity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `heatmap-intensity-transition`: js.UndefOr[Transition] = js.undefined
  
  var `heatmap-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `heatmap-opacity-transition`: js.UndefOr[Transition] = js.undefined
  
  var `heatmap-radius`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `heatmap-radius-transition`: js.UndefOr[Transition] = js.undefined
  
  var `heatmap-weight`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
}
object HeatmapPaint {
  
  inline def apply(): HeatmapPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapPaint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatmapPaint] (val x: Self) extends AnyVal {
    
    inline def `setHeatmap-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "heatmap-color", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-colorUndefined`: Self = StObject.set(x, "heatmap-color", js.undefined)
    
    inline def `setHeatmap-intensity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "heatmap-intensity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-intensity-transition`(value: Transition): Self = StObject.set(x, "heatmap-intensity-transition", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-intensity-transitionUndefined`: Self = StObject.set(x, "heatmap-intensity-transition", js.undefined)
    
    inline def `setHeatmap-intensityUndefined`: Self = StObject.set(x, "heatmap-intensity", js.undefined)
    
    inline def `setHeatmap-opacity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "heatmap-opacity", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-opacity-transition`(value: Transition): Self = StObject.set(x, "heatmap-opacity-transition", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-opacity-transitionUndefined`: Self = StObject.set(x, "heatmap-opacity-transition", js.undefined)
    
    inline def `setHeatmap-opacityUndefined`: Self = StObject.set(x, "heatmap-opacity", js.undefined)
    
    inline def `setHeatmap-radius`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "heatmap-radius", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-radius-transition`(value: Transition): Self = StObject.set(x, "heatmap-radius-transition", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-radius-transitionUndefined`: Self = StObject.set(x, "heatmap-radius-transition", js.undefined)
    
    inline def `setHeatmap-radiusUndefined`: Self = StObject.set(x, "heatmap-radius", js.undefined)
    
    inline def `setHeatmap-weight`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "heatmap-weight", value.asInstanceOf[js.Any])
    
    inline def `setHeatmap-weightUndefined`: Self = StObject.set(x, "heatmap-weight", js.undefined)
  }
}
