package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaStreamSource.Starting event. */
@js.native
trait MediaStreamSourceStartingEventArgs extends StObject {
  
  /** Gets the object that represents the request to start accumulating MediaStreamSample data. */
  var request: MediaStreamSourceStartingRequest = js.native
}
object MediaStreamSourceStartingEventArgs {
  
  @scala.inline
  def apply(request: MediaStreamSourceStartingRequest): MediaStreamSourceStartingEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceStartingEventArgs]
  }
  
  @scala.inline
  implicit class MediaStreamSourceStartingEventArgsMutableBuilder[Self <: MediaStreamSourceStartingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: MediaStreamSourceStartingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
