package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.System.Power.BatteryStatus
import typings.winrtUwp.Windows.System.Power.EnergySaverStatus
import typings.winrtUwp.Windows.System.Power.PowerSupplyStatus
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.batterystatuschanged
import typings.winrtUwp.winrtUwpStrings.energysaverstatuschanged
import typings.winrtUwp.winrtUwpStrings.powersupplystatuschanged
import typings.winrtUwp.winrtUwpStrings.recentenergyusageincreased
import typings.winrtUwp.winrtUwpStrings.recentenergyusagereturnedtolow
import typings.winrtUwp.winrtUwpStrings.remainingchargepercentchanged
import typings.winrtUwp.winrtUwpStrings.remainingdischargetimechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides power and energy usage APIs. */
@JSGlobal("Windows.System.Power")
@js.native
object Power extends js.Object {
  /** Provides information about your app's background energy usage. */
  @js.native
  abstract class BackgroundEnergyManager ()
    extends typings.winrtUwp.Windows.System.Power.BackgroundEnergyManager
  
  /** Provides information about your app's foreground energy usage. */
  @js.native
  abstract class ForegroundEnergyManager ()
    extends typings.winrtUwp.Windows.System.Power.ForegroundEnergyManager
  
  /** Provides access to information about a device's battery and power supply status. */
  @js.native
  abstract class PowerManager ()
    extends typings.winrtUwp.Windows.System.Power.PowerManager
  
  /* static members */
  @js.native
  object BackgroundEnergyManager extends js.Object {
    /** Gets the excessive usage level, expressed as a percentage of normal energy usage. */
    var excessiveUsageLevel: Double = js.native
    /** Gets the low usage level, expressed as a percentage of normal energy consumption. */
    var lowUsageLevel: Double = js.native
    /** Gets the maximum acceptable usage level, expressed as a percentage of normal energy consumption. */
    var maxAcceptableUsageLevel: Double = js.native
    /** Gets the near-maximum acceptable usage level, expressed as a percentage of normal energy usage. */
    var nearMaxAcceptableUsageLevel: Double = js.native
    /** Gets the near-termination usage level, expressed as a percentage of normal energy usage. */
    var nearTerminationUsageLevel: Double = js.native
    /** Occurs when the background task's energy usage has increased significantly. */
    @JSName("onrecentenergyusageincreased")
    var onrecentenergyusageincreased_Original: EventHandler[_] = js.native
    /** Occurs when the background task's energy usage has decreased to a low usage level. */
    @JSName("onrecentenergyusagereturnedtolow")
    var onrecentenergyusagereturnedtolow_Original: EventHandler[_] = js.native
    /** Gets the energy usage of the app's background task for the current 30 minute period, expressed as a percentage of normal. */
    var recentEnergyUsage: Double = js.native
    /** Gets the nearest predefined energy level of the app's background task for the current 30 minute period, equal to LowUsageLevel , NearMaxAcceptableUsageLevel , MaxAcceptableUsageLevel , ExcessiveUsageLevel , NearTerminationUsageLevel , or TerminationUsageLevel . */
    var recentEnergyUsageLevel: Double = js.native
    /** Gets the termination usage level, expressed as a percentage of normal energy usage. */
    var terminationUsageLevel: Double = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_recentenergyusageincreased(`type`: recentenergyusageincreased, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_recentenergyusagereturnedtolow(`type`: recentenergyusagereturnedtolow, listener: EventHandler[_]): Unit = js.native
    /** Occurs when the background task's energy usage has increased significantly. */
    def onrecentenergyusageincreased(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Occurs when the background task's energy usage has decreased to a low usage level. */
    def onrecentenergyusagereturnedtolow(ev: js.Any with WinRTEvent[_]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_recentenergyusageincreased(`type`: recentenergyusageincreased, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_recentenergyusagereturnedtolow(`type`: recentenergyusagereturnedtolow, listener: EventHandler[_]): Unit = js.native
  }
  
  /** Indicates the status of the battery. */
  @js.native
  object BatteryStatus extends js.Object {
    /* 3 */ val charging: typings.winrtUwp.Windows.System.Power.BatteryStatus.charging with Double = js.native
    /* 1 */ val discharging: typings.winrtUwp.Windows.System.Power.BatteryStatus.discharging with Double = js.native
    /* 2 */ val idle: typings.winrtUwp.Windows.System.Power.BatteryStatus.idle with Double = js.native
    /* 0 */ val notPresent: typings.winrtUwp.Windows.System.Power.BatteryStatus.notPresent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.Power.BatteryStatus with Double] = js.native
  }
  
  /** Provides debugging APIs for computing your app’s total energy usage in real time. We recommend using these APIs only for debugging. */
  @js.native
  object Diagnostics extends js.Object {
    /** Provides debugging APIs for calculating your app's background energy usage in real time. We recommend using these APIs only for debugging. */
    @js.native
    abstract class BackgroundEnergyDiagnostics ()
      extends typings.winrtUwp.Windows.System.Power.Diagnostics.BackgroundEnergyDiagnostics
    
    /** Provides debugging APIs for calculating your app's foreground energy usage in real time. We recommend using these APIs only for debugging. */
    @js.native
    abstract class ForegroundEnergyDiagnostics ()
      extends typings.winrtUwp.Windows.System.Power.Diagnostics.ForegroundEnergyDiagnostics
    
    /* static members */
    @js.native
    object BackgroundEnergyDiagnostics extends js.Object {
      /** Gets the device-specific conversion factor used to convert energy usage (mW) to a normalized percentage. */
      var deviceSpecificConversionFactor: Double = js.native
      /**
        * Computes the total cumulative energy usage of the background task since the last reset, expressed as a percentage of normal.
        * @return The total cumulative energy usage of the background task since the last reset, expressed as a percentage of normal.
        */
      def computeTotalEnergyUsage(): Double = js.native
      /** Clears the value that represents the total cumulative energy usage of the background task since the last reset. */
      def resetTotalEnergyUsage(): Unit = js.native
    }
    
    /* static members */
    @js.native
    object ForegroundEnergyDiagnostics extends js.Object {
      /** Gets the device-specific conversion factor used to convert energy usage (mW) to a normalized percentage. */
      var deviceSpecificConversionFactor: Double = js.native
      /**
        * Computes the total cumulative energy usage of the foreground app since the last reset, expressed as a percentage of normal.
        * @return The total cumulative energy usage of the foreground app since the last reset, expressed as a percentage of normal.
        */
      def computeTotalEnergyUsage(): Double = js.native
      /** Clears the value that represents the total cumulative energy usage of the foreground app since the last reset. */
      def resetTotalEnergyUsage(): Unit = js.native
    }
    
  }
  
  /** Specifies the status of battery saver. */
  @js.native
  object EnergySaverStatus extends js.Object {
    /* 0 */ val disabled: typings.winrtUwp.Windows.System.Power.EnergySaverStatus.disabled with Double = js.native
    /* 1 */ val off: typings.winrtUwp.Windows.System.Power.EnergySaverStatus.off with Double = js.native
    /* 2 */ val on: typings.winrtUwp.Windows.System.Power.EnergySaverStatus.on with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.Power.EnergySaverStatus with Double] = js.native
  }
  
  /* static members */
  @js.native
  object ForegroundEnergyManager extends js.Object {
    /** Gets the excessive usage level, expressed as a percentage of normal energy usage. */
    var excessiveUsageLevel: Double = js.native
    /** Gets the low usage level, expressed as a percentage of normal energy consumption. */
    var lowUsageLevel: Double = js.native
    /** Gets the maximum acceptable usage level, expressed as a percentage of normal energy consumption. */
    var maxAcceptableUsageLevel: Double = js.native
    /** Gets the near-maximum acceptable usage level, expressed as a percentage of normal energy usage. */
    var nearMaxAcceptableUsageLevel: Double = js.native
    /** Occurs when the app's foreground energy usage has increased significantly. */
    @JSName("onrecentenergyusageincreased")
    var onrecentenergyusageincreased_Original: EventHandler[_] = js.native
    /** Occurs when the app's energy usage has decreased to a low usage level. */
    @JSName("onrecentenergyusagereturnedtolow")
    var onrecentenergyusagereturnedtolow_Original: EventHandler[_] = js.native
    /** Gets the nearest predefined energy level of the foreground app for the current 30 minute period, equal to LowUsageLevel , NearMaxAcceptableUsageLevel , MaxAcceptableUsageLevel , or ExcessiveUsageLevel . */
    var recentEnergyUsage: Double = js.native
    /** Gets the nearest predefined energy level of the foreground app for the current 30 minute period, equal to LowUsageLevel , NearMaxAcceptableUsageLevel , MaxAcceptableUsageLevel , or ExcessiveUsageLevel . */
    var recentEnergyUsageLevel: Double = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_recentenergyusageincreased(`type`: recentenergyusageincreased, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_recentenergyusagereturnedtolow(`type`: recentenergyusagereturnedtolow, listener: EventHandler[_]): Unit = js.native
    /** Occurs when the app's foreground energy usage has increased significantly. */
    def onrecentenergyusageincreased(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Occurs when the app's energy usage has decreased to a low usage level. */
    def onrecentenergyusagereturnedtolow(ev: js.Any with WinRTEvent[_]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_recentenergyusageincreased(`type`: recentenergyusageincreased, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_recentenergyusagereturnedtolow(`type`: recentenergyusagereturnedtolow, listener: EventHandler[_]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object PowerManager extends js.Object {
    /** Gets the device's battery status. */
    var batteryStatus: BatteryStatus = js.native
    /** Gets battery saver status, indicating when to save energy. */
    var energySaverStatus: EnergySaverStatus = js.native
    /** Occurs when BatteryStatus changes. */
    @JSName("onbatterystatuschanged")
    var onbatterystatuschanged_Original: EventHandler[_] = js.native
    /** Occurs when EnergySaverStatus changes. */
    @JSName("onenergysaverstatuschanged")
    var onenergysaverstatuschanged_Original: EventHandler[_] = js.native
    /** Occurs when the PowerSupplyStatus changes. */
    @JSName("onpowersupplystatuschanged")
    var onpowersupplystatuschanged_Original: EventHandler[_] = js.native
    /** Occurs when RemainingChargePercent changes. */
    @JSName("onremainingchargepercentchanged")
    var onremainingchargepercentchanged_Original: EventHandler[_] = js.native
    /** Occurs when RemainingDischargeTime changes. */
    @JSName("onremainingdischargetimechanged")
    var onremainingdischargetimechanged_Original: EventHandler[_] = js.native
    /** Gets the device's power supply status. */
    var powerSupplyStatus: PowerSupplyStatus = js.native
    /** Gets the total percentage of charge remaining from all batteries connected to the device. */
    var remainingChargePercent: Double = js.native
    /** Gets the total runtime remaining from all batteries connected to the device. */
    var remainingDischargeTime: Double = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_batterystatuschanged(`type`: batterystatuschanged, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_energysaverstatuschanged(`type`: energysaverstatuschanged, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_powersupplystatuschanged(`type`: powersupplystatuschanged, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_remainingchargepercentchanged(`type`: remainingchargepercentchanged, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_remainingdischargetimechanged(`type`: remainingdischargetimechanged, listener: EventHandler[_]): Unit = js.native
    /** Occurs when BatteryStatus changes. */
    def onbatterystatuschanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Occurs when EnergySaverStatus changes. */
    def onenergysaverstatuschanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Occurs when the PowerSupplyStatus changes. */
    def onpowersupplystatuschanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Occurs when RemainingChargePercent changes. */
    def onremainingchargepercentchanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Occurs when RemainingDischargeTime changes. */
    def onremainingdischargetimechanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_batterystatuschanged(`type`: batterystatuschanged, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_energysaverstatuschanged(`type`: energysaverstatuschanged, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_powersupplystatuschanged(`type`: powersupplystatuschanged, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_remainingchargepercentchanged(`type`: remainingchargepercentchanged, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_remainingdischargetimechanged(`type`: remainingdischargetimechanged, listener: EventHandler[_]): Unit = js.native
  }
  
  /** Represents the device's power supply status. */
  @js.native
  object PowerSupplyStatus extends js.Object {
    /* 2 */ val adequate: typings.winrtUwp.Windows.System.Power.PowerSupplyStatus.adequate with Double = js.native
    /* 1 */ val inadequate: typings.winrtUwp.Windows.System.Power.PowerSupplyStatus.inadequate with Double = js.native
    /* 0 */ val notPresent: typings.winrtUwp.Windows.System.Power.PowerSupplyStatus.notPresent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.Power.PowerSupplyStatus with Double] = js.native
  }
  
}

