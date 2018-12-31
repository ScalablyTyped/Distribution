package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to identify and track connected mouse devices. */
@JSGlobal("Windows.Devices.Input.MouseDevice")
@js.native
abstract class MouseDevice () extends js.Object {
  /** Occurs when the mouse pointer is moved. */
  @JSName("onmousemoved")
  var onmousemoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MouseDevice, MouseEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mousemoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MouseDevice, MouseEventArgs]
  ): scala.Unit = js.native
  /** Occurs when the mouse pointer is moved. */
  def onmousemoved(ev: MouseEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MouseDevice]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mousemoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MouseDevice, MouseEventArgs]
  ): scala.Unit = js.native
}

/** Supports the ability to identify and track connected mouse devices. */
@JSGlobal("Windows.Devices.Input.MouseDevice")
@js.native
object MouseDevice extends js.Object {
  /**
    * Retrieves the mouse device that is associated with the current view.
    * @return The mouse device.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.MouseDevice = js.native
}

