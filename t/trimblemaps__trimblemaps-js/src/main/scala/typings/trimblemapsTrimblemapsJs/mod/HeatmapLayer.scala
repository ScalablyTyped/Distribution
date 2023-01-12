package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.heatmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapLayer
  extends StObject
     with Layer
     with AnyLayer {
  
  @JSName("layout")
  var layout_HeatmapLayer: js.UndefOr[HeatmapLayout] = js.undefined
  
  @JSName("paint")
  var paint_HeatmapLayer: js.UndefOr[HeatmapPaint] = js.undefined
  
  @JSName("type")
  var type_HeatmapLayer: heatmap
}
object HeatmapLayer {
  
  inline def apply(id: String): HeatmapLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[HeatmapLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatmapLayer] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: HeatmapLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: HeatmapPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: heatmap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
