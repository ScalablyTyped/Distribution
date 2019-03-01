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
    canHandleAuthentication: js.Function1[IHttpClientResponse, scala.Boolean],
    handleAuthentication: js.Function3[IHttpClient, IRequestInfo, js.Any, js.Promise[IHttpClientResponse]],
    prepareRequest: js.Function1[nodeLib.httpMod.RequestOptions, scala.Unit]
  ): IRequestHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canHandleAuthentication")(canHandleAuthentication)
    __obj.updateDynamic("handleAuthentication")(handleAuthentication)
    __obj.updateDynamic("prepareRequest")(prepareRequest)
    __obj.asInstanceOf[IRequestHandler]
  }
}

