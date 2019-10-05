package typings.twilsock.libProtocolProtocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var headers: Headers
  var host: String
  var method: Method
  var params: Params
  var path: String
}

object Request {
  @scala.inline
  def apply(headers: Headers, host: String, method: Method, params: Params, path: String): Request = {
    val __obj = js.Dynamic.literal(headers = headers, host = host, method = method, params = params, path = path)
  
    __obj.asInstanceOf[Request]
  }
}

