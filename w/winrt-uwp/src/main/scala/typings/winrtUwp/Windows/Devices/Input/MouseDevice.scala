package typings.winrtUwp.Windows.Devices.Input

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.mousemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports the ability to identify and track connected mouse devices. */
@js.native
trait MouseDevice extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemoved(`type`: mousemoved, listener: TypedEventHandler[MouseDevice, MouseEventArgs]): Unit = js.native
  
  /** Occurs when the mouse pointer is moved. */
  def onmousemoved(ev: MouseEventArgs with WinRTEvent[MouseDevice]): Unit = js.native
  /** Occurs when the mouse pointer is moved. */
  @JSName("onmousemoved")
  var onmousemoved_Original: TypedEventHandler[MouseDevice, MouseEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemoved(`type`: mousemoved, listener: TypedEventHandler[MouseDevice, MouseEventArgs]): Unit = js.native
}
