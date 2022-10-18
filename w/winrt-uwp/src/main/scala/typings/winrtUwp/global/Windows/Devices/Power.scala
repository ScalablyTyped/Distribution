package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.System.Power.BatteryStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for detailed battery information. For more info, see Get battery information. */
object Power {
  
  /** Provides information about a battery controller that is currently connected to the device. For more info, see Get battery information. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Power.Battery")
  @js.native
  open class Battery ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Power.Battery
  object Battery {
    
    @JSGlobal("Windows.Devices.Power.Battery")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets a Battery object that represents all battery controllers connected to the device. */
    /* static member */
    @JSGlobal("Windows.Devices.Power.Battery.aggregateBattery")
    @js.native
    def aggregateBattery: typings.winrtUwp.Windows.Devices.Power.Battery = js.native
    inline def aggregateBattery_=(x: typings.winrtUwp.Windows.Devices.Power.Battery): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aggregateBattery")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a Battery object that represents an individual battery controller connected to the device.
      * @param deviceId The device ID of the battery controller ( DeviceId ).
      * @return A Battery object that corresponds to the specified battery controller.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Power.Battery] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Power.Battery]]
    
    /**
      * Gets an Advanced Query Syntax (AQS) string that can be used to find all battery controllers that are connected to the device.
      * @return An AQS string that can be used to find all battery controllers connected to the device.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  /** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Power.BatteryReport")
  @js.native
  open class BatteryReport ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Power.BatteryReport {
    
    /** Gets the rate that the battery is charging. */
    /* CompleteClass */
    var chargeRateInMilliwatts: Double = js.native
    
    /** Gets the estimated energy capacity of a new battery of this type. */
    /* CompleteClass */
    var designCapacityInMilliwattHours: Double = js.native
    
    /** Gets the fully-charged energy capacity of the battery. */
    /* CompleteClass */
    var fullChargeCapacityInMilliwattHours: Double = js.native
    
    /** Gets the remaining power capacity of the battery. */
    /* CompleteClass */
    var remainingCapacityInMilliwattHours: Double = js.native
    
    /** Gets a BatteryStatus enumeration that indicates the status of the battery. */
    /* CompleteClass */
    var status: BatteryStatus = js.native
  }
}
