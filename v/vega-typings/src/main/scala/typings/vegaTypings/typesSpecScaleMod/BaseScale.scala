package typings.vegaTypings.typesSpecScaleMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseScale extends StObject {
  
  var domain: js.UndefOr[(js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef] = js.undefined
  
  var domainMax: js.UndefOr[Double | SignalRef] = js.undefined
  
  var domainMid: js.UndefOr[Double | SignalRef] = js.undefined
  
  var domainMin: js.UndefOr[Double | SignalRef] = js.undefined
  
  var domainRaw: js.UndefOr[Null | js.Array[Any] | SignalRef] = js.undefined
  
  var name: String
  
  var reverse: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var round: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var `type`: js.UndefOr[ScaleType] = js.undefined
}
object BaseScale {
  
  inline def apply(name: String): BaseScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseScale]
  }
  
  extension [Self <: BaseScale](x: Self) {
    
    inline def setDomain(value: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainMax(value: Double | SignalRef): Self = StObject.set(x, "domainMax", value.asInstanceOf[js.Any])
    
    inline def setDomainMaxUndefined: Self = StObject.set(x, "domainMax", js.undefined)
    
    inline def setDomainMid(value: Double | SignalRef): Self = StObject.set(x, "domainMid", value.asInstanceOf[js.Any])
    
    inline def setDomainMidUndefined: Self = StObject.set(x, "domainMid", js.undefined)
    
    inline def setDomainMin(value: Double | SignalRef): Self = StObject.set(x, "domainMin", value.asInstanceOf[js.Any])
    
    inline def setDomainMinUndefined: Self = StObject.set(x, "domainMin", js.undefined)
    
    inline def setDomainRaw(value: js.Array[Any] | SignalRef): Self = StObject.set(x, "domainRaw", value.asInstanceOf[js.Any])
    
    inline def setDomainRawNull: Self = StObject.set(x, "domainRaw", null)
    
    inline def setDomainRawUndefined: Self = StObject.set(x, "domainRaw", js.undefined)
    
    inline def setDomainRawVarargs(value: Any*): Self = StObject.set(x, "domainRaw", js.Array(value*))
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: (Null | String | Double | Boolean | SignalRef)*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean | SignalRef): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setRound(value: Boolean | SignalRef): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setType(value: ScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
