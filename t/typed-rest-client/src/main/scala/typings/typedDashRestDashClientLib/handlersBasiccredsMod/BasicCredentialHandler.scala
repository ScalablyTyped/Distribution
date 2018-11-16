package typings
package typedDashRestDashClientLib.handlersBasiccredsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/basiccreds", "BasicCredentialHandler")
@js.native
class BasicCredentialHandler protected ()
  extends typedDashRestDashClientLib.interfacesMod.IRequestHandler {
  def this(username: java.lang.String, password: java.lang.String) = this()
  var password: java.lang.String = js.native
  var username: java.lang.String = js.native
  /* CompleteClass */
  override def canHandleAuthentication(response: typedDashRestDashClientLib.interfacesMod.IHttpClientResponse): scala.Boolean = js.native
  /* CompleteClass */
  override def handleAuthentication(
    httpClient: typedDashRestDashClientLib.interfacesMod.IHttpClient,
    requestInfo: typedDashRestDashClientLib.interfacesMod.IRequestInfo,
    objs: js.Any
  ): stdLib.Promise[typedDashRestDashClientLib.interfacesMod.IHttpClientResponse] = js.native
  def prepareRequest(options: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def prepareRequest(options: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
}

