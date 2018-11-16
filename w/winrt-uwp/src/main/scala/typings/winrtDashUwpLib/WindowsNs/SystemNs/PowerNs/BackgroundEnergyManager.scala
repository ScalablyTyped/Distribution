package typings
package winrtDashUwpLib.WindowsNs.SystemNs.PowerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about your app's background energy usage. */
@JSGlobal("Windows.System.Power.BackgroundEnergyManager")
@js.native
abstract class BackgroundEnergyManager () extends js.Object

/** Provides information about your app's background energy usage. */
@JSGlobal("Windows.System.Power.BackgroundEnergyManager")
@js.native
object BackgroundEnergyManager extends js.Object {
  /** Gets the excessive usage level, expressed as a percentage of normal energy usage. */
  var excessiveUsageLevel: scala.Double = js.native
  /** Gets the low usage level, expressed as a percentage of normal energy consumption. */
  var lowUsageLevel: scala.Double = js.native
  /** Gets the maximum acceptable usage level, expressed as a percentage of normal energy consumption. */
  var maxAcceptableUsageLevel: scala.Double = js.native
  /** Gets the near-maximum acceptable usage level, expressed as a percentage of normal energy usage. */
  var nearMaxAcceptableUsageLevel: scala.Double = js.native
  /** Gets the near-termination usage level, expressed as a percentage of normal energy usage. */
  var nearTerminationUsageLevel: scala.Double = js.native
  /** Occurs when the background task's energy usage has increased significantly. */
  @JSName("onrecentenergyusageincreased")
  var onrecentenergyusageincreased_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Occurs when the background task's energy usage has decreased to a low usage level. */
  @JSName("onrecentenergyusagereturnedtolow")
  var onrecentenergyusagereturnedtolow_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Gets the energy usage of the app's background task for the current 30 minute period, expressed as a percentage of normal. */
  var recentEnergyUsage: scala.Double = js.native
  /** Gets the nearest predefined energy level of the app's background task for the current 30 minute period, equal to LowUsageLevel , NearMaxAcceptableUsageLevel , MaxAcceptableUsageLevel , ExcessiveUsageLevel , NearTerminationUsageLevel , or TerminationUsageLevel . */
  var recentEnergyUsageLevel: scala.Double = js.native
  /** Gets the termination usage level, expressed as a percentage of normal energy usage. */
  var terminationUsageLevel: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_recentenergyusageincreased(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.recentenergyusageincreased,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_recentenergyusagereturnedtolow(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.recentenergyusagereturnedtolow,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /** Occurs when the background task's energy usage has increased significantly. */
  def onrecentenergyusageincreased(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when the background task's energy usage has decreased to a low usage level. */
  def onrecentenergyusagereturnedtolow(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_recentenergyusageincreased(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.recentenergyusageincreased,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_recentenergyusagereturnedtolow(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.recentenergyusagereturnedtolow,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
}

