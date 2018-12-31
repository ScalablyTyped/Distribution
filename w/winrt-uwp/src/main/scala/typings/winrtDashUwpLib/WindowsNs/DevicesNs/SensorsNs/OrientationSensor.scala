package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an orientation sensor. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
abstract class OrientationSensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the orientation sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[OrientationSensor, OrientationSensorReadingChangedEventArgs] = js.native
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: winrtDashUwpLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  /** Gets the sensor reading type. */
  var readingType: SensorReadingType = js.native
  /** Gets or sets the report interval supported by the sensor. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[OrientationSensor, OrientationSensorReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the current sensor reading.
    * @return The current sensor reading.
    */
  def getCurrentReading(): OrientationSensorReading = js.native
  /** Occurs each time the orientation sensor reports a new sensor reading. */
  def onreadingchanged(
    ev: OrientationSensorReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[OrientationSensor]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[OrientationSensor, OrientationSensorReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents an orientation sensor. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
object OrientationSensor extends js.Object {
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.OrientationSensor = js.native
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  def getDefaultForRelativeReadings(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.OrientationSensor = js.native
}

