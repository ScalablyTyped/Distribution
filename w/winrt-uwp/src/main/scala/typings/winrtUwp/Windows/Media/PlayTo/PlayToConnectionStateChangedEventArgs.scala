package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the StateChanged event. */
@js.native
trait PlayToConnectionStateChangedEventArgs extends js.Object {
  
  /** Gets the current state after the Play To connection state has changed. */
  var currentState: PlayToConnectionState = js.native
  
  /** Gets the previous state before the Play To connection state was changed. */
  var previousState: PlayToConnectionState = js.native
}
object PlayToConnectionStateChangedEventArgs {
  
  @scala.inline
  def apply(currentState: PlayToConnectionState, previousState: PlayToConnectionState): PlayToConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class PlayToConnectionStateChangedEventArgsOps[Self <: PlayToConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
    
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
