package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecEncodeMod.NumericValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exponent extends StObject {
  
  var exponent: js.UndefOr[Double | NumericValueRef] = js.undefined
  
  var extra: js.UndefOr[Boolean] = js.undefined
  
  var mult: js.UndefOr[Double | NumericValueRef] = js.undefined
  
  var offset: js.UndefOr[Double | NumericValueRef] = js.undefined
  
  var round: js.UndefOr[Boolean] = js.undefined
}
object Exponent {
  
  inline def apply(): Exponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exponent]
  }
  
  extension [Self <: Exponent](x: Self) {
    
    inline def setExponent(value: Double | NumericValueRef): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
    inline def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setMult(value: Double | NumericValueRef): Self = StObject.set(x, "mult", value.asInstanceOf[js.Any])
    
    inline def setMultUndefined: Self = StObject.set(x, "mult", js.undefined)
    
    inline def setOffset(value: Double | NumericValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
  }
}
