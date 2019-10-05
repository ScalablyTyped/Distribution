package typings.winrtDashUwp.Windows.Devices.Sensors

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Graphics.Display.DisplayOrientations
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a magnetic sensor. */
@JSGlobal("Windows.Devices.Sensors.Magnetometer")
@js.native
abstract class Magnetometer () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** Gets the minimum report interval supported by the magnetometer. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the compass reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Magnetometer, MagnetometerReadingChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  /** Gets or sets the current report interval for the magnetometer. */
  var reportInterval: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Magnetometer, MagnetometerReadingChangedEventArgs]
  ): Unit = js.native
  /**
    * Gets the current magnetometer reading.
    * @return The current magnetometer reading.
    */
  def getCurrentReading(): MagnetometerReading = js.native
  /** Occurs each time the compass reports a new sensor reading. */
  def onreadingchanged(ev: MagnetometerReadingChangedEventArgs with WinRTEvent[Magnetometer]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Magnetometer, MagnetometerReadingChangedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Magnetometer")
@js.native
object Magnetometer extends js.Object {
  /**
    * Returns the default magnetometer.
    * @return The default magnetometer.
    */
  def getDefault(): Magnetometer = js.native
}

