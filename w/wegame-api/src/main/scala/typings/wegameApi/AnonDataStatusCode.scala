package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataStatusCode extends js.Object {
  var data: String
  var statusCode: Double
}

object AnonDataStatusCode {
  @scala.inline
  def apply(data: String, statusCode: Double): AnonDataStatusCode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataStatusCode]
  }
}

