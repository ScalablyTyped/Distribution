package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVideoV1Mod {
  
  @JSImport("twilio/lib/rest/video/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Video
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestVideoMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val compositionHooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompositionHookListInstance */ Any = js.native
    
    val compositionSettings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompositionSettingsListInstance */ Any = js.native
    
    val compositions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompositionListInstance */ Any = js.native
    
    val recordingSettings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RecordingSettingsListInstance */ Any = js.native
    
    val recordings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RecordingListInstance */ Any = js.native
    
    val rooms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RoomListInstance */ Any = js.native
  }
}
