package typings.winrtUwp.Windows.UI.Core

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.backrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for an app to respond to system provided back-navigation events. */
@js.native
trait SystemNavigationManager extends js.Object {
  /** Gets or sets a value that indicates whether a back button is shown in the system UI. */
  var appViewBackButtonVisibility: AppViewBackButtonVisibility = js.native
  /** Occurs when the user invokes the system provided button, gesture, or voice command for back-navigation. */
  @JSName("onbackrequested")
  var onbackrequested_Original: EventHandler[_] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_backrequested(`type`: backrequested, listener: EventHandler[_]): Unit = js.native
  /** Occurs when the user invokes the system provided button, gesture, or voice command for back-navigation. */
  def onbackrequested(ev: js.Any with WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_backrequested(`type`: backrequested, listener: EventHandler[_]): Unit = js.native
}

