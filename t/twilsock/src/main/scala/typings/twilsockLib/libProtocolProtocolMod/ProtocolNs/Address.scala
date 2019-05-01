package typings
package twilsockLib.libProtocolProtocolMod.ProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var headers: Headers
  var host: java.lang.String
  var method: Method
  var params: Params
  var path: java.lang.String
}

object Address {
  @scala.inline
  def apply(headers: Headers, host: java.lang.String, method: Method, params: Params, path: java.lang.String): Address = {
    val __obj = js.Dynamic.literal(headers = headers, host = host, method = method, params = params, path = path)
  
    __obj.asInstanceOf[Address]
  }
}

