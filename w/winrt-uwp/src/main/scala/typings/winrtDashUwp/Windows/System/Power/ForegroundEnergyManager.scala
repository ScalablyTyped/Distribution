package typings.winrtDashUwp.Windows.System.Power

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.recentenergyusageincreased
import typings.winrtDashUwp.winrtDashUwpStrings.recentenergyusagereturnedtolow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about your app's foreground energy usage. */
@JSGlobal("Windows.System.Power.ForegroundEnergyManager")
@js.native
abstract class ForegroundEnergyManager () extends js.Object

/* static members */
@JSGlobal("Windows.System.Power.ForegroundEnergyManager")
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

