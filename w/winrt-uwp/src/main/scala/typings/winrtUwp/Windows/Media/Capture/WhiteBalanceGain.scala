package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the red, green, and blue values of a white balance gain setting. */
trait WhiteBalanceGain extends StObject {
  
  /** The blue value of a white balance gain setting. */
  var b: Double
  
  /** The green value of a white balance gain setting. */
  var g: Double
  
  /** The red value of a white balance gain setting. */
  var r: Double
}
object WhiteBalanceGain {
  
  inline def apply(b: Double, g: Double, r: Double): WhiteBalanceGain = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteBalanceGain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhiteBalanceGain] (val x: Self) extends AnyVal {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
