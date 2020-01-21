package typings.vsoNodeApi.vsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestHandler extends js.Object {
  def canHandleAuthentication(res: IHttpResponse): Boolean
  def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): Unit
  def prepareRequest(options: js.Any): Unit
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
}

