package typings.typedRestClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersMod {
  
  @JSImport("typed-rest-client/Handlers", "BasicCredentialHandler")
  @js.native
  open class BasicCredentialHandler protected ()
    extends typings.typedRestClient.handlersBasiccredsMod.BasicCredentialHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, allowCrossOriginAuthentication: Boolean) = this()
  }
  
  @JSImport("typed-rest-client/Handlers", "BearerCredentialHandler")
  @js.native
  open class BearerCredentialHandler protected ()
    extends typings.typedRestClient.handlersBearertokenMod.BearerCredentialHandler {
    def this(token: String) = this()
    def this(token: String, allowCrossOriginAuthentication: Boolean) = this()
  }
  
  @JSImport("typed-rest-client/Handlers", "NtlmCredentialHandler")
  @js.native
  open class NtlmCredentialHandler protected ()
    extends typings.typedRestClient.handlersNtlmMod.NtlmCredentialHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
    def this(username: String, password: String, workstation: Unit, domain: String) = this()
  }
  
  @JSImport("typed-rest-client/Handlers", "PersonalAccessTokenCredentialHandler")
  @js.native
  open class PersonalAccessTokenCredentialHandler protected ()
    extends typings.typedRestClient.handlersPersonalaccesstokenMod.PersonalAccessTokenCredentialHandler {
    def this(token: String) = this()
    def this(token: String, allowCrossOriginAuthentication: Boolean) = this()
  }
}
