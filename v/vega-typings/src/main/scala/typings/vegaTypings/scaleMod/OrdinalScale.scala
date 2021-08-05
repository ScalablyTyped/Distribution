package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.ordinal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdinalScale
  extends StObject
     with BaseScale
     with Scale {
  
  var domainImplicit: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  
  var range: js.UndefOr[RangeScheme | ScaleData] = js.undefined
  
  @JSName("type")
  var type_OrdinalScale: ordinal
}
object OrdinalScale {
  
  inline def apply(name: String): OrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ordinal")
    __obj.asInstanceOf[OrdinalScale]
  }
  
  extension [Self <: OrdinalScale](x: Self) {
    
    inline def setDomainImplicit(value: Boolean | SignalRef): Self = StObject.set(x, "domainImplicit", value.asInstanceOf[js.Any])
    
    inline def setDomainImplicitUndefined: Self = StObject.set(x, "domainImplicit", js.undefined)
    
    inline def setInterpolate(value: ScaleInterpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setRange(value: RangeScheme | ScaleData): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    inline def setType(value: ordinal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
