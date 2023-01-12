package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedTextSource::Resolved event. */
trait TimedTextSourceResolveResultEventArgs extends StObject {
  
  /** Gets an object representing the asynchronous error that occurred when the TimedTextSource was resolved. */
  var error: TimedMetadataTrackError
  
  /** Gets the list of TimedMetadataTrack objects resulting from resolving the TimedTextSource . */
  var tracks: IVectorView[TimedMetadataTrack]
}
object TimedTextSourceResolveResultEventArgs {
  
  inline def apply(error: TimedMetadataTrackError, tracks: IVectorView[TimedMetadataTrack]): TimedTextSourceResolveResultEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSourceResolveResultEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimedTextSourceResolveResultEventArgs] (val x: Self) extends AnyVal {
    
    inline def setError(value: TimedMetadataTrackError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: IVectorView[TimedMetadataTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
