package typings.typedRestClient

import typings.typedRestClient.interfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/personalaccesstoken", JSImport.Namespace)
@js.native
object personalaccesstokenMod extends js.Object {
  @js.native
  class PersonalAccessTokenCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    var token: String = js.native
    def prepareRequest(options: js.Any): Unit = js.native
  }
  
}

