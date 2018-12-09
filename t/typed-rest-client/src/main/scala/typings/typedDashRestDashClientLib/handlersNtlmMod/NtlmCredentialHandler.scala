package typings
package typedDashRestDashClientLib.handlersNtlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/ntlm", "NtlmCredentialHandler")
@js.native
class NtlmCredentialHandler protected ()
  extends typedDashRestDashClientLib.interfacesMod.IRequestHandler {
  def this(username: java.lang.String, password: java.lang.String) = this()
  def this(username: java.lang.String, password: java.lang.String, workstation: java.lang.String) = this()
  def this(username: java.lang.String, password: java.lang.String, workstation: java.lang.String, domain: java.lang.String) = this()
  var _ntlmOptions: js.Any = js.native
  /* CompleteClass */
  override def canHandleAuthentication(response: typedDashRestDashClientLib.interfacesMod.IHttpClientResponse): scala.Boolean = js.native
  /* CompleteClass */
  override def handleAuthentication(
    httpClient: typedDashRestDashClientLib.interfacesMod.IHttpClient,
    requestInfo: typedDashRestDashClientLib.interfacesMod.IRequestInfo,
    objs: js.Any
  ): js.Promise[typedDashRestDashClientLib.interfacesMod.IHttpClientResponse] = js.native
  /* private */ def handleAuthenticationPrivate(httpClient: js.Any, requestInfo: js.Any, objs: js.Any, finalCallback: js.Any): js.Any = js.native
  /* CompleteClass */
  override def prepareRequest(options: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  /* private */ def sendType1Message(httpClient: js.Any, requestInfo: js.Any, objs: js.Any, finalCallback: js.Any): js.Any = js.native
  /* private */ def sendType3Message(httpClient: js.Any, requestInfo: js.Any, objs: js.Any, res: js.Any, callback: js.Any): js.Any = js.native
}

