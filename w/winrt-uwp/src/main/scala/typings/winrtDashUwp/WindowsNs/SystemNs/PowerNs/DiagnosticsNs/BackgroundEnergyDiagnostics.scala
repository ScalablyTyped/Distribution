package typings.winrtDashUwp.WindowsNs.SystemNs.PowerNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides debugging APIs for calculating your app's background energy usage in real time. We recommend using these APIs only for debugging. */
@JSGlobal("Windows.System.Power.Diagnostics.BackgroundEnergyDiagnostics")
@js.native
abstract class BackgroundEnergyDiagnostics () extends js.Object

/* static members */
@JSGlobal("Windows.System.Power.Diagnostics.BackgroundEnergyDiagnostics")
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

