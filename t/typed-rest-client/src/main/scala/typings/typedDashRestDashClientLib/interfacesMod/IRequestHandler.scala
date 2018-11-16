package typings
package typedDashRestDashClientLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRequestHandler extends js.Object {
  def canHandleAuthentication(response: IHttpClientResponse): scala.Boolean
  def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): stdLib.Promise[IHttpClientResponse]
  def prepareRequest(options: nodeLib.httpMod.RequestOptions): scala.Unit
}

