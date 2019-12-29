package typings.winrtDashUwp.Windows.Devices

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.System.Power.BatteryStatus
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.reportupdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for detailed battery information. For more info, see Get battery information. */
@JSGlobal("Windows.Devices.Power")
@js.native
object Power extends js.Object {
  /** Provides information about a battery controller that is currently connected to the device. For more info, see Get battery information. */
  @js.native
  abstract class Battery () extends js.Object {
    /** Gets the identifier (ID) for an individual battery controller. */
    var deviceId: String = js.native
    /** Occurs when the charge, capacity, or status of a battery changes. */
    @JSName("onreportupdated")
    var onreportupdated_Original: TypedEventHandler[Battery, _] = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reportupdated(`type`: reportupdated, listener: TypedEventHandler[Battery, _]): Unit = js.native
    /**
      * Gets a BatteryReport object that indicates the charge, capacity, and status of the battery or aggregate.
      * @return Indicates the charge, capacity, and status of the battery or aggregate.
      */
    def getReport(): BatteryReport = js.native
    /** Occurs when the charge, capacity, or status of a battery changes. */
    def onreportupdated(ev: js.Any with WinRTEvent[Battery]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reportupdated(`type`: reportupdated, listener: TypedEventHandler[Battery, _]): Unit = js.native
  }
  
  /** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
  @js.native
  abstract class BatteryReport () extends js.Object {
    /** Gets the rate that the battery is charging. */
    var chargeRateInMilliwatts: Double = js.native
    /** Gets the estimated energy capacity of a new battery of this type. */
    var designCapacityInMilliwattHours: Double = js.native
    /** Gets the fully-charged energy capacity of the battery. */
    var fullChargeCapacityInMilliwattHours: Double = js.native
    /** Gets the remaining power capacity of the battery. */
    var remainingCapacityInMilliwattHours: Double = js.native
    /** Gets a BatteryStatus enumeration that indicates the status of the battery. */
    var status: BatteryStatus = js.native
  }
  
  /* static members */
  @js.native
  object Battery extends js.Object {
    /** Gets a Battery object that represents all battery controllers connected to the device. */
    var aggregateBattery: Battery = js.native
    /**
      * Gets a Battery object that represents an individual battery controller connected to the device.
      * @param deviceId The device ID of the battery controller ( DeviceId ).
      * @return A Battery object that corresponds to the specified battery controller.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[Battery] = js.native
    /**
      * Gets an Advanced Query Syntax (AQS) string that can be used to find all battery controllers that are connected to the device.
      * @return An AQS string that can be used to find all battery controllers connected to the device.
      */
    def getDeviceSelector(): String = js.native
  }
  
}

