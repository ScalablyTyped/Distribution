package typings.twilio

import typings.twilio.frontlineApiV1UserMod.UserContext
import typings.twilio.frontlineApiV1UserMod.UserListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frontlineApiMod {
  
  @JSImport("twilio/lib/rest/FrontlineApi", JSImport.Namespace)
  @js.native
  open class ^ protected () extends FrontlineApi {
    /**
      * Initialize frontline_api domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait FrontlineApi
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def users(sid: String): UserContext = js.native
    @JSName("users")
    val users_Original: UserListInstance = js.native
    
    val v1: typings.twilio.frontlineApiV1Mod.^ = js.native
  }
}
