package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToConnectionStateChangedEventArgs extends js.Object {
  var currentState: PlayToConnectionState = js.native
  var previousState: PlayToConnectionState = js.native
}

object IPlayToConnectionStateChangedEventArgs {
  @scala.inline
  def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): IPlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnectionStateChangedEventArgs]
  }
  @scala.inline
  implicit class IPlayToConnectionStateChangedEventArgsOps[Self <: IPlayToConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentState(value: PlayToConnectionState): Self = this.set("currentState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousState(value: PlayToConnectionState): Self = this.set("previousState", value.asInstanceOf[js.Any])
  }
  
}

