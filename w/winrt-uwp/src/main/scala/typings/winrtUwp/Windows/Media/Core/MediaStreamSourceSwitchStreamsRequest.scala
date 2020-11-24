package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.SwitchStreamsRequest event to provide information to the application. */
@js.native
trait MediaStreamSourceSwitchStreamsRequest extends js.Object {
  
  /**
    * Defers completing the MediaStreamSource.SwitchStreamsRequested event.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceSwitchStreamsRequestDeferral = js.native
  
  /** Gets the stream descriptor for the stream that is now selected by the MediaStreamSource . */
  var newStreamDescriptor: IMediaStreamDescriptor = js.native
  
  /** Gets the stream descriptor for the stream which is no longer selected by the MediaStreamSource . */
  var oldStreamDescriptor: IMediaStreamDescriptor = js.native
}
object MediaStreamSourceSwitchStreamsRequest {
  
  @scala.inline
  def apply(
    getDeferral: () => MediaStreamSourceSwitchStreamsRequestDeferral,
    newStreamDescriptor: IMediaStreamDescriptor,
    oldStreamDescriptor: IMediaStreamDescriptor
  ): MediaStreamSourceSwitchStreamsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), newStreamDescriptor = newStreamDescriptor.asInstanceOf[js.Any], oldStreamDescriptor = oldStreamDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequest]
  }
  
  @scala.inline
  implicit class MediaStreamSourceSwitchStreamsRequestOps[Self <: MediaStreamSourceSwitchStreamsRequest] (val x: Self) extends AnyVal {
    
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
    def setGetDeferral(value: () => MediaStreamSourceSwitchStreamsRequestDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStreamDescriptor(value: IMediaStreamDescriptor): Self = this.set("newStreamDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldStreamDescriptor(value: IMediaStreamDescriptor): Self = this.set("oldStreamDescriptor", value.asInstanceOf[js.Any])
  }
}
