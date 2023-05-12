package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVoiceMod {
  
  @JSImport("twilio/lib/rest/Voice", JSImport.Namespace)
  @js.native
  open class ^ () extends Voice
  
  @js.native
  trait Voice
    extends typings.twilio.libRestVoiceBaseMod.^ {
    
    /**
      * @deprecated - Use v1.archivedCalls instead
      */
    def archivedCalls: Any = js.native
    
    /**
      * @deprecated - Use v1.byocTrunks instead
      */
    def byocTrunks: Any = js.native
    
    /**
      * @deprecated - Use v1.connectionPolicies instead
      */
    def connectionPolicies: Any = js.native
    
    /**
      * @deprecated - Use v1.dialingPermissions instead
      */
    def dialingPermissions: Any = js.native
    
    /**
      * @deprecated - Use v1.ipRecords instead
      */
    def ipRecords: Any = js.native
    
    /**
      * @deprecated - Use v1.sourceIpMappings instead
      */
    def sourceIpMappings: Any = js.native
  }
}
