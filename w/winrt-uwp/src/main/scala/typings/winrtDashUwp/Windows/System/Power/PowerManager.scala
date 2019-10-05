package typings.winrtDashUwp.Windows.System.Power

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.batterystatuschanged
import typings.winrtDashUwp.winrtDashUwpStrings.energysaverstatuschanged
import typings.winrtDashUwp.winrtDashUwpStrings.powersupplystatuschanged
import typings.winrtDashUwp.winrtDashUwpStrings.remainingchargepercentchanged
import typings.winrtDashUwp.winrtDashUwpStrings.remainingdischargetimechanged
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

