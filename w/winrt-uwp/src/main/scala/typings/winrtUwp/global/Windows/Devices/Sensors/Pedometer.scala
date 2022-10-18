package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a pedometer to measure the number of steps taken. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.Pedometer")
@js.native
open class Pedometer ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.Pedometer
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
  inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Pedometer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Pedometer]]
  
  /**
    * Asynchronously obtains the default pedometer.
    * @return Asynchronously returns a Pedometer object that represents the default sensor.
    */
  /* static member */
  inline def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Pedometer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Sensors.Pedometer]]
  
  /**
    * Gets the device selector.
    * @return Returns the device selector, if it exists; otherwise null.
    */
  /* static member */
  inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.Pedometer.getReadingsFromTriggerDetails")
  @js.native
  def getReadingsFromTriggerDetails: Any = js.native
  inline def getReadingsFromTriggerDetails_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getReadingsFromTriggerDetails")(x.asInstanceOf[js.Any])
  
  /* unmapped type */
  /**
    * Asynchronously gets sensor readings from a specific time.
    * @param fromTime The time for which you want to retrieve the reading.
    * @return Asynchronously returns a list of PedometerReading objects that represent info about the sensor.
    */
  /* static member */
  inline def getSystemHistoryAsync(fromTime: js.Date): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemHistoryAsync")(fromTime.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  /**
    * Asynchronously gets pedometer readings from a specific time and duration.
    * @param fromTime The time for which you want to retrieve the reading.
    * @param duration The duration over which you want to retrieve data.
    * @return Asynchronously returns a list of PedometerReading objects that represent info about the sensor.
    */
  /* static member */
  inline def getSystemHistoryAsync(fromTime: js.Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSystemHistoryAsync")(fromTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
}
