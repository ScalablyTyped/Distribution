package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentState")(currentState)
    __obj.updateDynamic("previousState")(previousState)
    __obj.asInstanceOf[IPlayToConnectionStateChangedEventArgs]
  }
}

