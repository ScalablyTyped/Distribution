package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerReading extends js.Object {
  var accelerationX: Double
  var accelerationY: Double
  var accelerationZ: Double
  var timestamp: Date
}

object IAccelerometerReading {
  @scala.inline
  def apply(accelerationX: Double, accelerationY: Double, accelerationZ: Double, timestamp: Date): IAccelerometerReading = {
    val __obj = js.Dynamic.literal(accelerationX = accelerationX, accelerationY = accelerationY, accelerationZ = accelerationZ, timestamp = timestamp)
  
    __obj.asInstanceOf[IAccelerometerReading]
  }
}

