package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ambient-light sensor. */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
abstract class LightSensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the ambient-light sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LightSensor, LightSensorReadingChangedEventArgs] = js.native
  /** Gets or sets the current report interval for the ambient light sensor. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LightSensor, LightSensorReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the current ambient-light sensor reading.
    * @return The current ambient-light sensor reading.
    */
  def getCurrentReading(): LightSensorReading = js.native
  /** Occurs each time the ambient-light sensor reports a new sensor reading. */
  def onreadingchanged(ev: LightSensorReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[LightSensor]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LightSensor, LightSensorReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
object LightSensor extends js.Object {
  /**
    * Returns the default ambient-light sensor.
    * @return The default ambient-light sensor or null if no integrated light sensors are found.
    */
  def getDefault(): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.LightSensor = js.native
}

