package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an inclinometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
abstract class Inclinometer () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** Gets the minimum report interval supported by the inclinometer. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the inclinometer reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Gets the sensor reading type. */
  var readingType: SensorReadingType = js.native
  /** Gets or sets the current report interval for the inclinometer. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Gets the current inclinometer reading.
                   * @return The current inclinometer reading.
                   */
  def getCurrentReading(): InclinometerReading = js.native
  /** Occurs each time the inclinometer reports a new sensor reading. */
  def onreadingchanged(ev: InclinometerReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Inclinometer]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents an inclinometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
object Inclinometer extends js.Object {
  /**
                   * Returns the default inclinometer.
                   * @return The default inclinometer or null if no inclinometers are found.
                   */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.Inclinometer = js.native
  /**
                   * Returns the default inclinometer.
                   * @return The default inclinometer or null if no inclinometers are found.
                   */
  def getDefaultForRelativeReadings(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.Inclinometer = js.native
}

