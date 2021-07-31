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
  
  @scala.inline
  def apply(): ParameterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterOptions]
  }
  
  @scala.inline
  implicit class ParameterOptionsMutableBuilder[Self <: ParameterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double | max): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
