package typings.twilioDashMcsDashClient.libServicesTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: js.Any
  var headers: Headers
  var status: js.Any
}

object Response {
  @scala.inline
  def apply(body: js.Any, headers: Headers, status: js.Any): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response]
  }
}

