package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for detailed battery information. For more info, see Get battery information. */
@JSGlobal("Windows.Devices.Power")
@js.native
object Power extends js.Object {
  
  /** Provides information about a battery controller that is currently connected to the device. For more info, see Get battery information. */
  @js.native
  abstract class Battery ()
    extends typings.winrtUwp.Windows.Devices.Power.Battery
  /* static members */
  @js.native
  object Battery extends js.Object {
    
    /** Gets a Battery object that represents all battery controllers connected to the device. */
    var aggregateBattery: typings.winrtUwp.Windows.Devices.Power.Battery = js.native
    
    /**
      * Gets a Battery object that represents an individual battery controller connected to the device.
      * @param deviceId The device ID of the battery controller ( DeviceId ).
      * @return A Battery object that corresponds to the specified battery controller.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Power.Battery] = js.native
    
    /**
      * Gets an Advanced Query Syntax (AQS) string that can be used to find all battery controllers that are connected to the device.
      * @return An AQS string that can be used to find all battery controllers connected to the device.
      */
    def getDeviceSelector(): String = js.native
  }
  
  /** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
  @js.native
  abstract class BatteryReport ()
    extends typings.winrtUwp.Windows.Devices.Power.BatteryReport
}
