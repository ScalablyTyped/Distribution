package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the events that notify an app of triggers to its edge-based UI. */
@JSGlobal("Windows.UI.Input.EdgeGesture")
@js.native
abstract class EdgeGesture () extends js.Object {
  /** Fires when a user cancels a show or hide action for an edge-based UI. */
  @JSName("oncanceled")
  var oncanceled_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EdgeGesture, EdgeGestureEventArgs] = js.native
  /** Fires to indicate that the user has successfully summoned or dismissed the edge-based UI. This occurs either when the user lifts his or her finger from a touch-enabled screen or when the user presses Win+Z on the keyboard. */
  @JSName("oncompleted")
  var oncompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EdgeGesture, EdgeGestureEventArgs] = js.native
  /** Fires when a user begins an action to summon or dismiss edge-based UI. */
  @JSName("onstarting")
  var onstarting_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EdgeGesture, EdgeGestureEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canceled(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.canceled,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_starting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.starting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]
  ): scala.Unit = js.native
  /** Fires when a user cancels a show or hide action for an edge-based UI. */
  def oncanceled(ev: EdgeGestureEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[EdgeGesture]): scala.Unit = js.native
  /** Fires to indicate that the user has successfully summoned or dismissed the edge-based UI. This occurs either when the user lifts his or her finger from a touch-enabled screen or when the user presses Win+Z on the keyboard. */
  def oncompleted(ev: EdgeGestureEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[EdgeGesture]): scala.Unit = js.native
  /** Fires when a user begins an action to summon or dismiss edge-based UI. */
  def onstarting(ev: EdgeGestureEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[EdgeGesture]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canceled(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.canceled,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_starting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.starting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]
  ): scala.Unit = js.native
}

/** Provides access to the events that notify an app of triggers to its edge-based UI. */
@JSGlobal("Windows.UI.Input.EdgeGesture")
@js.native
object EdgeGesture extends js.Object {
  /**
    * Gets an instance of the EdgeGesture class that is used to add and remove event delegate handlers for the current view.
    * @return The currently relevant instance of the EdgeGesture object.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.UINs.InputNs.EdgeGesture = js.native
}

