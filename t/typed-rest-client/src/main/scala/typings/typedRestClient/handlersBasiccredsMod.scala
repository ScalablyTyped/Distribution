package typings.typedRestClient

import typings.node.httpMod.RequestOptions
import typings.typedRestClient.interfacesMod.IHttpClient
import typings.typedRestClient.interfacesMod.IHttpClientResponse
import typings.typedRestClient.interfacesMod.IRequestHandler
import typings.typedRestClient.interfacesMod.IRequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersBasiccredsMod {
  
  @JSImport("typed-rest-client/handlers/basiccreds", "BasicCredentialHandler")
  @js.native
  open class BasicCredentialHandler protected ()
    extends StObject
       with IRequestHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, allowCrossOriginAuthentication: Boolean) = this()
    
    var allowCrossOriginAuthentication: Boolean = js.native
    
    /* CompleteClass */
    override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    
    /* CompleteClass */
    override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: Any): js.Promise[IHttpClientResponse] = js.native
    
    var origin: String = js.native
    
    var password: String = js.native
    
    def prepareRequest(options: Any): Unit = js.native
    /* CompleteClass */
    override def prepareRequest(options: RequestOptions): Unit = js.native
    
    var username: String = js.native
  }
}
