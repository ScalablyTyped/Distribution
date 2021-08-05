package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.System.Power.BatteryStatus
import typings.winrtUwp.Windows.System.Power.EnergySaverStatus
import typings.winrtUwp.Windows.System.Power.PowerSupplyStatus
import typings.winrtUwp.winrtUwpStrings.batterystatuschanged
import typings.winrtUwp.winrtUwpStrings.energysaverstatuschanged
import typings.winrtUwp.winrtUwpStrings.powersupplystatuschanged
import typings.winrtUwp.winrtUwpStrings.recentenergyusageincreased
import typings.winrtUwp.winrtUwpStrings.recentenergyusagereturnedtolow
import typings.winrtUwp.winrtUwpStrings.remainingchargepercentchanged
import typings.winrtUwp.winrtUwpStrings.remainingdischargetimechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides power and energy usage APIs. */
object Power {
  
  /** Provides information about your app's background energy usage. */
  @JSGlobal("Windows.System.Power.BackgroundEnergyManager")
  @js.native
  abstract class BackgroundEnergyManager ()
    extends StObject
       with typings.winrtUwp.Windows.System.Power.BackgroundEnergyManager
  object BackgroundEnergyManager {
    
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_recentenergyusageincreased(`type`: recentenergyusageincreased, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_recentenergyusagereturnedtolow(`type`: recentenergyusagereturnedtolow, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Gets the excessive usage level, expressed as a percentage of normal energy usage. */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.excessiveUsageLevel")
    @js.native
    def excessiveUsageLevel: Double = js.native
    inline def excessiveUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excessiveUsageLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the low usage level, expressed as a percentage of normal energy consumption. */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.lowUsageLevel")
    @js.native
    def lowUsageLevel: Double = js.native
    inline def lowUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lowUsageLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the maximum acceptable usage level, expressed as a percentage of normal energy consumption. */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.maxAcceptableUsageLevel")
    @js.native
    def maxAcceptableUsageLevel: Double = js.native
    inline def maxAcceptableUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxAcceptableUsageLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the near-maximum acceptable usage level, expressed as a percentage of normal energy usage. */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.nearMaxAcceptableUsageLevel")
    @js.native
    def nearMaxAcceptableUsageLevel: Double = js.native
    inline def nearMaxAcceptableUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nearMaxAcceptableUsageLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the near-termination usage level, expressed as a percentage of normal energy usage. */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.nearTerminationUsageLevel")
    @js.native
    def nearTerminationUsageLevel: Double = js.native
    inline def nearTerminationUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nearTerminationUsageLevel")(x.asInstanceOf[js.Any])
    
    /** Occurs when the background task's energy usage has increased significantly. */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.onrecentenergyusageincreased")
    @js.native
    def onrecentenergyusageincreased: EventHandler[js.Any] = js.native
    inline def onrecentenergyusageincreased_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onrecentenergyusageincreased")(x.asInstanceOf[js.Any])
    
    /** Occurs when the background task's energy usage has decreased to a low usage level. */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.onrecentenergyusagereturnedtolow")
    @js.native
    def onrecentenergyusagereturnedtolow: EventHandler[js.Any] = js.native
    inline def onrecentenergyusagereturnedtolow_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onrecentenergyusagereturnedtolow")(x.asInstanceOf[js.Any])
    
    /** Gets the energy usage of the app's background task for the current 30 minute period, expressed as a percentage of normal. */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.recentEnergyUsage")
    @js.native
    def recentEnergyUsage: Double = js.native
    
    /** Gets the nearest predefined energy level of the app's background task for the current 30 minute period, equal to LowUsageLevel , NearMaxAcceptableUsageLevel , MaxAcceptableUsageLevel , ExcessiveUsageLevel , NearTerminationUsageLevel , or TerminationUsageLevel . */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.recentEnergyUsageLevel")
    @js.native
    def recentEnergyUsageLevel: Double = js.native
    inline def recentEnergyUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recentEnergyUsageLevel")(x.asInstanceOf[js.Any])
    
    inline def recentEnergyUsage_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recentEnergyUsage")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_recentenergyusageincreased(`type`: recentenergyusageincreased, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_recentenergyusagereturnedtolow(`type`: recentenergyusagereturnedtolow, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Gets the termination usage level, expressed as a percentage of normal energy usage. */
    /* static member */
    @JSGlobal("Windows.System.Power.BackgroundEnergyManager.terminationUsageLevel")
    @js.native
    def terminationUsageLevel: Double = js.native
    inline def terminationUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("terminationUsageLevel")(x.asInstanceOf[js.Any])
  }
  
  /** Indicates the status of the battery. */
  @JSGlobal("Windows.System.Power.BatteryStatus")
  @js.native
  object BatteryStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.Power.BatteryStatus & Double] = js.native
    
    /* 3 */ val charging: typings.winrtUwp.Windows.System.Power.BatteryStatus.charging & Double = js.native
    
    /* 1 */ val discharging: typings.winrtUwp.Windows.System.Power.BatteryStatus.discharging & Double = js.native
    
    /* 2 */ val idle: typings.winrtUwp.Windows.System.Power.BatteryStatus.idle & Double = js.native
    
    /* 0 */ val notPresent: typings.winrtUwp.Windows.System.Power.BatteryStatus.notPresent & Double = js.native
  }
  
  /** Provides debugging APIs for computing your app’s total energy usage in real time. We recommend using these APIs only for debugging. */
  object Diagnostics {
    
    /** Provides debugging APIs for calculating your app's background energy usage in real time. We recommend using these APIs only for debugging. */
    @JSGlobal("Windows.System.Power.Diagnostics.BackgroundEnergyDiagnostics")
    @js.native
    abstract class BackgroundEnergyDiagnostics ()
      extends StObject
         with typings.winrtUwp.Windows.System.Power.Diagnostics.BackgroundEnergyDiagnostics
    object BackgroundEnergyDiagnostics {
      
      @JSGlobal("Windows.System.Power.Diagnostics.BackgroundEnergyDiagnostics")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Computes the total cumulative energy usage of the background task since the last reset, expressed as a percentage of normal.
        * @return The total cumulative energy usage of the background task since the last reset, expressed as a percentage of normal.
        */
      /* static member */
      inline def computeTotalEnergyUsage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTotalEnergyUsage")().asInstanceOf[Double]
      
      /** Gets the device-specific conversion factor used to convert energy usage (mW) to a normalized percentage. */
      /* static member */
      @JSGlobal("Windows.System.Power.Diagnostics.BackgroundEnergyDiagnostics.deviceSpecificConversionFactor")
      @js.native
      def deviceSpecificConversionFactor: Double = js.native
      inline def deviceSpecificConversionFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceSpecificConversionFactor")(x.asInstanceOf[js.Any])
      
      /** Clears the value that represents the total cumulative energy usage of the background task since the last reset. */
      /* static member */
      inline def resetTotalEnergyUsage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTotalEnergyUsage")().asInstanceOf[Unit]
    }
    
    /** Provides debugging APIs for calculating your app's foreground energy usage in real time. We recommend using these APIs only for debugging. */
    @JSGlobal("Windows.System.Power.Diagnostics.ForegroundEnergyDiagnostics")
    @js.native
    abstract class ForegroundEnergyDiagnostics ()
      extends StObject
         with typings.winrtUwp.Windows.System.Power.Diagnostics.ForegroundEnergyDiagnostics
    object ForegroundEnergyDiagnostics {
      
      @JSGlobal("Windows.System.Power.Diagnostics.ForegroundEnergyDiagnostics")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Computes the total cumulative energy usage of the foreground app since the last reset, expressed as a percentage of normal.
        * @return The total cumulative energy usage of the foreground app since the last reset, expressed as a percentage of normal.
        */
      /* static member */
      inline def computeTotalEnergyUsage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTotalEnergyUsage")().asInstanceOf[Double]
      
      /** Gets the device-specific conversion factor used to convert energy usage (mW) to a normalized percentage. */
      /* static member */
      @JSGlobal("Windows.System.Power.Diagnostics.ForegroundEnergyDiagnostics.deviceSpecificConversionFactor")
      @js.native
      def deviceSpecificConversionFactor: Double = js.native
      inline def deviceSpecificConversionFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceSpecificConversionFactor")(x.asInstanceOf[js.Any])
      
      /** Clears the value that represents the total cumulative energy usage of the foreground app since the last reset. */
      /* static member */
      inline def resetTotalEnergyUsage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTotalEnergyUsage")().asInstanceOf[Unit]
    }
  }
  
  /** Specifies the status of battery saver. */
  @JSGlobal("Windows.System.Power.EnergySaverStatus")
  @js.native
  object EnergySaverStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.Power.EnergySaverStatus & Double] = js.native
    
    /* 0 */ val disabled: typings.winrtUwp.Windows.System.Power.EnergySaverStatus.disabled & Double = js.native
    
    /* 1 */ val off: typings.winrtUwp.Windows.System.Power.EnergySaverStatus.off & Double = js.native
    
    /* 2 */ val on: typings.winrtUwp.Windows.System.Power.EnergySaverStatus.on & Double = js.native
  }
  
  /** Provides information about your app's foreground energy usage. */
  @JSGlobal("Windows.System.Power.ForegroundEnergyManager")
  @js.native
  abstract class ForegroundEnergyManager ()
    extends StObject
       with typings.winrtUwp.Windows.System.Power.ForegroundEnergyManager
  object ForegroundEnergyManager {
    
    @JSGlobal("Windows.System.Power.ForegroundEnergyManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_recentenergyusageincreased(`type`: recentenergyusageincreased, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_recentenergyusagereturnedtolow(`type`: recentenergyusagereturnedtolow, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Gets the excessive usage level, expressed as a percentage of normal energy usage. */
    /* static member */
    @JSGlobal("Windows.System.Power.ForegroundEnergyManager.excessiveUsageLevel")
    @js.native
    def excessiveUsageLevel: Double = js.native
    inline def excessiveUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excessiveUsageLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the low usage level, expressed as a percentage of normal energy consumption. */
    /* static member */
    @JSGlobal("Windows.System.Power.ForegroundEnergyManager.lowUsageLevel")
    @js.native
    def lowUsageLevel: Double = js.native
    inline def lowUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lowUsageLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the maximum acceptable usage level, expressed as a percentage of normal energy consumption. */
    /* static member */
    @JSGlobal("Windows.System.Power.ForegroundEnergyManager.maxAcceptableUsageLevel")
    @js.native
    def maxAcceptableUsageLevel: Double = js.native
    inline def maxAcceptableUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxAcceptableUsageLevel")(x.asInstanceOf[js.Any])
    
    /** Gets the near-maximum acceptable usage level, expressed as a percentage of normal energy usage. */
    /* static member */
    @JSGlobal("Windows.System.Power.ForegroundEnergyManager.nearMaxAcceptableUsageLevel")
    @js.native
    def nearMaxAcceptableUsageLevel: Double = js.native
    inline def nearMaxAcceptableUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nearMaxAcceptableUsageLevel")(x.asInstanceOf[js.Any])
    
    /** Occurs when the app's foreground energy usage has increased significantly. */
    /* static member */
    @JSGlobal("Windows.System.Power.ForegroundEnergyManager.onrecentenergyusageincreased")
    @js.native
    def onrecentenergyusageincreased: EventHandler[js.Any] = js.native
    inline def onrecentenergyusageincreased_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onrecentenergyusageincreased")(x.asInstanceOf[js.Any])
    
    /** Occurs when the app's energy usage has decreased to a low usage level. */
    /* static member */
    @JSGlobal("Windows.System.Power.ForegroundEnergyManager.onrecentenergyusagereturnedtolow")
    @js.native
    def onrecentenergyusagereturnedtolow: EventHandler[js.Any] = js.native
    inline def onrecentenergyusagereturnedtolow_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onrecentenergyusagereturnedtolow")(x.asInstanceOf[js.Any])
    
    /** Gets the nearest predefined energy level of the foreground app for the current 30 minute period, equal to LowUsageLevel , NearMaxAcceptableUsageLevel , MaxAcceptableUsageLevel , or ExcessiveUsageLevel . */
    /* static member */
    @JSGlobal("Windows.System.Power.ForegroundEnergyManager.recentEnergyUsage")
    @js.native
    def recentEnergyUsage: Double = js.native
    
    /** Gets the nearest predefined energy level of the foreground app for the current 30 minute period, equal to LowUsageLevel , NearMaxAcceptableUsageLevel , MaxAcceptableUsageLevel , or ExcessiveUsageLevel . */
    /* static member */
    @JSGlobal("Windows.System.Power.ForegroundEnergyManager.recentEnergyUsageLevel")
    @js.native
    def recentEnergyUsageLevel: Double = js.native
    inline def recentEnergyUsageLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recentEnergyUsageLevel")(x.asInstanceOf[js.Any])
    
    inline def recentEnergyUsage_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recentEnergyUsage")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_recentenergyusageincreased(`type`: recentenergyusageincreased, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_recentenergyusagereturnedtolow(`type`: recentenergyusagereturnedtolow, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** Provides access to information about a device's battery and power supply status. */
  @JSGlobal("Windows.System.Power.PowerManager")
  @js.native
  abstract class PowerManager ()
    extends StObject
       with typings.winrtUwp.Windows.System.Power.PowerManager
  object PowerManager {
    
    @JSGlobal("Windows.System.Power.PowerManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_batterystatuschanged(`type`: batterystatuschanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_energysaverstatuschanged(`type`: energysaverstatuschanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_powersupplystatuschanged(`type`: powersupplystatuschanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_remainingchargepercentchanged(`type`: remainingchargepercentchanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_remainingdischargetimechanged(`type`: remainingdischargetimechanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Gets the device's battery status. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.batteryStatus")
    @js.native
    def batteryStatus: BatteryStatus = js.native
    inline def batteryStatus_=(x: BatteryStatus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("batteryStatus")(x.asInstanceOf[js.Any])
    
    /** Gets battery saver status, indicating when to save energy. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.energySaverStatus")
    @js.native
    def energySaverStatus: EnergySaverStatus = js.native
    inline def energySaverStatus_=(x: EnergySaverStatus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("energySaverStatus")(x.asInstanceOf[js.Any])
    
    /** Occurs when BatteryStatus changes. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.onbatterystatuschanged")
    @js.native
    def onbatterystatuschanged: EventHandler[js.Any] = js.native
    inline def onbatterystatuschanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onbatterystatuschanged")(x.asInstanceOf[js.Any])
    
    /** Occurs when EnergySaverStatus changes. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.onenergysaverstatuschanged")
    @js.native
    def onenergysaverstatuschanged: EventHandler[js.Any] = js.native
    inline def onenergysaverstatuschanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onenergysaverstatuschanged")(x.asInstanceOf[js.Any])
    
    /** Occurs when the PowerSupplyStatus changes. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.onpowersupplystatuschanged")
    @js.native
    def onpowersupplystatuschanged: EventHandler[js.Any] = js.native
    inline def onpowersupplystatuschanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onpowersupplystatuschanged")(x.asInstanceOf[js.Any])
    
    /** Occurs when RemainingChargePercent changes. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.onremainingchargepercentchanged")
    @js.native
    def onremainingchargepercentchanged: EventHandler[js.Any] = js.native
    inline def onremainingchargepercentchanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onremainingchargepercentchanged")(x.asInstanceOf[js.Any])
    
    /** Occurs when RemainingDischargeTime changes. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.onremainingdischargetimechanged")
    @js.native
    def onremainingdischargetimechanged: EventHandler[js.Any] = js.native
    inline def onremainingdischargetimechanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onremainingdischargetimechanged")(x.asInstanceOf[js.Any])
    
    /** Gets the device's power supply status. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.powerSupplyStatus")
    @js.native
    def powerSupplyStatus: PowerSupplyStatus = js.native
    inline def powerSupplyStatus_=(x: PowerSupplyStatus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("powerSupplyStatus")(x.asInstanceOf[js.Any])
    
    /** Gets the total percentage of charge remaining from all batteries connected to the device. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.remainingChargePercent")
    @js.native
    def remainingChargePercent: Double = js.native
    inline def remainingChargePercent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remainingChargePercent")(x.asInstanceOf[js.Any])
    
    /** Gets the total runtime remaining from all batteries connected to the device. */
    /* static member */
    @JSGlobal("Windows.System.Power.PowerManager.remainingDischargeTime")
    @js.native
    def remainingDischargeTime: Double = js.native
    inline def remainingDischargeTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remainingDischargeTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_batterystatuschanged(`type`: batterystatuschanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_energysaverstatuschanged(`type`: energysaverstatuschanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_powersupplystatuschanged(`type`: powersupplystatuschanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_remainingchargepercentchanged(`type`: remainingchargepercentchanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_remainingdischargetimechanged(`type`: remainingdischargetimechanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** Represents the device's power supply status. */
  @JSGlobal("Windows.System.Power.PowerSupplyStatus")
  @js.native
  object PowerSupplyStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.Power.PowerSupplyStatus & Double] = js.native
    
    /* 2 */ val adequate: typings.winrtUwp.Windows.System.Power.PowerSupplyStatus.adequate & Double = js.native
    
    /* 1 */ val inadequate: typings.winrtUwp.Windows.System.Power.PowerSupplyStatus.inadequate & Double = js.native
    
    /* 0 */ val notPresent: typings.winrtUwp.Windows.System.Power.PowerSupplyStatus.notPresent & Double = js.native
  }
}
