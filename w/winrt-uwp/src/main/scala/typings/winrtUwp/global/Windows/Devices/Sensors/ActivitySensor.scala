package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an activity sensor that provides the activity and status of a sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensor")
@js.native
abstract class ActivitySensor ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.ActivitySensor
object ActivitySensor {
  
  @JSGlobal("Windows.Devices.Sensors.ActivitySensor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asynchronously obtains the sensor from its identifier.
    * @param deviceId The sensor identifier.
    * @return Returns the ActivitySensor object from its identifier.
    */
  /* static member */
  @scala.inline
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.ActivitySensor] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.ActivitySensor]]
  
  /**
    * Asynchronously obtains the default sensor.
    * @return Asynchronously returns a ActivitySensor object that represents the default sensor.
    */
  /* static member */
  @scala.inline
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.ActivitySensor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.ActivitySensor]]
  
  /**
    * Gets the device selector.
    * @return Returns the device selector, if it exists; otherwise, null.
    */
  /* static member */
  @scala.inline
  def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  
  /**
    * Asynchronously gets sensor readings from a specific time.
    * @param fromTime The time at which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  /* static member */
  @scala.inline
  def getSystemHistoryAsync(fromTime: Date): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemHistoryAsync")(fromTime.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
  /**
    * Asynchronously gets sensor readings from a specific time and duration.
    * @param fromTime The time at which to get sensor readings.
    * @param duration The time span during which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  /* static member */
  @scala.inline
  def getSystemHistoryAsync(fromTime: Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSystemHistoryAsync")(fromTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
}
