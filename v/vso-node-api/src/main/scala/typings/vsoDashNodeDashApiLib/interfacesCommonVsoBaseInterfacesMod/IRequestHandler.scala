package typings
package vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestHandler extends js.Object {
  def canHandleAuthentication(res: IHttpResponse): scala.Boolean
  def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): scala.Unit
  def prepareRequest(options: js.Any): scala.Unit
}

object IRequestHandler {
  @scala.inline
  def apply(
    canHandleAuthentication: js.Function1[IHttpResponse, scala.Boolean],
    handleAuthentication: js.Function5[js.Any, js.Any, js.Any, js.Any, js.Any, scala.Unit],
    prepareRequest: js.Function1[js.Any, scala.Unit]
  ): IRequestHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canHandleAuthentication")(canHandleAuthentication)
    __obj.updateDynamic("handleAuthentication")(handleAuthentication)
    __obj.updateDynamic("prepareRequest")(prepareRequest)
    __obj.asInstanceOf[IRequestHandler]
  }
}

