package typings.twilio

import typings.twilio.libRestFrontlineApiBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestFrontlineApiV1Mod {
  
  @JSImport("twilio/lib/rest/frontlineApi/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of FrontlineApi
      *
      * @param domain - The Twilio (Twilio.FrontlineApi) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** users - { Twilio.FrontlineApi.V1.UserListInstance } resource */
    /* protected */ var _users: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserListInstance */ Any
      ] = js.native
    
    /** Getter for users resource */
    def users: Any = js.native
  }
}
