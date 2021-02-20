package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a pedometer to measure the number of steps taken. */
@JSGlobal("Windows.Devices.Sensors.Pedometer")
@js.native
abstract class Pedometer ()
  extends typings.winrtUwp.Windows.Devices.Sensors.Pedometer
object Pedometer {
  
  @JSGlobal("Windows.Devices.Sensors.Pedometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Obtains the pedometer from its identifier.
    * @param deviceId The sensor identifier.
    * @return Returns the Pedometer object from its identifier.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.Pedometer.fromIdAsync")
  @js.native
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Pedometer] = js.native
  
  /**
    * Asynchronously obtains the default pedometer.
    * @return Asynchronously returns a Pedometer object that represents the default sensor.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.Pedometer.getDefaultAsync")
  @js.native
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Pedometer] = js.native
  
  /**
    * Gets the device selector.
    * @return Returns the device selector, if it exists; otherwise null.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.Pedometer.getDeviceSelector")
  @js.native
  def getDeviceSelector(): String = js.native
  
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.Pedometer.getReadingsFromTriggerDetails")
  @js.native
  def getReadingsFromTriggerDetails: js.Any = js.native
  @scala.inline
  def getReadingsFromTriggerDetails_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getReadingsFromTriggerDetails")(x.asInstanceOf[js.Any])
  
  /* unmapped type */
  /**
    * Asynchronously gets sensor readings from a specific time.
    * @param fromTime The time for which you want to retrieve the reading.
    * @return Asynchronously returns a list of PedometerReading objects that represent info about the sensor.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.Pedometer.getSystemHistoryAsync")
  @js.native
  def getSystemHistoryAsync(fromTime: Date): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets pedometer readings from a specific time and duration.
    * @param fromTime The time for which you want to retrieve the reading.
    * @param duration The duration over which you want to retrieve data.
    * @return Asynchronously returns a list of PedometerReading objects that represent info about the sensor.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.Pedometer.getSystemHistoryAsync")
  @js.native
  def getSystemHistoryAsync(fromTime: Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}
