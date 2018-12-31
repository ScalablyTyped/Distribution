package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an app to register to receive notifications when the input pane is about to be displayed or hidden, and to determine which portion of the application's window is being obscured by the input pane. */
@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
abstract class InputPane () extends js.Object {
  /** Gets the region of the app window obscured by the input pane. */
  var occludedRect: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /** Occurs when the input pane is about to be hidden by sliding out of view. */
  @JSName("onhiding")
  var onhiding_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[InputPane, InputPaneVisibilityEventArgs] = js.native
  /** Occurs when the input pane is about to be displayed by sliding into view. */
  @JSName("onshowing")
  var onshowing_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[InputPane, InputPaneVisibilityEventArgs] = js.native
  /** Gets or sets a value that indicates whether the input pane is shown. */
  var visible: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiding(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.hiding,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_showing(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.showing,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]
  ): scala.Unit = js.native
  /** Occurs when the input pane is about to be hidden by sliding out of view. */
  def onhiding(ev: InputPaneVisibilityEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[InputPane]): scala.Unit = js.native
  /** Occurs when the input pane is about to be displayed by sliding into view. */
  def onshowing(ev: InputPaneVisibilityEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[InputPane]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hiding(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.hiding,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_showing(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.showing,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]
  ): scala.Unit = js.native
  /**
    * Hides the InputPane if it is showing.
    * @return true if the InputPane was hidden successfully; otherwise false.
    */
  def tryHide(): scala.Boolean = js.native
  /**
    * Shows the InputPane if it is hidden.
    * @return true if the InputPane was shown successfully; otherwise false.
    */
  def tryShow(): scala.Boolean = js.native
}

/** Enables an app to register to receive notifications when the input pane is about to be displayed or hidden, and to determine which portion of the application's window is being obscured by the input pane. */
@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
object InputPane extends js.Object {
  /**
    * Gets the InputPane object associated with the application window that is currently visible.
    * @return The input pane.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.InputPane = js.native
}

