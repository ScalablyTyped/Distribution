package typings.teenyDashRequest.teenyDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var body: T
  var headers: Headers
  var request: Request
  var statusCode: Double
  var statusMessage: js.UndefOr[String] = js.undefined
}

object Response {
  @scala.inline
  def apply[T](body: T, headers: Headers, request: Request, statusCode: Double, statusMessage: String = null): Response[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
}

