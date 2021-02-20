package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for detailed battery information. For more info, see Get battery information. */
object Power {
  
  /** Provides information about a battery controller that is currently connected to the device. For more info, see Get battery information. */
  @JSGlobal("Windows.Devices.Power.Battery")
  @js.native
  abstract class Battery ()
    extends typings.winrtUwp.Windows.Devices.Power.Battery
  object Battery {
    
    @JSGlobal("Windows.Devices.Power.Battery")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets a Battery object that represents all battery controllers connected to the device. */
    /* static member */
    @JSGlobal("Windows.Devices.Power.Battery.aggregateBattery")
    @js.native
    def aggregateBattery: typings.winrtUwp.Windows.Devices.Power.Battery = js.native
    @scala.inline
    def aggregateBattery_=(x: typings.winrtUwp.Windows.Devices.Power.Battery): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aggregateBattery")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a Battery object that represents an individual battery controller connected to the device.
      * @param deviceId The device ID of the battery controller ( DeviceId ).
      * @return A Battery object that corresponds to the specified battery controller.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Power.Battery.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Power.Battery] = js.native
    
    /**
      * Gets an Advanced Query Syntax (AQS) string that can be used to find all battery controllers that are connected to the device.
      * @return An AQS string that can be used to find all battery controllers connected to the device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Power.Battery.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
  
  /** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
  @JSGlobal("Windows.Devices.Power.BatteryReport")
  @js.native
  abstract class BatteryReport ()
    extends typings.winrtUwp.Windows.Devices.Power.BatteryReport
}
