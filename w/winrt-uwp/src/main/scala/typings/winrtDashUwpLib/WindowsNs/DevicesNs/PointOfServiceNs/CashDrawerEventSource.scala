package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event sources that allow a developer to detect when the cash drawer is opened or closed. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerEventSource")
@js.native
abstract class CashDrawerEventSource () extends js.Object {
  /** Occurs when the cash drawer is closed. */
  @JSName("ondrawerclosed")
  var ondrawerclosed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawerEventSource, CashDrawerClosedEventArgs] = js.native
  /** Occurs when the cash drawer is opened. */
  @JSName("ondraweropened")
  var ondraweropened_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawerEventSource, CashDrawerOpenedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drawerclosed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.drawerclosed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawerEventSource, CashDrawerClosedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_draweropened(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.draweropened,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawerEventSource, CashDrawerOpenedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when the cash drawer is closed. */
  def ondrawerclosed(ev: CashDrawerClosedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CashDrawerEventSource]): scala.Unit = js.native
  /** Occurs when the cash drawer is opened. */
  def ondraweropened(ev: CashDrawerOpenedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CashDrawerEventSource]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drawerclosed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.drawerclosed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawerEventSource, CashDrawerClosedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_draweropened(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.draweropened,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CashDrawerEventSource, CashDrawerOpenedEventArgs]
  ): scala.Unit = js.native
}

