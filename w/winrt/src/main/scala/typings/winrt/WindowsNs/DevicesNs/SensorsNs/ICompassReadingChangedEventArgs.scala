package typings.winrt.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompassReadingChangedEventArgs extends js.Object {
  var reading: CompassReading
}

object ICompassReadingChangedEventArgs {
  @scala.inline
  def apply(reading: CompassReading): ICompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading)
  
    __obj.asInstanceOf[ICompassReadingChangedEventArgs]
  }
}

