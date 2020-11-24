package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSourceStateChangedEventArgs extends js.Object {
  
  /** Gets the new current state of the MediaSource . */
  var newState: MediaSourceState = js.native
  
  /** Gets the previous state of the MediaSource before the state changed. */
  var oldState: MediaSourceState = js.native
}
object MediaSourceStateChangedEventArgs {
  
  @scala.inline
  def apply(newState: MediaSourceState, oldState: MediaSourceState): MediaSourceStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class MediaSourceStateChangedEventArgsOps[Self <: MediaSourceStateChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setNewState(value: MediaSourceState): Self = this.set("newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: MediaSourceState): Self = this.set("oldState", value.asInstanceOf[js.Any])
  }
}
