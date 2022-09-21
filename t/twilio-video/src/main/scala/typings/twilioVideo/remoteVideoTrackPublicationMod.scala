package typings.twilioVideo

import typings.twilioVideo.remoteTrackPublicationMod.RemoteTrackPublication
import typings.twilioVideo.remoteVideoTrackMod.RemoteVideoTrack
import typings.twilioVideo.twilioVideoStrings.video
import typings.twilioVideo.typesMod.VideoTrackPublication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteVideoTrackPublicationMod {
  
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
