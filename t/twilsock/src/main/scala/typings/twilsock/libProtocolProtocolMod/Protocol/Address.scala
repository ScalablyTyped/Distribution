package typings.twilsock.libProtocolProtocolMod.Protocol

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
    val __obj = js.Dynamic.literal(headers = headers, host = host, method = method, params = params, path = path)
  
    __obj.asInstanceOf[Address]
  }
}

