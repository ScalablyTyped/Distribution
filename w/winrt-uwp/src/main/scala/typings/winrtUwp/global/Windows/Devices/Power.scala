package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.System.Power.BatteryStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for detailed battery information. For more info, see Get battery information. */
@JSGlobal("Windows.Devices.Power")
@js.native
object Power extends js.Object {
  /** Provides information about a battery controller that is currently connected to the device. For more info, see Get battery information. */
  @js.native
  abstract class Battery ()
    extends typings.winrtUwp.Windows.Devices.Power.Battery
  
  /** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
  @js.native
  abstract class BatteryReport ()
    extends typings.winrtUwp.Windows.Devices.Power.BatteryReport {
    /** Gets the rate that the battery is charging. */
    /* CompleteClass */
    override var chargeRateInMilliwatts: Double = js.native
    /** Gets the estimated energy capacity of a new battery of this type. */
    /* CompleteClass */
    override var designCapacityInMilliwattHours: Double = js.native
    /** Gets the fully-charged energy capacity of the battery. */
    /* CompleteClass */
    override var fullChargeCapacityInMilliwattHours: Double = js.native
    /** Gets the remaining power capacity of the battery. */
    /* CompleteClass */
    override var remainingCapacityInMilliwattHours: Double = js.native
    /** Gets a BatteryStatus enumeration that indicates the status of the battery. */
    /* CompleteClass */
    override var status: BatteryStatus = js.native
  }
  
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
  
}

