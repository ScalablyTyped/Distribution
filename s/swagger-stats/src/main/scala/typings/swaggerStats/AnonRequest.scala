package typings.swaggerStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  var request: AnonBody
  var response: AnonClass
}

object AnonRequest {
  @scala.inline
  def apply(request: AnonBody, response: AnonClass): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequest]
  }
}

