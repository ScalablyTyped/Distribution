package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.threshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThresholdScale
  extends StObject
     with BaseScale
     with Scale {
  
  var nice: js.UndefOr[Boolean | Double | SignalRef] = js.undefined
  
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  
  var range: js.UndefOr[RangeScheme] = js.undefined
  
  @JSName("type")
  var type_ThresholdScale: js.UndefOr[threshold] = js.undefined
  
  var zero: js.UndefOr[Boolean | SignalRef] = js.undefined
}
object ThresholdScale {
  
  inline def apply(name: String): ThresholdScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdScale]
  }
  
  extension [Self <: ThresholdScale](x: Self) {
    
    inline def setNice(value: Boolean | Double | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    inline def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRange(value: RangeScheme): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    inline def setType(value: threshold): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setZero(value: Boolean | SignalRef): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
