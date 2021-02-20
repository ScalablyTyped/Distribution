package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Quaternion. */
@js.native
trait SensorQuaternion extends StObject {
  
  /** Gets the w-value of the Quaternion. */
  var w: Double = js.native
  
  /** Gets the x-value of the Quaternion. */
  var x: Double = js.native
  
  /** Gets the y-value of the Quaternion. */
  var y: Double = js.native
  
  /** Gets the z-value of the Quaternion. */
  var z: Double = js.native
}
object SensorQuaternion {
  
  @scala.inline
  def apply(w: Double, x: Double, y: Double, z: Double): SensorQuaternion = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorQuaternion]
  }
  
  @scala.inline
  implicit class SensorQuaternionMutableBuilder[Self <: SensorQuaternion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
