package typings.winrtDashUwp.Windows.Devices.Sensors

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an interface for a proximity sensor to determine whether or not an object is detected. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensor")
@js.native
abstract class ProximitySensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** The largest distance where the proximity sensor can detect an object. */
  var maxDistanceInMillimeters: Double = js.native
  /** The shortest distance where the proximity sensor can detect an object. */
  var minDistanceInMillimeters: Double = js.native
  /** Occurs each time the proximity sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[ProximitySensor, ProximitySensorReadingChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ProximitySensor, ProximitySensorReadingChangedEventArgs]
  ): Unit = js.native
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
  def onreadingchanged(ev: ProximitySensorReadingChangedEventArgs with WinRTEvent[ProximitySensor]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ProximitySensor, ProximitySensorReadingChangedEventArgs]
  ): Unit = js.native
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
  def fromId(sensorId: String): ProximitySensor = js.native
  /**
    * Gets the device selector.
    * @return Returns the device selector. If no device selector is available, this method returns null.
    */
  def getDeviceSelector(): String = js.native
  /**
    * Gets readings from the trigger details in background task.
    * @param triggerDetails The trigger details received from the background task.
    * @return The collection of proximity data retrieved from the trigger details.
    */
  def getReadingsFromTriggerDetails(triggerDetails: SensorDataThresholdTriggerDetails): IVectorView[ProximitySensorReading] = js.native
}

