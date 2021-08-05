package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents ratios used in media operations. */
trait MediaRatio extends StObject {
  
  /** The denominator of the MediaRatio. */
  var denominator: Double
  
  /** The numerator of the MediaRatio. */
  var numerator: Double
}
object MediaRatio {
  
  inline def apply(denominator: Double, numerator: Double): MediaRatio = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRatio]
  }
  
  extension [Self <: MediaRatio](x: Self) {
    
    inline def setDenominator(value: Double): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    inline def setNumerator(value: Double): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
  }
}
