package typings.typedDashRestDashClient

import typings.node.httpMod.RequestOptions
import typings.typedDashRestDashClient.interfacesMod.IHttpClient
import typings.typedDashRestDashClient.interfacesMod.IHttpClientResponse
import typings.typedDashRestDashClient.interfacesMod.IRequestHandler
import typings.typedDashRestDashClient.interfacesMod.IRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/ntlm", JSImport.Namespace)
@js.native
object handlersNtlmMod extends js.Object {
  @js.native
  class NtlmCredentialHandler protected () extends IRequestHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
    var _ntlmOptions: js.Any = js.native
    /* CompleteClass */
    override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    /* CompleteClass */
    override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
    /* private */ def handleAuthenticationPrivate(httpClient: js.Any, requestInfo: js.Any, objs: js.Any, finalCallback: js.Any): js.Any = js.native
    /* CompleteClass */
    override def prepareRequest(options: RequestOptions): Unit = js.native
    /* private */ def sendType1Message(httpClient: js.Any, requestInfo: js.Any, objs: js.Any, finalCallback: js.Any): js.Any = js.native
    /* private */ def sendType3Message(httpClient: js.Any, requestInfo: js.Any, objs: js.Any, res: js.Any, callback: js.Any): js.Any = js.native
  }
  
}

