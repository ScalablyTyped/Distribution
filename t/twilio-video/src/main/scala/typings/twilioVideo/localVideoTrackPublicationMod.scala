package typings.twilioVideo

import typings.twilioVideo.localTrackPublicationMod.LocalTrackPublication
import typings.twilioVideo.localVideoTrackMod.LocalVideoTrack
import typings.twilioVideo.twilioVideoStrings.video
import typings.twilioVideo.typesMod.VideoTrackPublication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localVideoTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/LocalVideoTrackPublication", "LocalVideoTrackPublication")
  @js.native
  open class LocalVideoTrackPublication ()
    extends LocalTrackPublication
       with VideoTrackPublication {
    
    @JSName("kind")
    var kind_LocalVideoTrackPublication: video = js.native
    
    @JSName("track")
    var track_LocalVideoTrackPublication: LocalVideoTrack = js.native
  }
}
