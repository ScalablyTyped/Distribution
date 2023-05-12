package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestOauthMod {
  
  @JSImport("twilio/lib/rest/Oauth", JSImport.Namespace)
  @js.native
  open class ^ () extends Oauth
  
  @js.native
  trait Oauth
    extends typings.twilio.libRestOauthBaseMod.^ {
    
    /**
      * @deprecated - Use v1.deviceCode instead
      */
    def deviceCode: Any = js.native
    
    /**
      * @deprecated - Use v1.oauth instead
      */
    def oauth: Any = js.native
    
    /**
      * @deprecated - Use v1.openidDiscovery instead
      */
    def openidDiscovery: Any = js.native
    
    /**
      * @deprecated - Use v1.token instead
      */
    def token: Any = js.native
    
    /**
      * @deprecated - Use v1.userInfo instead
      */
    def userInfo: Any = js.native
  }
}
