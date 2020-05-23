package typings.winrtUwp.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.hiding
import typings.winrtUwp.winrtUwpStrings.showing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an app to register to receive notifications when the input pane is about to be displayed or hidden, and to determine which portion of the application's window is being obscured by the input pane. */
@js.native
trait InputPane extends js.Object {
  /** Gets the region of the app window obscured by the input pane. */
  var occludedRect: Rect = js.native
  /** Occurs when the input pane is about to be hidden by sliding out of view. */
  @JSName("onhiding")
  var onhiding_Original: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs] = js.native
  /** Occurs when the input pane is about to be displayed by sliding into view. */
  @JSName("onshowing")
  var onshowing_Original: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs] = js.native
  /** Gets or sets a value that indicates whether the input pane is shown. */
  var visible: Boolean = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiding(`type`: hiding, listener: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_showing(`type`: showing, listener: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]): Unit = js.native
  /** Occurs when the input pane is about to be hidden by sliding out of view. */
  def onhiding(ev: InputPaneVisibilityEventArgs with WinRTEvent[InputPane]): Unit = js.native
  /** Occurs when the input pane is about to be displayed by sliding into view. */
  def onshowing(ev: InputPaneVisibilityEventArgs with WinRTEvent[InputPane]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hiding(`type`: hiding, listener: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_showing(`type`: showing, listener: TypedEventHandler[InputPane, InputPaneVisibilityEventArgs]): Unit = js.native
  /**
    * Hides the InputPane if it is showing.
    * @return true if the InputPane was hidden successfully; otherwise false.
    */
  def tryHide(): Boolean = js.native
  /**
    * Shows the InputPane if it is hidden.
    * @return true if the InputPane was shown successfully; otherwise false.
    */
  def tryShow(): Boolean = js.native
}

