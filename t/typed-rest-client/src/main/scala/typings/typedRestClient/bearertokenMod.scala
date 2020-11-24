package typings.typedRestClient

import typings.typedRestClient.interfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-rest-client/handlers/bearertoken", JSImport.Namespace)
@js.native
object bearertokenMod extends js.Object {
  
  @js.native
  class BearerCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    def this(token: String, allowCrossOriginAuthentication: Boolean) = this()
    
    var allowCrossOriginAuthentication: Boolean = js.native
    
    var origin: String = js.native
    
    def prepareRequest(options: js.Any): Unit = js.native
    
    var token: String = js.native
  }
}
