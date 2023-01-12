package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedMetadataTrack::TrackFailed event. */
trait TimedMetadataTrackFailedEventArgs extends StObject {
  
  /** Gets an object representing the error that occurred with the timed metadata track. */
  var error: TimedMetadataTrackError
}
object TimedMetadataTrackFailedEventArgs {
  
  inline def apply(error: TimedMetadataTrackError): TimedMetadataTrackFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataTrackFailedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimedMetadataTrackFailedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setError(value: TimedMetadataTrackError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
