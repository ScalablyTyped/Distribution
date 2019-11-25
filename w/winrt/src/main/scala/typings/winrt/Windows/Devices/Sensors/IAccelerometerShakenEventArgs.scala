package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerShakenEventArgs extends js.Object {
  var timestamp: Date
}

object IAccelerometerShakenEventArgs {
  @scala.inline
  def apply(timestamp: Date): IAccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAccelerometerShakenEventArgs]
  }
}

