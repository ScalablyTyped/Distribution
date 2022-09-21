package typings.twilio

import typings.twilio.frontlineApiV1UserMod.UserContext
import typings.twilio.frontlineApiV1UserMod.UserListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frontlineApiV1Mod {
  
  @JSImport("twilio/lib/rest/frontlineApi/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of FrontlineApi
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.frontlineApiMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def users(sid: String): UserContext = js.native
    @JSName("users")
    val users_Original: UserListInstance = js.native
  }
}
