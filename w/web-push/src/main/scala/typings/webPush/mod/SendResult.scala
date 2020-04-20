package typings.webPush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendResult extends js.Object {
  var body: String
  var headers: Headers
  var statusCode: Double
}

object SendResult {
  @scala.inline
  def apply(body: String, headers: Headers, statusCode: Double): SendResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendResult]
  }
}

