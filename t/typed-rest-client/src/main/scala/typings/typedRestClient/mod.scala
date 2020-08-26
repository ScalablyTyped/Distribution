package typings.typedRestClient

import typings.typedRestClient.interfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/basiccreds", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BasicCredentialHandler protected () extends IRequestHandler {
    def this(username: String, password: String) = this()
    var password: String = js.native
    var username: String = js.native
    def prepareRequest(options: js.Any): Unit = js.native
  }
  
}

