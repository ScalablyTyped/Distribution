package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMediaV1Mod {
  
  @JSImport("twilio/lib/rest/media/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Media
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestMediaMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val mediaProcessor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MediaProcessorListInstance */ Any = js.native
    
    val mediaRecording: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MediaRecordingListInstance */ Any = js.native
    
    val playerStreamer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlayerStreamerListInstance */ Any = js.native
  }
}
