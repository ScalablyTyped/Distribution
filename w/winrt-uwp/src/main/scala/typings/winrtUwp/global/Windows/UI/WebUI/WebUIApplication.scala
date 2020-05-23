package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.IActivatedEventArgs
import typings.winrtUwp.Windows.ApplicationModel.ISuspendingEventArgs
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.UI.WebUI.ActivatedEventHandler
import typings.winrtUwp.Windows.UI.WebUI.IWebUINavigatedEventArgs
import typings.winrtUwp.Windows.UI.WebUI.NavigatedEventHandler
import typings.winrtUwp.Windows.UI.WebUI.ResumingEventHandler
import typings.winrtUwp.Windows.UI.WebUI.SuspendingEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.activated
import typings.winrtUwp.winrtUwpStrings.navigated
import typings.winrtUwp.winrtUwpStrings.resuming
import typings.winrtUwp.winrtUwpStrings.suspending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an app to receive notifications related to the lifetime of the app. */
@JSGlobal("Windows.UI.WebUI.WebUIApplication")
@js.native
abstract class WebUIApplication ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIApplication

/* static members */
@JSGlobal("Windows.UI.WebUI.WebUIApplication")
@js.native
object WebUIApplication extends js.Object {
  /** Occurs when the app is activated. */
  @JSName("onactivated")
  var onactivated_Original: ActivatedEventHandler = js.native
  /** Occurs when the app is navigating. */
  @JSName("onnavigated")
  var onnavigated_Original: NavigatedEventHandler = js.native
  /** Occurs when the app is resuming. */
  @JSName("onresuming")
  var onresuming_Original: ResumingEventHandler = js.native
  /** Occurs when the app is suspending. */
  @JSName("onsuspending")
  var onsuspending_Original: SuspendingEventHandler = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activated(`type`: activated, listener: ActivatedEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigated(`type`: navigated, listener: NavigatedEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resuming(`type`: resuming, listener: ResumingEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspending(`type`: suspending, listener: SuspendingEventHandler): Unit = js.native
  /** Occurs when the app is activated. */
  def onactivated(ev: IActivatedEventArgs with WinRTEvent[_]): Unit = js.native
  /** Occurs when the app is navigating. */
  def onnavigated(ev: IWebUINavigatedEventArgs with WinRTEvent[_]): Unit = js.native
  /** Occurs when the app is resuming. */
  def onresuming(ev: WinRTEvent[_]): Unit = js.native
  /** Occurs when the app is suspending. */
  def onsuspending(ev: ISuspendingEventArgs with WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activated(`type`: activated, listener: ActivatedEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigated(`type`: navigated, listener: NavigatedEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resuming(`type`: resuming, listener: ResumingEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspending(`type`: suspending, listener: SuspendingEventHandler): Unit = js.native
}

