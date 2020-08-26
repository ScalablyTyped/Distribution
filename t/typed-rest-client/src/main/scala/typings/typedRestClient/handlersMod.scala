package typings.typedRestClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/Handlers", JSImport.Namespace)
@js.native
object handlersMod extends js.Object {
  @js.native
  class BasicCredentialHandler protected ()
    extends typings.typedRestClient.mod.BasicCredentialHandler {
    def this(username: String, password: String) = this()
  }
  
  @js.native
  class BearerCredentialHandler protected ()
    extends typings.typedRestClient.bearertokenMod.BearerCredentialHandler {
    def this(token: String) = this()
  }
  
  @js.native
  class NtlmCredentialHandler protected ()
    extends typings.typedRestClient.ntlmMod.NtlmCredentialHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: js.UndefOr[scala.Nothing], domain: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
  }
  
  @js.native
  class PersonalAccessTokenCredentialHandler protected ()
    extends typings.typedRestClient.personalaccesstokenMod.PersonalAccessTokenCredentialHandler {
    def this(token: String) = this()
  }
  
}

