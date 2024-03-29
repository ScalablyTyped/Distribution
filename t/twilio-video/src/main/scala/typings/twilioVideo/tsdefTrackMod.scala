package typings.twilioVideo

import typings.events.mod.EventEmitter
import typings.twilioVideo.tsdefTrackMod.Track.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefTrackMod {
  
  @JSImport("twilio-video/tsdef/Track", "Track")
  @js.native
  open class Track () extends EventEmitter {
    
    var kind: Kind = js.native
    
    var name: String = js.native
  }
  object Track {
    
    type ID = String
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioVideo.twilioVideoStrings.audio
      - typings.twilioVideo.twilioVideoStrings.video
      - typings.twilioVideo.twilioVideoStrings.data
    */
    trait Kind extends StObject
    object Kind {
      
      inline def audio: typings.twilioVideo.twilioVideoStrings.audio = "audio".asInstanceOf[typings.twilioVideo.twilioVideoStrings.audio]
      
      inline def data: typings.twilioVideo.twilioVideoStrings.data = "data".asInstanceOf[typings.twilioVideo.twilioVideoStrings.data]
      
      inline def video: typings.twilioVideo.twilioVideoStrings.video = "video".asInstanceOf[typings.twilioVideo.twilioVideoStrings.video]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioVideo.twilioVideoStrings.low
      - typings.twilioVideo.twilioVideoStrings.standard
      - typings.twilioVideo.twilioVideoStrings.high
    */
    trait Priority extends StObject
    object Priority {
      
      inline def high: typings.twilioVideo.twilioVideoStrings.high = "high".asInstanceOf[typings.twilioVideo.twilioVideoStrings.high]
      
      inline def low: typings.twilioVideo.twilioVideoStrings.low = "low".asInstanceOf[typings.twilioVideo.twilioVideoStrings.low]
      
      inline def standard: typings.twilioVideo.twilioVideoStrings.standard = "standard".asInstanceOf[typings.twilioVideo.twilioVideoStrings.standard]
    }
    
    type SID = String
  }
}
