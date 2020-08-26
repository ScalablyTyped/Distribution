package typings.typedRestClient

import typings.typedRestClient.interfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/bearertoken", JSImport.Namespace)
@js.native
object bearertokenMod extends js.Object {
  @js.native
  class BearerCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    var token: String = js.native
    def prepareRequest(options: js.Any): Unit = js.native
  }
  
}

