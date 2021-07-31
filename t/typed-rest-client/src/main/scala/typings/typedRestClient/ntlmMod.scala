package typings.typedRestClient

import typings.node.httpMod.RequestOptions
import typings.typedRestClient.interfacesMod.IHttpClient
import typings.typedRestClient.interfacesMod.IHttpClientResponse
import typings.typedRestClient.interfacesMod.IRequestHandler
import typings.typedRestClient.interfacesMod.IRequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ntlmMod {
  
  @JSImport("typed-rest-client/handlers/ntlm", "NtlmCredentialHandler")
  @js.native
  class NtlmCredentialHandler protected ()
    extends StObject
       with IRequestHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
    def this(username: String, password: String, workstation: Unit, domain: String) = this()
    
    var _ntlmOptions: js.Any = js.native
    
    /* CompleteClass */
    override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    
    /* CompleteClass */
    override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
    
    var handleAuthenticationPrivate: js.Any = js.native
    
    /* CompleteClass */
    override def prepareRequest(options: RequestOptions): Unit = js.native
    
    var sendType1Message: js.Any = js.native
    
    var sendType3Message: js.Any = js.native
  }
}
