package typings.twilioVideo

import typings.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack
import typings.twilioVideo.tsdefLocalTrackPublicationMod.LocalTrackPublication
import typings.twilioVideo.tsdefTypesMod.AudioTrackPublication
import typings.twilioVideo.twilioVideoStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalAudioTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/LocalAudioTrackPublication", "LocalAudioTrackPublication")
  @js.native
  open class LocalAudioTrackPublication ()
    extends LocalTrackPublication
       with AudioTrackPublication {
    
    @JSName("kind")
    var kind_LocalAudioTrackPublication: audio = js.native
    
    @JSName("track")
    var track_LocalAudioTrackPublication: LocalAudioTrack = js.native
  }
}
