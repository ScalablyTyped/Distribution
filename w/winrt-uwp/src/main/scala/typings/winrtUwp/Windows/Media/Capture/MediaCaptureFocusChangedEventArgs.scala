package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the FocusChanged event. */
@js.native
trait MediaCaptureFocusChangedEventArgs extends js.Object {
  
  /** Gets the current focus state of the capture device. */
  var focusState: MediaCaptureFocusState = js.native
}
object MediaCaptureFocusChangedEventArgs {
  
  @scala.inline
  def apply(focusState: MediaCaptureFocusState): MediaCaptureFocusChangedEventArgs = {
    val __obj = js.Dynamic.literal(focusState = focusState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureFocusChangedEventArgs]
  }
  
  @scala.inline
  implicit class MediaCaptureFocusChangedEventArgsOps[Self <: MediaCaptureFocusChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setFocusState(value: MediaCaptureFocusState): Self = this.set("focusState", value.asInstanceOf[js.Any])
  }
}
