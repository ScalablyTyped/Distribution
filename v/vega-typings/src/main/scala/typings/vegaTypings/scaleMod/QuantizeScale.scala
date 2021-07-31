package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.quantize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuantizeScale
  extends StObject
     with BaseScale
     with Scale {
  
  var nice: js.UndefOr[Boolean | Double | SignalRef] = js.undefined
  
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  
  var range: js.UndefOr[RangeScheme] = js.undefined
  
  @JSName("type")
  var type_QuantizeScale: js.UndefOr[quantize] = js.undefined
  
  var zero: js.UndefOr[Boolean | SignalRef] = js.undefined
}
object QuantizeScale {
  
  @scala.inline
  def apply(name: String): QuantizeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantizeScale]
  }
  
  @scala.inline
  implicit class QuantizeScaleMutableBuilder[Self <: QuantizeScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNice(value: Boolean | Double | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRange(value: RangeScheme): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setType(value: quantize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setZero(value: Boolean | SignalRef): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
