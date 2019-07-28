package typings.typedDashRestDashClient.interfacesMod

import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestHandler extends js.Object {
  def canHandleAuthentication(response: IHttpClientResponse): Boolean
  def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse]
  def prepareRequest(options: RequestOptions): Unit
}

object IRequestHandler {
  @scala.inline
  def apply(
    canHandleAuthentication: IHttpClientResponse => Boolean,
    handleAuthentication: (IHttpClient, IRequestInfo, js.Any) => js.Promise[IHttpClientResponse],
    prepareRequest: RequestOptions => Unit
  ): IRequestHandler = {
    val __obj = js.Dynamic.literal(canHandleAuthentication = js.Any.fromFunction1(canHandleAuthentication), handleAuthentication = js.Any.fromFunction3(handleAuthentication), prepareRequest = js.Any.fromFunction1(prepareRequest))
  
    __obj.asInstanceOf[IRequestHandler]
  }
}

