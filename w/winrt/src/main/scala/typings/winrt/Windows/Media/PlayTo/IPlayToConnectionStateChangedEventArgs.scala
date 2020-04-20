package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToConnectionStateChangedEventArgs extends js.Object {
  var currentState: PlayToConnectionState
  var previousState: PlayToConnectionState
}

object IPlayToConnectionStateChangedEventArgs {
  @scala.inline
  def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): IPlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnectionStateChangedEventArgs]
  }
}

