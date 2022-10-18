package typings.twilioVideo

import typings.twilioVideo.tsdefRemoteTrackPublicationMod.RemoteTrackPublication
import typings.twilioVideo.tsdefRemoteVideoTrackMod.RemoteVideoTrack
import typings.twilioVideo.tsdefTypesMod.VideoTrackPublication
import typings.twilioVideo.twilioVideoStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteVideoTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/RemoteVideoTrackPublication", "RemoteVideoTrackPublication")
  @js.native
  open class RemoteVideoTrackPublication ()
    extends RemoteTrackPublication
       with VideoTrackPublication {
    
    @JSName("kind")
    var kind_RemoteVideoTrackPublication: video = js.native
    
    @JSName("track")
    var track_RemoteVideoTrackPublication: RemoteVideoTrack | Null = js.native
  }
}
