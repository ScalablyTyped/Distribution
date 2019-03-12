package typings
package typedDashRestDashClientLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestHandler extends js.Object {
  def canHandleAuthentication(response: IHttpClientResponse): scala.Boolean
  def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse]
  def prepareRequest(options: nodeLib.httpMod.RequestOptions): scala.Unit
}

object IRequestHandler {
  @scala.inline
  def apply(
    canHandleAuthentication: IHttpClientResponse => scala.Boolean,
    handleAuthentication: (IHttpClient, IRequestInfo, js.Any) => js.Promise[IHttpClientResponse],
    prepareRequest: nodeLib.httpMod.RequestOptions => scala.Unit
  ): IRequestHandler = {
    val __obj = js.Dynamic.literal(canHandleAuthentication = js.Any.fromFunction1(canHandleAuthentication), handleAuthentication = js.Any.fromFunction3(handleAuthentication), prepareRequest = js.Any.fromFunction1(prepareRequest))
  
    __obj.asInstanceOf[IRequestHandler]
  }
}

