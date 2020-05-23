package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayToConnectionStateChangedEventArgs extends IPlayToConnectionStateChangedEventArgs

object PlayToConnectionStateChangedEventArgs {
  @scala.inline
  def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): PlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionStateChangedEventArgs]
  }
}

