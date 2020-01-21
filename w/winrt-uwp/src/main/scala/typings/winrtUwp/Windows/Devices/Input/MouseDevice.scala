package typings.winrtUwp.Windows.Devices.Input

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.mousemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to identify and track connected mouse devices. */
@JSGlobal("Windows.Devices.Input.MouseDevice")
@js.native
abstract class MouseDevice () extends js.Object {
  /** Occurs when the mouse pointer is moved. */
  @JSName("onmousemoved")
  var onmousemoved_Original: TypedEventHandler[MouseDevice, MouseEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemoved(`type`: mousemoved, listener: TypedEventHandler[MouseDevice, MouseEventArgs]): Unit = js.native
  /** Occurs when the mouse pointer is moved. */
  def onmousemoved(ev: MouseEventArgs with WinRTEvent[MouseDevice]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemoved(`type`: mousemoved, listener: TypedEventHandler[MouseDevice, MouseEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Input.MouseDevice")
@js.native
object MouseDevice extends js.Object {
  /**
    * Retrieves the mouse device that is associated with the current view.
    * @return The mouse device.
    */
  def getForCurrentView(): MouseDevice = js.native
}

