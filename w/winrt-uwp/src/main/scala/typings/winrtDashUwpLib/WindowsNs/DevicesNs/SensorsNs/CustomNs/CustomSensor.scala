package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.CustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom sensor. */
@JSGlobal("Windows.Devices.Sensors.Custom.CustomSensor")
@js.native
abstract class CustomSensor () extends js.Object {
  /** Gets the device identifier of the sensor. */
  var deviceId: java.lang.String = js.native
  /** Gets the minimum report interval that is supported by the sensor. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs] = js.native
  /** Gets or sets the current report interval for the sensor. */
  var reportInterval: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
                       * Gets the current sensor reading.
                       * @return The current sensor reading.
                       */
  def getCurrentReading(): CustomSensorReading = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  def onreadingchanged(ev: CustomSensorReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CustomSensor]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents a custom sensor. */
@JSGlobal("Windows.Devices.Sensors.Custom.CustomSensor")
@js.native
object CustomSensor extends js.Object {
  /**
                       * Asynchronously obtains the sensor from its identifier.
                       * @param sensorId The sensor identifier.
                       * @return Returns the CustomSensor object from its identifier.
                       */
  def fromIdAsync(sensorId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.CustomNs.CustomSensor] = js.native
  /**
                       * Gets the device selector from the given interface identifier.
                       * @param interfaceId The interface Guid that is associated with the custom sensor. This Guid is defined and registered by the sensor.
                       * @return Returns the device selector, if it exists; otherwise, null.
                       */
  def getDeviceSelector(interfaceId: java.lang.String): java.lang.String = js.native
}

