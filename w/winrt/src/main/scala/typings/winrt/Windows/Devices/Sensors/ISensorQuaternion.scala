package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISensorQuaternion extends StObject {
  
  var w: Double
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object ISensorQuaternion {
  
  @scala.inline
  def apply(w: Double, x: Double, y: Double, z: Double): ISensorQuaternion = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISensorQuaternion]
  }
  
  @scala.inline
  implicit class ISensorQuaternionMutableBuilder[Self <: ISensorQuaternion] (val x: Self) extends AnyVal {
    
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
