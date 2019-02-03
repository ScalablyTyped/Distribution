package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an interface for a proximity sensor to determine whether or not an object is detected. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensor")
@js.native
abstract class ProximitySensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** The largest distance where the proximity sensor can detect an object. */
  var maxDistanceInMillimeters: scala.Double = js.native
  /** The shortest distance where the proximity sensor can detect an object. */
  var minDistanceInMillimeters: scala.Double = js.native
  /** Occurs each time the proximity sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ProximitySensor, ProximitySensorReadingChangedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ProximitySensor, ProximitySensorReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Creates a controller responsible for turning the display on or off based on the ProximitySensorReading .
    * @return The controller for the phone display.
    */
  def createDisplayOnOffController(): ProximitySensorDisplayOnOffController = js.native
  /**
    * Gets the current reading for the proximity sensor.
    * @return Indicates whether or not the proximity sensor detects an object, and if so, the distance to that object.
    */
  def getCurrentReading(): ProximitySensorReading = js.native
  /** Occurs each time the proximity sensor reports a new value. */
  def onreadingchanged(
    ev: ProximitySensorReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ProximitySensor]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ProximitySensor, ProximitySensorReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.ProximitySensor")
@js.native
object ProximitySensor extends js.Object {
  /**
    * Obtains the proximity sensor from its identifier.
    * @param sensorId The sensor identifier.
    * @return Returns the ProximitySensor object from its identifier.
    */
  def fromId(sensorId: java.lang.String): winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ProximitySensor = js.native
  /**
    * Gets the device selector.
    * @return Returns the device selector. If no device selector is available, this method returns null.
    */
  def getDeviceSelector(): java.lang.String = js.native
  /**
    * Gets readings from the trigger details in background task.
    * @param triggerDetails The trigger details received from the background task.
    * @return The collection of proximity data retrieved from the trigger details.
    */
  def getReadingsFromTriggerDetails(triggerDetails: winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorDataThresholdTriggerDetails): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ProximitySensorReading] = js.native
}

