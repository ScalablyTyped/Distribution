package typings.typedDashRestDashClient.restClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestResponse[T] extends js.Object {
  var headers: js.Object
  var result: T | Null
  var statusCode: Double
}

object IRestResponse {
  @scala.inline
  def apply[T](headers: js.Object, statusCode: Double, result: T = null): IRestResponse[T] = {
    val __obj = js.Dynamic.literal(headers = headers, statusCode = statusCode)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestResponse[T]]
  }
}

