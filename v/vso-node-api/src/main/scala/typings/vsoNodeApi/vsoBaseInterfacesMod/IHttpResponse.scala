package typings.vsoNodeApi.vsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpResponse extends js.Object {
  var headers: js.Any
  var statusCode: js.UndefOr[Double] = js.undefined
}

object IHttpResponse {
  @scala.inline
  def apply(headers: js.Any, statusCode: Int | Double = null): IHttpResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttpResponse]
  }
}

