package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video track. */
trait VideoTrack extends StObject {
  
  /** Gets or sets the identifier for the video track. */
  var id: String
  
  /** Gets or sets the label for the video track. */
  var label: String
  
  /** Gets or sets a string indicating the language of the video track. */
  var language: String
  
  /** Gets a value indicating the type of data the track contains. For VideoTrack objects, this value is always MediaTrackKind::Video . */
  var trackKind: MediaTrackKind
}
object VideoTrack {
  
  inline def apply(id: String, label: String, language: String, trackKind: MediaTrackKind): VideoTrack = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], trackKind = trackKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTrack]
  }
  
  extension [Self <: VideoTrack](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setTrackKind(value: MediaTrackKind): Self = StObject.set(x, "trackKind", value.asInstanceOf[js.Any])
  }
}
