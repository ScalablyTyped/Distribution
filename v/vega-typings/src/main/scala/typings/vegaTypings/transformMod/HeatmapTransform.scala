package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.heatmap
import typings.vegaTypings.vegaTypingsStrings.independent
import typings.vegaTypings.vegaTypingsStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapTransform
  extends StObject
     with _Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.undefined
  
  var color: js.UndefOr[String | TransformField] = js.undefined
  
  var field: js.UndefOr[String | TransformField] = js.undefined
  
  var opacity: js.UndefOr[Double | TransformField] = js.undefined
  
  var resolve: js.UndefOr[independent | shared | SignalRef] = js.undefined
  
  var `type`: heatmap
}
object HeatmapTransform {
  
  inline def apply(): HeatmapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[HeatmapTransform]
  }
  
  extension [Self <: HeatmapTransform](x: Self) {
    
    inline def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setColor(value: String | TransformField): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setField(value: String | TransformField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOpacity(value: Double | TransformField): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setResolve(value: independent | shared | SignalRef): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setType(value: heatmap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
