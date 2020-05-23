package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the StateChanged event. */
trait PlayToConnectionStateChangedEventArgs extends js.Object {
  /** Gets the current state after the Play To connection state has changed. */
  var currentState: PlayToConnectionState
  /** Gets the previous state before the Play To connection state was changed. */
  var previousState: PlayToConnectionState
}

object PlayToConnectionStateChangedEventArgs {
  @scala.inline
  def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): PlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionStateChangedEventArgs]
  }
}

