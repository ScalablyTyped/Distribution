package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeterHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var form: js.UndefOr[String] = js.undefined
  
  var high: js.UndefOr[Numberish] = js.undefined
  
  var low: js.UndefOr[Numberish] = js.undefined
  
  var max: js.UndefOr[Numberish] = js.undefined
  
  var min: js.UndefOr[Numberish] = js.undefined
  
  var optimum: js.UndefOr[Numberish] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}
object MeterHTMLAttributes {
  
  inline def apply(): MeterHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeterHTMLAttributes]
  }
  
  extension [Self <: MeterHTMLAttributes](x: Self) {
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHigh(value: Numberish): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Numberish): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setMax(value: Numberish): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Numberish): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOptimum(value: Numberish): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
    
    inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
