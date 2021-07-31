package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.SwitchStreamsRequest event to provide information to the application. */
trait MediaStreamSourceSwitchStreamsRequest extends StObject {
  
  /**
    * Defers completing the MediaStreamSource.SwitchStreamsRequested event.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceSwitchStreamsRequestDeferral
  
  /** Gets the stream descriptor for the stream that is now selected by the MediaStreamSource . */
  var newStreamDescriptor: IMediaStreamDescriptor
  
  /** Gets the stream descriptor for the stream which is no longer selected by the MediaStreamSource . */
  var oldStreamDescriptor: IMediaStreamDescriptor
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
  implicit class MediaStreamSourceSwitchStreamsRequestMutableBuilder[Self <: MediaStreamSourceSwitchStreamsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => MediaStreamSourceSwitchStreamsRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStreamDescriptor(value: IMediaStreamDescriptor): Self = StObject.set(x, "newStreamDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldStreamDescriptor(value: IMediaStreamDescriptor): Self = StObject.set(x, "oldStreamDescriptor", value.asInstanceOf[js.Any])
  }
}
