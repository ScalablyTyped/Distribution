package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamConstraints extends StObject {
  
  var audio: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
  
  var video: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
}
object MediaStreamConstraints {
  
  @scala.inline
  def apply(): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamConstraints]
  }
  
  @scala.inline
  implicit class MediaStreamConstraintsMutableBuilder[Self <: MediaStreamConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Boolean | MediaTrackConstraints): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean | MediaTrackConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
