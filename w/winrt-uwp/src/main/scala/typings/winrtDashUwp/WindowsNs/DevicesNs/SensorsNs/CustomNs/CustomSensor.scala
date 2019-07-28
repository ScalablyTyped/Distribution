package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.CustomNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom sensor. */
@JSGlobal("Windows.Devices.Sensors.Custom.CustomSensor")
@js.native
abstract class CustomSensor () extends js.Object {
  /** Gets the device identifier of the sensor. */
  var deviceId: String = js.native
  /** Gets the minimum report interval that is supported by the sensor. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs] = js.native
  /** Gets or sets the current report interval for the sensor. */
  var reportInterval: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs]
  ): Unit = js.native
  /**
    * Gets the current sensor reading.
    * @return The current sensor reading.
    */
  def getCurrentReading(): CustomSensorReading = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  def onreadingchanged(ev: CustomSensorReadingChangedEventArgs with WinRTEvent[CustomSensor]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[CustomSensor, CustomSensorReadingChangedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.Custom.CustomSensor")
@js.native
object CustomSensor extends js.Object {
  /**
    * Asynchronously obtains the sensor from its identifier.
    * @param sensorId The sensor identifier.
    * @return Returns the CustomSensor object from its identifier.
    */
  def fromIdAsync(sensorId: String): IPromiseWithIAsyncOperation[CustomSensor] = js.native
  /**
    * Gets the device selector from the given interface identifier.
    * @param interfaceId The interface Guid that is associated with the custom sensor. This Guid is defined and registered by the sensor.
    * @return Returns the device selector, if it exists; otherwise, null.
    */
  def getDeviceSelector(interfaceId: String): String = js.native
}

