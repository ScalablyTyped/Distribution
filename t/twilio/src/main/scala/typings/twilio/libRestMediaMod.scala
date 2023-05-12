package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMediaMod {
  
  @JSImport("twilio/lib/rest/Media", JSImport.Namespace)
  @js.native
  open class ^ () extends Media
  
  @js.native
  trait Media
    extends typings.twilio.libRestMediaBaseMod.^ {
    
    /**
      * @deprecated - Use v1.mediaProcessor instead
      */
    def mediaProcessor: Any = js.native
    
    /**
      * @deprecated - Use v1.mediaRecording instead
      */
    def mediaRecording: Any = js.native
    
    /**
      * @deprecated - Use v1.playerStreamer instead
      */
    def playerStreamer: Any = js.native
  }
}
