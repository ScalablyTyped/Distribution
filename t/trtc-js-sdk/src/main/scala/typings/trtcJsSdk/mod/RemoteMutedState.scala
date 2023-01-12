package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteMutedState extends StObject {
  
  /** 是否静音 */
  var audioMuted: Boolean
  
  /** 是否有视频 */
  var hasAudio: Boolean
  
  /** 是否有音频 */
  var hasVideo: Boolean
  
  /** 远端用户ID */
  var userId: String
  
  /** 是否关闭摄像头 */
  var videoMuted: Boolean
}
object RemoteMutedState {
  
  inline def apply(audioMuted: Boolean, hasAudio: Boolean, hasVideo: Boolean, userId: String, videoMuted: Boolean): RemoteMutedState = {
    val __obj = js.Dynamic.literal(audioMuted = audioMuted.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], hasVideo = hasVideo.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], videoMuted = videoMuted.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteMutedState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteMutedState] (val x: Self) extends AnyVal {
    
    inline def setAudioMuted(value: Boolean): Self = StObject.set(x, "audioMuted", value.asInstanceOf[js.Any])
    
    inline def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    inline def setHasVideo(value: Boolean): Self = StObject.set(x, "hasVideo", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setVideoMuted(value: Boolean): Self = StObject.set(x, "videoMuted", value.asInstanceOf[js.Any])
  }
}
