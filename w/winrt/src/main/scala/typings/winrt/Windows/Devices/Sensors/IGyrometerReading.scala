package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGyrometerReading extends StObject {
  
  var angularVelocityX: Double
  
  var angularVelocityY: Double
  
  var angularVelocityZ: Double
  
  var timestamp: Date
}
object IGyrometerReading {
  
  @scala.inline
  def apply(angularVelocityX: Double, angularVelocityY: Double, angularVelocityZ: Double, timestamp: Date): IGyrometerReading = {
    val __obj = js.Dynamic.literal(angularVelocityX = angularVelocityX.asInstanceOf[js.Any], angularVelocityY = angularVelocityY.asInstanceOf[js.Any], angularVelocityZ = angularVelocityZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGyrometerReading]
  }
  
  @scala.inline
  implicit class IGyrometerReadingMutableBuilder[Self <: IGyrometerReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngularVelocityX(value: Double): Self = StObject.set(x, "angularVelocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocityY(value: Double): Self = StObject.set(x, "angularVelocityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocityZ(value: Double): Self = StObject.set(x, "angularVelocityZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
