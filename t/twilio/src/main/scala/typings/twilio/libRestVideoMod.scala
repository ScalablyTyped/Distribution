package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVideoMod {
  
  @JSImport("twilio/lib/rest/Video", JSImport.Namespace)
  @js.native
  open class ^ () extends Video
  
  @js.native
  trait Video
    extends typings.twilio.libRestVideoBaseMod.^ {
    
    /**
      * @deprecated - Use v1.compositionHooks instead
      */
    def compositionHooks: Any = js.native
    
    /**
      * @deprecated - Use v1.compositionSettings instead
      */
    def compositionSettings: Any = js.native
    
    /**
      * @deprecated - Use v1.compositions instead
      */
    def compositions: Any = js.native
    
    /**
      * @deprecated - Use v1.recordingSettings instead
      */
    def recordingSettings: Any = js.native
    
    /**
      * @deprecated - Use v1.recordings instead
      */
    def recordings: Any = js.native
    
    /**
      * @deprecated - Use v1.rooms instead
      */
    def rooms: Any = js.native
  }
}
