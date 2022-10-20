package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestOauthV1Mod {
  
  @JSImport("twilio/lib/rest/oauth/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Oauth
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestOauthMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val oauth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OauthListInstance */ Any = js.native
    
    val openidDiscovery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpenidDiscoveryListInstance */ Any = js.native
    
    val token: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenListInstance */ Any = js.native
    
    val userInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserInfoListInstance */ Any = js.native
  }
}
