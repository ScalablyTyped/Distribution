package typings.twilsock.protocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var headers: Headers
  var host: String
  var method: Method
  var params: Params
  var path: String
}

object Address {
  @scala.inline
  def apply(headers: Headers, host: String, method: Method, params: Params, path: String): Address = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

