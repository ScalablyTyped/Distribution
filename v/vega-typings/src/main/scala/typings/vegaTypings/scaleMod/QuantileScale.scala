package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.quantile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuantileScale
  extends StObject
     with BaseScale
     with Scale {
  
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  
  var range: js.UndefOr[RangeScheme] = js.undefined
  
  @JSName("type")
  var type_QuantileScale: js.UndefOr[quantile] = js.undefined
}
object QuantileScale {
  
  @scala.inline
  def apply(name: String): QuantileScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileScale]
  }
  
  @scala.inline
  implicit class QuantileScaleMutableBuilder[Self <: QuantileScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterpolate(value: ScaleInterpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    @scala.inline
    def setRange(value: RangeScheme): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setType(value: quantile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
