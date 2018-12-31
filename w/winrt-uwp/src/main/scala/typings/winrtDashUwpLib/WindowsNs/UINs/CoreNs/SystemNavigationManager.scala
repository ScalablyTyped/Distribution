package typings
package winrtDashUwpLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for an app to respond to system provided back-navigation events. */
@JSGlobal("Windows.UI.Core.SystemNavigationManager")
@js.native
abstract class SystemNavigationManager () extends js.Object {
  /** Gets or sets a value that indicates whether a back button is shown in the system UI. */
  var appViewBackButtonVisibility: AppViewBackButtonVisibility = js.native
  /** Occurs when the user invokes the system provided button, gesture, or voice command for back-navigation. */
  @JSName("onbackrequested")
  var onbackrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_backrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.backrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /** Occurs when the user invokes the system provided button, gesture, or voice command for back-navigation. */
  def onbackrequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_backrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.backrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
}

/** Provides a way for an app to respond to system provided back-navigation events. */
@JSGlobal("Windows.UI.Core.SystemNavigationManager")
@js.native
object SystemNavigationManager extends js.Object {
  /**
    * Returns the SystemNavigationManager object associated with the current window.
    * @return The SystemNavigationManager object associated with the current window.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.UINs.CoreNs.SystemNavigationManager = js.native
}

