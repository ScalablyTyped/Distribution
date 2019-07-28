package typings.winrt.WindowsNs.MediaNs.PlayToNs

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
    val __obj = js.Dynamic.literal(currentState = currentState, previousState = previousState)
  
    __obj.asInstanceOf[IPlayToConnectionStateChangedEventArgs]
  }
}

