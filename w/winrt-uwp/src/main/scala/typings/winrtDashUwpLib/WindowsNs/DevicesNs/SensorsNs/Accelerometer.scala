package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an accelerometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
abstract class Accelerometer () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** Gets the maximum number of events that can be batched by the sensor. */
  var maxBatchSize: scala.Double = js.native
  /** Gets the minimum report interval supported by the accelerometer. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the accelerometer reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Accelerometer, AccelerometerReadingChangedEventArgs] = js.native
  /** Occurs when the accelerometer detects that the PC has been shaken. */
  @JSName("onshaken")
  var onshaken_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Accelerometer, AccelerometerShakenEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Gets or sets the current report interval for the accelerometer. */
  var reportInterval: scala.Double = js.native
  /** Gets or sets the delay between batches of sensor information. */
  var reportLatency: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Accelerometer, AccelerometerReadingChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shaken(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.shaken,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Accelerometer, AccelerometerShakenEventArgs]
  ): scala.Unit = js.native
  /**
                   * Gets the current accelerometer reading.
                   * @return This method has no parameters.
                   */
  def getCurrentReading(): AccelerometerReading = js.native
  /** Occurs each time the accelerometer reports a new sensor reading. */
  def onreadingchanged(ev: AccelerometerReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Accelerometer]): scala.Unit = js.native
  /** Occurs when the accelerometer detects that the PC has been shaken. */
  def onshaken(ev: AccelerometerShakenEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Accelerometer]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Accelerometer, AccelerometerReadingChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shaken(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.shaken,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Accelerometer, AccelerometerShakenEventArgs]
  ): scala.Unit = js.native
}

/** Represents an accelerometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
object Accelerometer extends js.Object {
  /**
                   * Returns the default accelerometer.
                   * @return The default accelerometer or null if no integrated accelerometers are found.
                   */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.Accelerometer = js.native
}

