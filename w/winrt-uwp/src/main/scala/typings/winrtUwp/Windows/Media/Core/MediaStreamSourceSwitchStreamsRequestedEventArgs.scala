package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaStreamSource.SwitchStreamsRequested event. */
@js.native
trait MediaStreamSourceSwitchStreamsRequestedEventArgs extends js.Object {
  
  /** Gets the object that represents the request to switch the streams. */
  var request: MediaStreamSourceSwitchStreamsRequest = js.native
}
object MediaStreamSourceSwitchStreamsRequestedEventArgs {
  
  @scala.inline
  def apply(request: MediaStreamSourceSwitchStreamsRequest): MediaStreamSourceSwitchStreamsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequestedEventArgs]
  }
  
  @scala.inline
  implicit class MediaStreamSourceSwitchStreamsRequestedEventArgsOps[Self <: MediaStreamSourceSwitchStreamsRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: MediaStreamSourceSwitchStreamsRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
