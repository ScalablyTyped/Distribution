package typings.winrtDashUwp.Windows.Devices.Sensors

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an activity sensor that provides the activity and status of a sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensor")
@js.native
abstract class ActivitySensor () extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs] = js.native
  /** Gets the power in milliwatts that the sensor consumes. */
  var powerInMilliwatts: Double = js.native
  /** Gets the list of activity types that the sensor pledges to perform. */
  var subscribedActivities: IVector[ActivityType] = js.native
  /** Gets the list of activity types that the sensor supports. */
  var supportedActivities: IVectorView[ActivityType] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs]
  ): Unit = js.native
  /**
    * Asynchronously gets the current sensor reading.
    * @return Asynchronously returns a ActivitySensorReading object that represents info about the sensor.
    */
  def getCurrentReadingAsync(): IPromiseWithIAsyncOperation[ActivitySensorReading] = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  def onreadingchanged(ev: ActivitySensorReadingChangedEventArgs with WinRTEvent[ActivitySensor]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs]
  ): Unit = js.native
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
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[ActivitySensor] = js.native
  /**
    * Asynchronously obtains the default sensor.
    * @return Asynchronously returns a ActivitySensor object that represents the default sensor.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[ActivitySensor] = js.native
  /**
    * Gets the device selector.
    * @return Returns the device selector, if it exists; otherwise, null.
    */
  def getDeviceSelector(): String = js.native
  /**
    * Asynchronously gets sensor readings from a specific time.
    * @param fromTime The time at which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: Date): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets sensor readings from a specific time and duration.
    * @param fromTime The time at which to get sensor readings.
    * @param duration The time span during which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

