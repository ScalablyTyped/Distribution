package typings.twilioVideo

import typings.twilioVideo.localDataTrackMod.LocalDataTrack
import typings.twilioVideo.localTrackPublicationMod.LocalTrackPublication
import typings.twilioVideo.twilioVideoStrings.data
import typings.twilioVideo.typesMod.DataTrackPublication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localDataTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/LocalDataTrackPublication", "LocalDataTrackPublication")
  @js.native
  open class LocalDataTrackPublication ()
    extends LocalTrackPublication
       with DataTrackPublication {
    
    @JSName("kind")
    var kind_LocalDataTrackPublication: data = js.native
    
    @JSName("track")
    var track_LocalDataTrackPublication: LocalDataTrack = js.native
  }
}
