package typings.twilioVideo

import typings.twilioVideo.remoteAudioTrackMod.RemoteAudioTrack
import typings.twilioVideo.remoteTrackPublicationMod.RemoteTrackPublication
import typings.twilioVideo.twilioVideoStrings.audio
import typings.twilioVideo.typesMod.AudioTrackPublication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteAudioTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/RemoteAudioTrackPublication", "RemoteAudioTrackPublication")
  @js.native
  open class RemoteAudioTrackPublication ()
    extends RemoteTrackPublication
       with AudioTrackPublication {
    
    @JSName("kind")
    var kind_RemoteAudioTrackPublication: audio = js.native
    
    @JSName("track")
    var track_RemoteAudioTrackPublication: RemoteAudioTrack | Null = js.native
  }
}
