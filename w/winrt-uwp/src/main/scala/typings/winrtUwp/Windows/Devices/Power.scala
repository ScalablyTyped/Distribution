package typings.winrtUwp.Windows.Devices

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.System.Power.BatteryStatus
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.reportupdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for detailed battery information. For more info, see Get battery information. */
object Power {
  
  /** Provides information about a battery controller that is currently connected to the device. For more info, see Get battery information. */
  @js.native
  trait Battery extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reportupdated(`type`: reportupdated, listener: TypedEventHandler[Battery, _]): Unit = js.native
    
    /** Gets the identifier (ID) for an individual battery controller. */
    var deviceId: String = js.native
    
    /**
      * Gets a BatteryReport object that indicates the charge, capacity, and status of the battery or aggregate.
      * @return Indicates the charge, capacity, and status of the battery or aggregate.
      */
    def getReport(): BatteryReport = js.native
    
    /** Occurs when the charge, capacity, or status of a battery changes. */
    def onreportupdated(ev: js.Any with WinRTEvent[Battery]): Unit = js.native
    /** Occurs when the charge, capacity, or status of a battery changes. */
    @JSName("onreportupdated")
    var onreportupdated_Original: TypedEventHandler[Battery, _] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reportupdated(`type`: reportupdated, listener: TypedEventHandler[Battery, _]): Unit = js.native
  }
  
  /** Provides properties that indicate the charge, capacity, and status of the battery. For more info, see Get battery information. */
  @js.native
  trait BatteryReport extends StObject {
    
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
  object BatteryReport {
    
    @scala.inline
    def apply(
      chargeRateInMilliwatts: Double,
      designCapacityInMilliwattHours: Double,
      fullChargeCapacityInMilliwattHours: Double,
      remainingCapacityInMilliwattHours: Double,
      status: BatteryStatus
    ): BatteryReport = {
      val __obj = js.Dynamic.literal(chargeRateInMilliwatts = chargeRateInMilliwatts.asInstanceOf[js.Any], designCapacityInMilliwattHours = designCapacityInMilliwattHours.asInstanceOf[js.Any], fullChargeCapacityInMilliwattHours = fullChargeCapacityInMilliwattHours.asInstanceOf[js.Any], remainingCapacityInMilliwattHours = remainingCapacityInMilliwattHours.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatteryReport]
    }
    
    @scala.inline
    implicit class BatteryReportMutableBuilder[Self <: BatteryReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChargeRateInMilliwatts(value: Double): Self = StObject.set(x, "chargeRateInMilliwatts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesignCapacityInMilliwattHours(value: Double): Self = StObject.set(x, "designCapacityInMilliwattHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullChargeCapacityInMilliwattHours(value: Double): Self = StObject.set(x, "fullChargeCapacityInMilliwattHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemainingCapacityInMilliwattHours(value: Double): Self = StObject.set(x, "remainingCapacityInMilliwattHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: BatteryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
