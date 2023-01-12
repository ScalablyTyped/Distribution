package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaRatio extends StObject {
  
  var denominator: Double
  
  var numerator: Double
}
object IMediaRatio {
  
  inline def apply(denominator: Double, numerator: Double): IMediaRatio = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaRatio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMediaRatio] (val x: Self) extends AnyVal {
    
    inline def setDenominator(value: Double): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    inline def setNumerator(value: Double): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
  }
}
