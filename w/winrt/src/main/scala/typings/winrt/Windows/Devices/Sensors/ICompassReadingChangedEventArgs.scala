package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompassReadingChangedEventArgs extends js.Object {
  var reading: CompassReading
}

object ICompassReadingChangedEventArgs {
  @scala.inline
  def apply(reading: CompassReading): ICompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICompassReadingChangedEventArgs]
  }
}

