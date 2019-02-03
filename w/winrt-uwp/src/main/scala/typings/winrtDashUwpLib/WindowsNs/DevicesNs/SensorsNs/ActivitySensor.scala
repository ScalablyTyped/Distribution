package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an activity sensor that provides the activity and status of a sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensor")
@js.native
abstract class ActivitySensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: java.lang.String = js.native
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: scala.Double = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs] = js.native
  /** Gets the power in milliwatts that the sensor consumes. */
  var powerInMilliwatts: scala.Double = js.native
  /** Gets the list of activity types that the sensor pledges to perform. */
  var subscribedActivities: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ActivityType] = js.native
  /** Gets the list of activity types that the sensor supports. */
  var supportedActivities: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ActivityType] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Asynchronously gets the current sensor reading.
    * @return Asynchronously returns a ActivitySensorReading object that represents info about the sensor.
    */
  def getCurrentReadingAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ActivitySensorReading] = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  def onreadingchanged(
    ev: ActivitySensorReadingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ActivitySensor]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.readingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.ActivitySensor")
@js.native
object ActivitySensor extends js.Object {
  /**
    * Asynchronously obtains the sensor from its identifier.
    * @param deviceId The sensor identifier.
    * @return Returns the ActivitySensor object from its identifier.
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivitySensor] = js.native
  /**
    * Asynchronously obtains the default sensor.
    * @return Asynchronously returns a ActivitySensor object that represents the default sensor.
    */
  def getDefaultAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivitySensor] = js.native
  /**
    * Gets the device selector.
    * @return Returns the device selector, if it exists; otherwise, null.
    */
  def getDeviceSelector(): java.lang.String = js.native
  /**
    * Asynchronously gets sensor readings from a specific time.
    * @param fromTime The time at which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: stdLib.Date): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Asynchronously gets sensor readings from a specific time and duration.
    * @param fromTime The time at which to get sensor readings.
    * @param duration The time span during which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: stdLib.Date, duration: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

