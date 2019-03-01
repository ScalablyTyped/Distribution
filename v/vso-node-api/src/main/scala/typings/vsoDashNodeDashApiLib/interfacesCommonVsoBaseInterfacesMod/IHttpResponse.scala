package typings
package vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpResponse extends js.Object {
  var headers: js.Any
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object IHttpResponse {
  @scala.inline
  def apply(headers: js.Any, statusCode: scala.Int | scala.Double = null): IHttpResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttpResponse]
  }
}

