package typings.winrtDashUwp.Windows.Media.PlayTo

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.sourcerequested
import typings.winrtDashUwp.winrtDashUwpStrings.sourceselected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to Play To capabilities. */
@JSGlobal("Windows.Media.PlayTo.PlayToManager")
@js.native
abstract class PlayToManager () extends js.Object {
  /** Enables or disables the default source selection for Play To. */
  var defaultSourceSelection: Boolean = js.native
  /** Occurs when a user requests media to stream to a Play To target device. */
  @JSName("onsourcerequested")
  var onsourcerequested_Original: TypedEventHandler[PlayToManager, PlayToSourceRequestedEventArgs] = js.native
  /** Occurs when a Play To source element has been selected. */
  @JSName("onsourceselected")
  var onsourceselected_Original: TypedEventHandler[PlayToManager, PlayToSourceSelectedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourcerequested(
    `type`: sourcerequested,
    listener: TypedEventHandler[PlayToManager, PlayToSourceRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceselected(`type`: sourceselected, listener: TypedEventHandler[PlayToManager, PlayToSourceSelectedEventArgs]): Unit = js.native
  /** Occurs when a user requests media to stream to a Play To target device. */
  def onsourcerequested(ev: PlayToSourceRequestedEventArgs with WinRTEvent[PlayToManager]): Unit = js.native
  /** Occurs when a Play To source element has been selected. */
  def onsourceselected(ev: PlayToSourceSelectedEventArgs with WinRTEvent[PlayToManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourcerequested(
    `type`: sourcerequested,
    listener: TypedEventHandler[PlayToManager, PlayToSourceRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceselected(`type`: sourceselected, listener: TypedEventHandler[PlayToManager, PlayToSourceSelectedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Media.PlayTo.PlayToManager")
@js.native
object PlayToManager extends js.Object {
  /**
    * Gets the Play To manager for the current view.
    * @return The Play To manager for the current view.
    */
  def getForCurrentView(): PlayToManager = js.native
  /** Displays the Play To UI. */
  def showPlayToUI(): Unit = js.native
}

