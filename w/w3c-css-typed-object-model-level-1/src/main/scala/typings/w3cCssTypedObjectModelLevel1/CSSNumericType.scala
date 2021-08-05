package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSNumericType extends StObject {
  
  var angle: Double
  
  var flex: Double
  
  var frequency: Double
  
  var length: Double
  
  var percent: Double
  
  var percentHint: CSSNumericBaseType
  
  var resolution: Double
  
  var time: Double
}
object CSSNumericType {
  
  inline def apply(
    angle: Double,
    flex: Double,
    frequency: Double,
    length: Double,
    percent: Double,
    percentHint: CSSNumericBaseType,
    resolution: Double,
    time: Double
  ): CSSNumericType = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], percentHint = percentHint.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSNumericType]
  }
  
  extension [Self <: CSSNumericType](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentHint(value: CSSNumericBaseType): Self = StObject.set(x, "percentHint", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
