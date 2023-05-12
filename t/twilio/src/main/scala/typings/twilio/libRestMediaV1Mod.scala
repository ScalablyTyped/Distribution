package typings.twilio

import typings.twilio.libRestMediaBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMediaV1Mod {
  
  @JSImport("twilio/lib/rest/media/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Media
      *
      * @param domain - The Twilio (Twilio.Media) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** mediaProcessor - { Twilio.Media.V1.MediaProcessorListInstance } resource */
    /* protected */ var _mediaProcessor: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MediaProcessorListInstance */ Any
      ] = js.native
    
    /** mediaRecording - { Twilio.Media.V1.MediaRecordingListInstance } resource */
    /* protected */ var _mediaRecording: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MediaRecordingListInstance */ Any
      ] = js.native
    
    /** playerStreamer - { Twilio.Media.V1.PlayerStreamerListInstance } resource */
    /* protected */ var _playerStreamer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlayerStreamerListInstance */ Any
      ] = js.native
    
    /** Getter for mediaProcessor resource */
    def mediaProcessor: Any = js.native
    
    /** Getter for mediaRecording resource */
    def mediaRecording: Any = js.native
    
    /** Getter for playerStreamer resource */
    def playerStreamer: Any = js.native
  }
}
