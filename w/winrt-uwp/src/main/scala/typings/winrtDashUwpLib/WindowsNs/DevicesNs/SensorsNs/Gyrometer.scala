package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a gyrometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
abstract class Gyrometer () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** Gets the minimum report interval supported by the gyrometer. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the gyrometer reports the current sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Gyrometer, GyrometerReadingChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Gets or sets the current report interval for the gyrometer. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Gyrometer, GyrometerReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the current gyrometer reading.
    * @return This method has no parameters.
    */
  def getCurrentReading(): GyrometerReading = js.native
  /** Occurs each time the gyrometer reports the current sensor reading. */
  def onreadingchanged(ev: GyrometerReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Gyrometer]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Gyrometer, GyrometerReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents a gyrometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
object Gyrometer extends js.Object {
  /**
    * Returns the default gyrometer.
    * @return The default gyrometer or null if no integrated gyrometers are found.
    */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.Gyrometer = js.native
}

