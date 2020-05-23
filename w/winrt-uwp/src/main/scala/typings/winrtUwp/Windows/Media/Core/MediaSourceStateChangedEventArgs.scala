package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSourceStateChangedEventArgs extends js.Object {
  /** Gets the new current state of the MediaSource . */
  var newState: MediaSourceState
  /** Gets the previous state of the MediaSource before the state changed. */
  var oldState: MediaSourceState
}

object MediaSourceStateChangedEventArgs {
  @scala.inline
  def apply(newState: MediaSourceState, oldState: MediaSourceState): MediaSourceStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceStateChangedEventArgs]
  }
}

