package typings.twilioVideo

import typings.twilioVideo.tsdefLocalDataTrackMod.LocalDataTrack
import typings.twilioVideo.tsdefLocalTrackPublicationMod.LocalTrackPublication
import typings.twilioVideo.tsdefTypesMod.DataTrackPublication
import typings.twilioVideo.twilioVideoStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalDataTrackPublicationMod {
  
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
