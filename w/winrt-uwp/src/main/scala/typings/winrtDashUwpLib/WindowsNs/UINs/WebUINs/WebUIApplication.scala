package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an app to receive notifications related to the lifetime of the app. */
@JSGlobal("Windows.UI.WebUI.WebUIApplication")
@js.native
abstract class WebUIApplication () extends js.Object

/** Enables an app to receive notifications related to the lifetime of the app. */
@JSGlobal("Windows.UI.WebUI.WebUIApplication")
@js.native
object WebUIApplication extends js.Object {
  /** Occurs when the app is activated. */
  @JSName("onactivated")
  var onactivated_Original: winrtDashUwpLib.WindowsNs.UINs.WebUINs.ActivatedEventHandler = js.native
  /** Occurs when the app is navigating. */
  @JSName("onnavigated")
  var onnavigated_Original: winrtDashUwpLib.WindowsNs.UINs.WebUINs.NavigatedEventHandler = js.native
  /** Occurs when the app is resuming. */
  @JSName("onresuming")
  var onresuming_Original: winrtDashUwpLib.WindowsNs.UINs.WebUINs.ResumingEventHandler = js.native
  /** Occurs when the app is suspending. */
  @JSName("onsuspending")
  var onsuspending_Original: winrtDashUwpLib.WindowsNs.UINs.WebUINs.SuspendingEventHandler = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.activated,
    listener: winrtDashUwpLib.WindowsNs.UINs.WebUINs.ActivatedEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_navigated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.navigated,
    listener: winrtDashUwpLib.WindowsNs.UINs.WebUINs.NavigatedEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resuming(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.resuming,
    listener: winrtDashUwpLib.WindowsNs.UINs.WebUINs.ResumingEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspending(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.suspending,
    listener: winrtDashUwpLib.WindowsNs.UINs.WebUINs.SuspendingEventHandler
  ): scala.Unit = js.native
  /** Occurs when the app is activated. */
  def onactivated(
    ev: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.IActivatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_]
  ): scala.Unit = js.native
  /** Occurs when the app is navigating. */
  def onnavigated(
    ev: winrtDashUwpLib.WindowsNs.UINs.WebUINs.IWebUINavigatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_]
  ): scala.Unit = js.native
  /** Occurs when the app is resuming. */
  def onresuming(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Occurs when the app is suspending. */
  def onsuspending(
    ev: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ISuspendingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.activated,
    listener: winrtDashUwpLib.WindowsNs.UINs.WebUINs.ActivatedEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_navigated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.navigated,
    listener: winrtDashUwpLib.WindowsNs.UINs.WebUINs.NavigatedEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resuming(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.resuming,
    listener: winrtDashUwpLib.WindowsNs.UINs.WebUINs.ResumingEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspending(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.suspending,
    listener: winrtDashUwpLib.WindowsNs.UINs.WebUINs.SuspendingEventHandler
  ): scala.Unit = js.native
}

