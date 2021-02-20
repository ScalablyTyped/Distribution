package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio track. */
@js.native
trait AudioTrack extends StObject {
  
  /** Gets or sets the identifier for the audio track. */
  var id: String = js.native
  
  /** Gets or sets the label for the audio track. */
  var label: String = js.native
  
  /** Gets or sets a string indicating the language of the audio track. */
  var language: String = js.native
  
  /** Gets a value indicating the type of data the track contains. For AudioTrack objects, this value is always MediaTrackKind::Audio . */
  var trackKind: MediaTrackKind = js.native
}
object AudioTrack {
  
  @scala.inline
  def apply(id: String, label: String, language: String, trackKind: MediaTrackKind): AudioTrack = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], trackKind = trackKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
  
  @scala.inline
  implicit class AudioTrackMutableBuilder[Self <: AudioTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackKind(value: MediaTrackKind): Self = StObject.set(x, "trackKind", value.asInstanceOf[js.Any])
  }
}
