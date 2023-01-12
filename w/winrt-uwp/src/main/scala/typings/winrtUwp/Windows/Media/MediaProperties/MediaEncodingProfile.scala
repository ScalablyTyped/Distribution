package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the encoding profile for an audio or video file. The encoding profile includes descriptions of the audio and video encoding formats, and a description of the media container. */
trait MediaEncodingProfile extends StObject {
  
  /** Gets or sets the encoding properties for the audio stream. */
  var audio: AudioEncodingProperties
  
  /** Gets or sets the properties of the media container. */
  var container: ContainerEncodingProperties
  
  /** Gets or sets the encoding properties for the video stream. */
  var video: VideoEncodingProperties
}
object MediaEncodingProfile {
  
  inline def apply(
    audio: AudioEncodingProperties,
    container: ContainerEncodingProperties,
    video: VideoEncodingProperties
  ): MediaEncodingProfile = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEncodingProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaEncodingProfile] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: AudioEncodingProperties): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: ContainerEncodingProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: VideoEncodingProperties): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
