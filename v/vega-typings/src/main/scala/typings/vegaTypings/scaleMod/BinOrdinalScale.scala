package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.`bin-ordinal`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinOrdinalScale
  extends StObject
     with BaseScale
     with Scale {
  
  var bins: js.UndefOr[ScaleBins] = js.undefined
  
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  
  var range: js.UndefOr[RangeScheme | ScaleData] = js.undefined
  
  @JSName("type")
  var type_BinOrdinalScale: `bin-ordinal`
}
object BinOrdinalScale {
  
  inline def apply(name: String): BinOrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bin-ordinal")
    __obj.asInstanceOf[BinOrdinalScale]
  }
  
  extension [Self <: BinOrdinalScale](x: Self) {
    
    inline def setBins(value: ScaleBins): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    inline def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    inline def setBinsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bins", js.Array(value*))
    
    inline def setInterpolate(value: ScaleInterpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setRange(value: RangeScheme | ScaleData): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setType(value: `bin-ordinal`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
