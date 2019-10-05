package typings.winrtDashUwp.Windows.System.Power

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides debugging APIs for computing your app’s total energy usage in real time. We recommend using these APIs only for debugging. */
@JSGlobal("Windows.System.Power.Diagnostics")
@js.native
object Diagnostics extends js.Object {
  /** Provides debugging APIs for calculating your app's background energy usage in real time. We recommend using these APIs only for debugging. */
  @js.native
  abstract class BackgroundEnergyDiagnostics () extends js.Object
  
  /** Provides debugging APIs for calculating your app's foreground energy usage in real time. We recommend using these APIs only for debugging. */
  @js.native
  abstract class ForegroundEnergyDiagnostics () extends js.Object
  
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

