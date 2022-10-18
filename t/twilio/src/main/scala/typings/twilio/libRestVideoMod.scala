package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVideoMod {
  
  @JSImport("twilio/lib/rest/Video", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Video {
    /**
      * Initialize video domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Video
    extends typings.twilio.libBaseDomainMod.^ {
    
    val compositionHooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompositionHookListInstance */ Any = js.native
    
    val compositionSettings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompositionSettingsListInstance */ Any = js.native
    
    val compositions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompositionListInstance */ Any = js.native
    
    val recordingSettings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RecordingSettingsListInstance */ Any = js.native
    
    val recordings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RecordingListInstance */ Any = js.native
    
    val rooms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RoomListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestVideoV1Mod.^ = js.native
  }
}
