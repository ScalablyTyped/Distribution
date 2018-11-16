package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a magnetic sensor. */
@JSGlobal("Windows.Devices.Sensors.Magnetometer")
@js.native
abstract class Magnetometer () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** Gets the minimum report interval supported by the magnetometer. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the compass reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Magnetometer, MagnetometerReadingChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Gets or sets the current report interval for the magnetometer. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Magnetometer, MagnetometerReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Gets the current magnetometer reading.
                   * @return The current magnetometer reading.
                   */
  def getCurrentReading(): MagnetometerReading = js.native
  /** Occurs each time the compass reports a new sensor reading. */
  def onreadingchanged(ev: MagnetometerReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Magnetometer]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Magnetometer, MagnetometerReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents a magnetic sensor. */
@JSGlobal("Windows.Devices.Sensors.Magnetometer")
@js.native
object Magnetometer extends js.Object {
  /**
                   * Returns the default magnetometer.
                   * @return The default magnetometer.
                   */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.Magnetometer = js.native
}

