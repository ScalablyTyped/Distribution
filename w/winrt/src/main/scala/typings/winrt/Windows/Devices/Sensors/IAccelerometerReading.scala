package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccelerometerReading extends StObject {
  
  var accelerationX: Double = js.native
  
  var accelerationY: Double = js.native
  
  var accelerationZ: Double = js.native
  
  var timestamp: Date = js.native
}
object IAccelerometerReading {
  
  @scala.inline
  def apply(accelerationX: Double, accelerationY: Double, accelerationZ: Double, timestamp: Date): IAccelerometerReading = {
    val __obj = js.Dynamic.literal(accelerationX = accelerationX.asInstanceOf[js.Any], accelerationY = accelerationY.asInstanceOf[js.Any], accelerationZ = accelerationZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerReading]
  }
  
  @scala.inline
  implicit class IAccelerometerReadingMutableBuilder[Self <: IAccelerometerReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerationX(value: Double): Self = StObject.set(x, "accelerationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationY(value: Double): Self = StObject.set(x, "accelerationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationZ(value: Double): Self = StObject.set(x, "accelerationZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
