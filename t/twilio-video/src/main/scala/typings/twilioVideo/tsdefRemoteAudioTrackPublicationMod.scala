package typings.twilioVideo

import typings.twilioVideo.tsdefRemoteAudioTrackMod.RemoteAudioTrack
import typings.twilioVideo.tsdefRemoteTrackPublicationMod.RemoteTrackPublication
import typings.twilioVideo.tsdefTypesMod.AudioTrackPublication
import typings.twilioVideo.twilioVideoStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteAudioTrackPublicationMod {
  
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
