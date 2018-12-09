package typings
package typedDashRestDashClientLib.handlersBearertokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/bearertoken", "BearerCredentialHandler")
@js.native
class BearerCredentialHandler protected ()
  extends typedDashRestDashClientLib.interfacesMod.IRequestHandler {
  def this(token: java.lang.String) = this()
  var token: java.lang.String = js.native
  /* CompleteClass */
  override def canHandleAuthentication(response: typedDashRestDashClientLib.interfacesMod.IHttpClientResponse): scala.Boolean = js.native
  /* CompleteClass */
  override def handleAuthentication(
    httpClient: typedDashRestDashClientLib.interfacesMod.IHttpClient,
    requestInfo: typedDashRestDashClientLib.interfacesMod.IRequestInfo,
    objs: js.Any
  ): js.Promise[typedDashRestDashClientLib.interfacesMod.IHttpClientResponse] = js.native
  def prepareRequest(options: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def prepareRequest(options: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
}

