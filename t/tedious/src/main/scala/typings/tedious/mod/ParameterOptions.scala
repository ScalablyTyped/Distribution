package typings.tedious.mod

import typings.tedious.tediousStrings.max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterOptions extends StObject {
  
  //  for VarChar, NVarChar, VarBinary
  var length: js.UndefOr[Double | max] = js.undefined
  
  // precision for Numeric, Decimal
  var precision: js.UndefOr[Double] = js.undefined
  
  // scale for Numeric, Decimal, Time, DateTime2, DateTimeOffset
  var scale: js.UndefOr[Double] = js.undefined
}
object ParameterOptions {
  
  inline def apply(): ParameterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterOptions]
  }
  
  extension [Self <: ParameterOptions](x: Self) {
    
    inline def setLength(value: Double | max): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
