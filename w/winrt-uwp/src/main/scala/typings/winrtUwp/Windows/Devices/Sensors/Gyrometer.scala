package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a gyrometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
abstract class Gyrometer () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** Gets the minimum report interval supported by the gyrometer. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the gyrometer reports the current sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Gyrometer, GyrometerReadingChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  /** Gets or sets the current report interval for the gyrometer. */
  var reportInterval: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Gyrometer, GyrometerReadingChangedEventArgs]): Unit = js.native
  /**
    * Gets the current gyrometer reading.
    * @return This method has no parameters.
    */
  def getCurrentReading(): GyrometerReading = js.native
  /** Occurs each time the gyrometer reports the current sensor reading. */
  def onreadingchanged(ev: GyrometerReadingChangedEventArgs with WinRTEvent[Gyrometer]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Gyrometer, GyrometerReadingChangedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
object Gyrometer extends js.Object {
  /**
    * Returns the default gyrometer.
    * @return The default gyrometer or null if no integrated gyrometers are found.
    */
  def getDefault(): Gyrometer = js.native
}

