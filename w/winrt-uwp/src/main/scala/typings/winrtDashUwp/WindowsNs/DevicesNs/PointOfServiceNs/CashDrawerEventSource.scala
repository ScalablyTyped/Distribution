package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.drawerclosed
import typings.winrtDashUwp.winrtDashUwpStrings.draweropened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event sources that allow a developer to detect when the cash drawer is opened or closed. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerEventSource")
@js.native
abstract class CashDrawerEventSource () extends js.Object {
  /** Occurs when the cash drawer is closed. */
  @JSName("ondrawerclosed")
  var ondrawerclosed_Original: TypedEventHandler[CashDrawerEventSource, CashDrawerClosedEventArgs] = js.native
  /** Occurs when the cash drawer is opened. */
  @JSName("ondraweropened")
  var ondraweropened_Original: TypedEventHandler[CashDrawerEventSource, CashDrawerOpenedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drawerclosed(
    `type`: drawerclosed,
    listener: TypedEventHandler[CashDrawerEventSource, CashDrawerClosedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_draweropened(
    `type`: draweropened,
    listener: TypedEventHandler[CashDrawerEventSource, CashDrawerOpenedEventArgs]
  ): Unit = js.native
  /** Occurs when the cash drawer is closed. */
  def ondrawerclosed(ev: CashDrawerClosedEventArgs with WinRTEvent[CashDrawerEventSource]): Unit = js.native
  /** Occurs when the cash drawer is opened. */
  def ondraweropened(ev: CashDrawerOpenedEventArgs with WinRTEvent[CashDrawerEventSource]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drawerclosed(
    `type`: drawerclosed,
    listener: TypedEventHandler[CashDrawerEventSource, CashDrawerClosedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_draweropened(
    `type`: draweropened,
    listener: TypedEventHandler[CashDrawerEventSource, CashDrawerOpenedEventArgs]
  ): Unit = js.native
}

