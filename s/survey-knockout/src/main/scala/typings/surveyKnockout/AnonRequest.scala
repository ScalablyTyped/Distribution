package typings.surveyKnockout

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  var request: XMLHttpRequest
}

object AnonRequest {
  @scala.inline
  def apply(request: XMLHttpRequest): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequest]
  }
}

