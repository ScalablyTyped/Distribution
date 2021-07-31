package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides power and energy usage APIs. */
object Power {
  
  @js.native
  sealed trait BatteryStatus extends StObject
  /** Indicates the status of the battery. */
  @JSGlobal("Windows.System.Power.BatteryStatus")
  @js.native
  object BatteryStatus extends StObject {
    
    /** The battery is charging. */
    @js.native
    sealed trait charging
      extends StObject
         with BatteryStatus
    
    /** The battery is discharging. */
    @js.native
    sealed trait discharging
      extends StObject
         with BatteryStatus
    
    /** The battery is idle. */
    @js.native
    sealed trait idle
      extends StObject
         with BatteryStatus
    
    /** The battery or battery controller is not present. */
    @js.native
    sealed trait notPresent
      extends StObject
         with BatteryStatus
  }
  
  @js.native
  sealed trait EnergySaverStatus extends StObject
  /** Specifies the status of battery saver. */
  @JSGlobal("Windows.System.Power.EnergySaverStatus")
  @js.native
  object EnergySaverStatus extends StObject {
    
    /** Battery saver is off permanently or the device is plugged in. */
    @js.native
    sealed trait disabled
      extends StObject
         with EnergySaverStatus
    
    /** Battery saver is off now, but ready to turn on automatically. */
    @js.native
    sealed trait off
      extends StObject
         with EnergySaverStatus
    
    /** Battery saver is on. Save energy where possible. */
    @js.native
    sealed trait on
      extends StObject
         with EnergySaverStatus
  }
  
  @js.native
  sealed trait PowerSupplyStatus extends StObject
  /** Represents the device's power supply status. */
  @JSGlobal("Windows.System.Power.PowerSupplyStatus")
  @js.native
  object PowerSupplyStatus extends StObject {
    
    /** The device has an adequate power supply. */
    @js.native
    sealed trait adequate
      extends StObject
         with PowerSupplyStatus
    
    /** The device has an inadequate power supply. */
    @js.native
    sealed trait inadequate
      extends StObject
         with PowerSupplyStatus
    
    /** The device has no power supply. */
    @js.native
    sealed trait notPresent
      extends StObject
         with PowerSupplyStatus
  }
  
  /** Provides information about your app's background energy usage. */
  trait BackgroundEnergyManager extends StObject
  
  /** Provides debugging APIs for computing your app’s total energy usage in real time. We recommend using these APIs only for debugging. */
  object Diagnostics {
    
    /** Provides debugging APIs for calculating your app's background energy usage in real time. We recommend using these APIs only for debugging. */
    trait BackgroundEnergyDiagnostics extends StObject
    
    /** Provides debugging APIs for calculating your app's foreground energy usage in real time. We recommend using these APIs only for debugging. */
    trait ForegroundEnergyDiagnostics extends StObject
  }
  
  /** Provides information about your app's foreground energy usage. */
  trait ForegroundEnergyManager extends StObject
  
  /** Provides access to information about a device's battery and power supply status. */
  trait PowerManager extends StObject
}
