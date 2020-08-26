package typings.typedRestClient.interfacesMod

import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestHandler extends js.Object {
  def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
  def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
  def prepareRequest(options: RequestOptions): Unit = js.native
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
  @scala.inline
  implicit class IRequestHandlerOps[Self <: IRequestHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanHandleAuthentication(value: IHttpClientResponse => Boolean): Self = this.set("canHandleAuthentication", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleAuthentication(value: (IHttpClient, IRequestInfo, js.Any) => js.Promise[IHttpClientResponse]): Self = this.set("handleAuthentication", js.Any.fromFunction3(value))
    @scala.inline
    def setPrepareRequest(value: RequestOptions => Unit): Self = this.set("prepareRequest", js.Any.fromFunction1(value))
  }
  
}

