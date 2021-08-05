package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for the SampleRequested event. */
trait MediaStreamSourceSampleRequestedEventArgs extends StObject {
  
  /** Gets the object that represents the request for a MediaStreamSample . */
  var request: MediaStreamSourceSampleRequest
}
object MediaStreamSourceSampleRequestedEventArgs {
  
  inline def apply(request: MediaStreamSourceSampleRequest): MediaStreamSourceSampleRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSampleRequestedEventArgs]
  }
  
  extension [Self <: MediaStreamSourceSampleRequestedEventArgs](x: Self) {
    
    inline def setRequest(value: MediaStreamSourceSampleRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
