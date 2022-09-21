package typings.twilioVideo

import typings.twilioVideo.remoteDataTrackMod.RemoteDataTrack
import typings.twilioVideo.remoteTrackPublicationMod.RemoteTrackPublication
import typings.twilioVideo.twilioVideoStrings.data
import typings.twilioVideo.typesMod.DataTrackPublication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteDataTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/RemoteDataTrackPublication", "RemoteDataTrackPublication")
  @js.native
  open class RemoteDataTrackPublication ()
    extends RemoteTrackPublication
       with DataTrackPublication {
    
    @JSName("kind")
    var kind_RemoteDataTrackPublication: data = js.native
    
    @JSName("track")
    var track_RemoteDataTrackPublication: RemoteDataTrack | Null = js.native
  }
}
