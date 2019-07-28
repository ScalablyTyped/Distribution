package typings.typedDashRestDashClient.handlersBearertokenMod

import typings.node.httpMod.RequestOptions
import typings.typedDashRestDashClient.interfacesMod.IHttpClient
import typings.typedDashRestDashClient.interfacesMod.IHttpClientResponse
import typings.typedDashRestDashClient.interfacesMod.IRequestHandler
import typings.typedDashRestDashClient.interfacesMod.IRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/bearertoken", "BearerCredentialHandler")
@js.native
class BearerCredentialHandler protected () extends IRequestHandler {
  def this(token: String) = this()
  var token: String = js.native
  /* CompleteClass */
  override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
  /* CompleteClass */
  override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
  def prepareRequest(options: js.Any): Unit = js.native
  /* CompleteClass */
  override def prepareRequest(options: RequestOptions): Unit = js.native
}

