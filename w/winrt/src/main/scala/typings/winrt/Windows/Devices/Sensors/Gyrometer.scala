package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
class Gyrometer () extends IGyrometer {
  /* CompleteClass */
  override var minimumReportInterval: Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): GyrometerReading = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
object Gyrometer extends js.Object {
  def getDefault(): Gyrometer = js.native
}

