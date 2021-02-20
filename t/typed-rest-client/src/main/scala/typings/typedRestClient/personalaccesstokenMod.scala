package typings.typedRestClient

import typings.typedRestClient.interfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personalaccesstokenMod {
  
  @JSImport("typed-rest-client/handlers/personalaccesstoken", "PersonalAccessTokenCredentialHandler")
  @js.native
  class PersonalAccessTokenCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    def this(token: String, allowCrossOriginAuthentication: Boolean) = this()
    
    var allowCrossOriginAuthentication: Boolean = js.native
    
    var origin: String = js.native
    
    def prepareRequest(options: js.Any): Unit = js.native
    
    var token: String = js.native
  }
}
