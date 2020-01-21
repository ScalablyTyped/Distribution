package typings.winrtUwp.Windows.System.Power

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.recentenergyusageincreased
import typings.winrtUwp.winrtUwpStrings.recentenergyusagereturnedtolow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about your app's background energy usage. */
@JSGlobal("Windows.System.Power.BackgroundEnergyManager")
@js.native
abstract class BackgroundEnergyManager () extends js.Object

/* static members */
@JSGlobal("Windows.System.Power.BackgroundEnergyManager")
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

