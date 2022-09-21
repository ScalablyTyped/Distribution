package typings.twilio

import typings.twilio.mediaProcessorMod.MediaProcessorContext
import typings.twilio.mediaProcessorMod.MediaProcessorListInstance
import typings.twilio.mediaRecordingMod.MediaRecordingContext
import typings.twilio.mediaRecordingMod.MediaRecordingListInstance
import typings.twilio.playerStreamerMod.PlayerStreamerContext
import typings.twilio.playerStreamerMod.PlayerStreamerListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restMediaMod {
  
  @JSImport("twilio/lib/rest/Media", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Media {
    /**
      * Initialize media domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Media
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def mediaProcessor(sid: String): MediaProcessorContext = js.native
    @JSName("mediaProcessor")
    val mediaProcessor_Original: MediaProcessorListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def mediaRecording(sid: String): MediaRecordingContext = js.native
    @JSName("mediaRecording")
    val mediaRecording_Original: MediaRecordingListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def playerStreamer(sid: String): PlayerStreamerContext = js.native
    @JSName("playerStreamer")
    val playerStreamer_Original: PlayerStreamerListInstance = js.native
    
    val v1: typings.twilio.mediaV1Mod.^ = js.native
  }
}
