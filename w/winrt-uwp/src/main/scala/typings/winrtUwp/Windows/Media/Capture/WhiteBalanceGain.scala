package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the red, green, and blue values of a white balance gain setting. */
@js.native
trait WhiteBalanceGain extends StObject {
  
  /** The blue value of a white balance gain setting. */
  var b: Double = js.native
  
  /** The green value of a white balance gain setting. */
  var g: Double = js.native
  
  /** The red value of a white balance gain setting. */
  var r: Double = js.native
}
object WhiteBalanceGain {
  
  @scala.inline
  def apply(b: Double, g: Double, r: Double): WhiteBalanceGain = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteBalanceGain]
  }
  
  @scala.inline
  implicit class WhiteBalanceGainMutableBuilder[Self <: WhiteBalanceGain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
