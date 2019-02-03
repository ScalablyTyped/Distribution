package typings
package winrtDashUwpLib.WindowsNs.SystemNs.PowerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to information about a device's battery and power supply status. */
@JSGlobal("Windows.System.Power.PowerManager")
@js.native
abstract class PowerManager () extends js.Object

/* static members */
@JSGlobal("Windows.System.Power.PowerManager")
@js.native
object PowerManager extends js.Object {
  /** Gets the device's battery status. */
  var batteryStatus: winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.BatteryStatus = js.native
  /** Gets battery saver status, indicating when to save energy. */
  var energySaverStatus: winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.EnergySaverStatus = js.native
  /** Occurs when BatteryStatus changes. */
  @JSName("onbatterystatuschanged")
  var onbatterystatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Occurs when EnergySaverStatus changes. */
  @JSName("onenergysaverstatuschanged")
  var onenergysaverstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Occurs when the PowerSupplyStatus changes. */
  @JSName("onpowersupplystatuschanged")
  var onpowersupplystatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Occurs when RemainingChargePercent changes. */
  @JSName("onremainingchargepercentchanged")
  var onremainingchargepercentchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Occurs when RemainingDischargeTime changes. */
  @JSName("onremainingdischargetimechanged")
  var onremainingdischargetimechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Gets the device's power supply status. */
  var powerSupplyStatus: winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.PowerSupplyStatus = js.native
  /** Gets the total percentage of charge remaining from all batteries connected to the device. */
  var remainingChargePercent: scala.Double = js.native
  /** Gets the total runtime remaining from all batteries connected to the device. */
  var remainingDischargeTime: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_batterystatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.batterystatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_energysaverstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.energysaverstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_powersupplystatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.powersupplystatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remainingchargepercentchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.remainingchargepercentchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remainingdischargetimechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.remainingdischargetimechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /** Occurs when BatteryStatus changes. */
  def onbatterystatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when EnergySaverStatus changes. */
  def onenergysaverstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when the PowerSupplyStatus changes. */
  def onpowersupplystatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when RemainingChargePercent changes. */
  def onremainingchargepercentchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when RemainingDischargeTime changes. */
  def onremainingdischargetimechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_batterystatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.batterystatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_energysaverstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.energysaverstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_powersupplystatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.powersupplystatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remainingchargepercentchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.remainingchargepercentchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remainingdischargetimechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.remainingdischargetimechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
}

