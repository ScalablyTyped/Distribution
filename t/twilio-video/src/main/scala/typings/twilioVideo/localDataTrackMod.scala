package typings.twilioVideo

import typings.std.Blob
import typings.twilioVideo.localDataTrackOptionsMod.LocalDataTrackOptions
import typings.twilioVideo.trackMod.Track
import typings.twilioVideo.trackMod.Track.ID
import typings.twilioVideo.twilioVideoStrings.data
import typings.twilioVideo.typesMod.DataTrack
import typings.twilioVideo.typesMod.LocalTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localDataTrackMod {
  
  @JSImport("twilio-video/tsdef/LocalDataTrack", "LocalDataTrack")
  @js.native
  open class LocalDataTrack ()
    extends Track
       with DataTrack
       with LocalTrack {
    def this(options: LocalDataTrackOptions) = this()
    
    var id: ID = js.native
    
    @JSName("kind")
    var kind_LocalDataTrack: data = js.native
    
    var maxPacketLifeTime: Double | Null = js.native
    
    var maxRetransmits: Double | Null = js.native
    
    var ordered: Boolean = js.native
    
    var reliable: Boolean = js.native
    
    def send(data: String): Unit = js.native
    def send(data: js.typedarray.ArrayBuffer): Unit = js.native
    def send(data: js.typedarray.ArrayBufferView): Unit = js.native
    def send(data: Blob): Unit = js.native
  }
}
