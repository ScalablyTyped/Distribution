package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.keydown
import typings.winrtUwp.winrtUwpStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an app to override the system processing of raw keyboard input, including key combinations such as shortcut keys, access keys (or hot keys), accelerator keys, and application keys. */
@js.native
trait KeyboardDeliveryInterceptor extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, listener: TypedEventHandler[KeyboardDeliveryInterceptor, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, listener: TypedEventHandler[KeyboardDeliveryInterceptor, _]): Unit = js.native
  
  /** Gets or sets whether the app overrides the system processing of raw keyboard input, including key combinations such as shortcut keys, access keys (or hot keys), accelerator keys, and application keys. */
  var isInterceptionEnabledWhenInForeground: Boolean = js.native
  
  /** Occurs when a keyboard key is pressed. State info and event data is routed through this event instead of CoreWindow.KeyDown . */
  def onkeydown(ev: js.Any with WinRTEvent[KeyboardDeliveryInterceptor]): Unit = js.native
  /** Occurs when a keyboard key is pressed. State info and event data is routed through this event instead of CoreWindow.KeyDown . */
  @JSName("onkeydown")
  var onkeydown_Original: TypedEventHandler[KeyboardDeliveryInterceptor, _] = js.native
  
  /** Occurs when a pressed keyboard key is released. State info and event data is routed through this event instead of CoreWindow.KeyUp . */
  def onkeyup(ev: js.Any with WinRTEvent[KeyboardDeliveryInterceptor]): Unit = js.native
  /** Occurs when a pressed keyboard key is released. State info and event data is routed through this event instead of CoreWindow.KeyUp . */
  @JSName("onkeyup")
  var onkeyup_Original: TypedEventHandler[KeyboardDeliveryInterceptor, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown, listener: TypedEventHandler[KeyboardDeliveryInterceptor, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup, listener: TypedEventHandler[KeyboardDeliveryInterceptor, _]): Unit = js.native
}
