package typings.typedRestClient

import typings.typedRestClient.interfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ntlmMod {
  
  @JSImport("typed-rest-client/handlers/ntlm", "NtlmCredentialHandler")
  @js.native
  class NtlmCredentialHandler protected () extends IRequestHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: js.UndefOr[scala.Nothing], domain: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
    
    var _ntlmOptions: js.Any = js.native
    
    var handleAuthenticationPrivate: js.Any = js.native
    
    var sendType1Message: js.Any = js.native
    
    var sendType3Message: js.Any = js.native
  }
}
