package typings.twilsock.upstreamMod

import typings.twilsock.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: Headers
  var status: Code
}

object Result {
  @scala.inline
  def apply(headers: Headers, status: Code, body: js.Any = null): Result = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

