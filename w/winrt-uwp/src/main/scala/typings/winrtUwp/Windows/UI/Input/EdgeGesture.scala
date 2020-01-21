package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.canceled
import typings.winrtUwp.winrtUwpStrings.completed
import typings.winrtUwp.winrtUwpStrings.starting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the events that notify an app of triggers to its edge-based UI. */
@JSGlobal("Windows.UI.Input.EdgeGesture")
@js.native
abstract class EdgeGesture () extends js.Object {
  /** Fires when a user cancels a show or hide action for an edge-based UI. */
  @JSName("oncanceled")
  var oncanceled_Original: TypedEventHandler[EdgeGesture, EdgeGestureEventArgs] = js.native
  /** Fires to indicate that the user has successfully summoned or dismissed the edge-based UI. This occurs either when the user lifts their finger from a touch-enabled screen or when the user presses Win+Z on the keyboard. */
  @JSName("oncompleted")
  var oncompleted_Original: TypedEventHandler[EdgeGesture, EdgeGestureEventArgs] = js.native
  /** Fires when a user begins an action to summon or dismiss edge-based UI. */
  @JSName("onstarting")
  var onstarting_Original: TypedEventHandler[EdgeGesture, EdgeGestureEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canceled(`type`: canceled, listener: TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(`type`: completed, listener: TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_starting(`type`: starting, listener: TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]): Unit = js.native
  /** Fires when a user cancels a show or hide action for an edge-based UI. */
  def oncanceled(ev: EdgeGestureEventArgs with WinRTEvent[EdgeGesture]): Unit = js.native
  /** Fires to indicate that the user has successfully summoned or dismissed the edge-based UI. This occurs either when the user lifts their finger from a touch-enabled screen or when the user presses Win+Z on the keyboard. */
  def oncompleted(ev: EdgeGestureEventArgs with WinRTEvent[EdgeGesture]): Unit = js.native
  /** Fires when a user begins an action to summon or dismiss edge-based UI. */
  def onstarting(ev: EdgeGestureEventArgs with WinRTEvent[EdgeGesture]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canceled(`type`: canceled, listener: TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(`type`: completed, listener: TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_starting(`type`: starting, listener: TypedEventHandler[EdgeGesture, EdgeGestureEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.EdgeGesture")
@js.native
object EdgeGesture extends js.Object {
  /**
    * Gets an instance of the EdgeGesture class that is used to add and remove event delegate handlers for the current view.
    * @return The currently relevant instance of the EdgeGesture object.
    */
  def getForCurrentView(): EdgeGesture = js.native
}

