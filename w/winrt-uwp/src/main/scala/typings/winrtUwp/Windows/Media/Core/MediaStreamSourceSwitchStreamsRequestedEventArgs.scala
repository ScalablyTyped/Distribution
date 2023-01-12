package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaStreamSource.SwitchStreamsRequested event. */
trait MediaStreamSourceSwitchStreamsRequestedEventArgs extends StObject {
  
  /** Gets the object that represents the request to switch the streams. */
  var request: MediaStreamSourceSwitchStreamsRequest
}
object MediaStreamSourceSwitchStreamsRequestedEventArgs {
  
  inline def apply(request: MediaStreamSourceSwitchStreamsRequest): MediaStreamSourceSwitchStreamsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequestedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaStreamSourceSwitchStreamsRequestedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: MediaStreamSourceSwitchStreamsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
