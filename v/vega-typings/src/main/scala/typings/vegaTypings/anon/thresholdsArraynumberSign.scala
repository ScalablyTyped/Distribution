package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.ContourTransform
import typings.vegaTypings.transformMod.FieldRef
import typings.vegaTypings.vegaTypingsStrings.contour
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  thresholds :std.Array<number | vega-typings.vega-typings/types/spec.SignalRef> | vega-typings.vega-typings/types/spec.SignalRef | undefined} & {  type :'contour',   signal :string | undefined,   size :std.Array<number | vega-typings.vega-typings/types/spec.SignalRef> | vega-typings.vega-typings/types/spec.SignalRef,   values :std.Array<number | vega-typings.vega-typings/types/spec.SignalRef> | vega-typings.vega-typings/types/spec.SignalRef | undefined,   x :vega-typings.vega-typings/types/spec/transform.FieldRef | undefined,   y :vega-typings.vega-typings/types/spec/transform.FieldRef | undefined,   cellSize :number | vega-typings.vega-typings/types/spec.SignalRef | undefined,   bandwidth :number | vega-typings.vega-typings/types/spec.SignalRef | undefined} */
trait thresholdsArraynumberSign
  extends StObject
     with ContourTransform {
  
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  
  var cellSize: js.UndefOr[Double | SignalRef] = js.undefined
  
  var signal: js.UndefOr[String] = js.undefined
  
  var size: (js.Array[Double | SignalRef]) | SignalRef
  
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  
  var `type`: contour
  
  // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var values: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  
  var x: js.UndefOr[FieldRef] = js.undefined
  
  var y: js.UndefOr[FieldRef] = js.undefined
}
object thresholdsArraynumberSign {
  
  inline def apply(size: (js.Array[Double | SignalRef]) | SignalRef): thresholdsArraynumberSign = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[thresholdsArraynumberSign]
  }
  
  extension [Self <: thresholdsArraynumberSign](x: Self) {
    
    inline def setBandwidth(value: Double | SignalRef): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setCellSize(value: Double | SignalRef): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
    
    inline def setCellSizeUndefined: Self = StObject.set(x, "cellSize", js.undefined)
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSize(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "size", js.Array(value*))
    
    inline def setThresholds(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    inline def setThresholdsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setType(value: contour): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setX(value: FieldRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: FieldRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
