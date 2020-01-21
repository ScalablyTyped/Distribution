package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[R] extends js.Object {
  var data: R
  var statusCode: Double
  var statusText: String
}

object Response {
  @scala.inline
  def apply[R](data: R, statusCode: Double, statusText: String): Response[R] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response[R]]
  }
}

