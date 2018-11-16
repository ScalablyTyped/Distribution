package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The cash drawer close alarm. Parameter defaults are provided, however the user can update them as appropriate. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerCloseAlarm")
@js.native
abstract class CashDrawerCloseAlarm () extends js.Object {
  /** Gets or sets the alarm timeout for the cash drawer close alarm. */
  var alarmTimeout: scala.Double = js.native
  /** Delay between cash drawer closed alarm beeps. */
  var beepDelay: scala.Double = js.native
  /** Duration of the cash drawer close alarm beep. */
  var beepDuration: scala.Double = js.native
  /** Frequency of beep tone. */
  var beepFrequency: scala.Double = js.native
  /** Event allowing the app to be notified if the alarm timeout has been triggered. */
  @JSName("onalarmtimeoutexpired")
  var onalarmtimeoutexpired_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawerCloseAlarm, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_alarmtimeoutexpired(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.alarmtimeoutexpired,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawerCloseAlarm, _]
  ): scala.Unit = js.native
  /** Event allowing the app to be notified if the alarm timeout has been triggered. */
  def onalarmtimeoutexpired(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[CashDrawerCloseAlarm]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_alarmtimeoutexpired(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.alarmtimeoutexpired,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawerCloseAlarm, _]
  ): scala.Unit = js.native
  /**
                   * Starts the alarm countdown, returning an awaitable object that completes when the cash drawer is closed.
                   * @return True if the drawer has been closed; otherwise, false indicates a problem has occurred.
                   */
  def startAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

