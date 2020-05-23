package typings.superagent.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseError extends Error {
  var response: js.UndefOr[Response] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object ResponseError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    response: Response = null,
    stack: String = null,
    status: js.UndefOr[Double] = js.undefined
  ): ResponseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseError]
  }
}

