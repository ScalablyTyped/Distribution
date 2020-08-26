package typings.vsoNodeApi.vsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestHandler extends js.Object {
  def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
  def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): Unit = js.native
  def prepareRequest(options: js.Any): Unit = js.native
}

object IRequestHandler {
  @scala.inline
  def apply(
    canHandleAuthentication: IHttpResponse => Boolean,
    handleAuthentication: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    prepareRequest: js.Any => Unit
  ): IRequestHandler = {
    val __obj = js.Dynamic.literal(canHandleAuthentication = js.Any.fromFunction1(canHandleAuthentication), handleAuthentication = js.Any.fromFunction5(handleAuthentication), prepareRequest = js.Any.fromFunction1(prepareRequest))
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
    def setCanHandleAuthentication(value: IHttpResponse => Boolean): Self = this.set("canHandleAuthentication", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleAuthentication(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = this.set("handleAuthentication", js.Any.fromFunction5(value))
    @scala.inline
    def setPrepareRequest(value: js.Any => Unit): Self = this.set("prepareRequest", js.Any.fromFunction1(value))
  }
  
}

