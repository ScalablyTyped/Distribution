package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestOauthMod {
  
  @JSImport("twilio/lib/rest/Oauth", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Oauth {
    /**
      * Initialize oauth domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Oauth
    extends typings.twilio.libBaseDomainMod.^ {
    
    val oauth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OauthListInstance */ Any = js.native
    
    val openidDiscovery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpenidDiscoveryListInstance */ Any = js.native
    
    val token: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenListInstance */ Any = js.native
    
    val userInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserInfoListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestOauthV1Mod.^ = js.native
  }
}
