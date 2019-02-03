package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to Play To capabilities. */
@JSGlobal("Windows.Media.PlayTo.PlayToManager")
@js.native
abstract class PlayToManager () extends js.Object {
  /** Enables or disables the default source selection for Play To. */
  var defaultSourceSelection: scala.Boolean = js.native
  /** Occurs when a user requests media to stream to a Play To target device. */
  @JSName("onsourcerequested")
  var onsourcerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToManager, PlayToSourceRequestedEventArgs] = js.native
  /** Occurs when a Play To source element has been selected. */
  @JSName("onsourceselected")
  var onsourceselected_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToManager, PlayToSourceSelectedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourcerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourcerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToManager, PlayToSourceRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourceselected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceselected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToManager, PlayToSourceSelectedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when a user requests media to stream to a Play To target device. */
  def onsourcerequested(ev: PlayToSourceRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToManager]): scala.Unit = js.native
  /** Occurs when a Play To source element has been selected. */
  def onsourceselected(ev: PlayToSourceSelectedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourcerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourcerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToManager, PlayToSourceRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourceselected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourceselected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToManager, PlayToSourceSelectedEventArgs]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Media.PlayTo.PlayToManager")
@js.native
object PlayToManager extends js.Object {
  /**
    * Gets the Play To manager for the current view.
    * @return The Play To manager for the current view.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToManager = js.native
  /** Displays the Play To UI. */
  def showPlayToUI(): scala.Unit = js.native
}

