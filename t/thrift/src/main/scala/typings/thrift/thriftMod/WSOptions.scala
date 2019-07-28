package typings.thrift.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WSOptions extends js.Object {
  var headers: HttpHeaders
  var host: String
  var path: String
  var port: Double
}

object WSOptions {
  @scala.inline
  def apply(headers: HttpHeaders, host: String, path: String, port: Double): WSOptions = {
    val __obj = js.Dynamic.literal(headers = headers, host = host, path = path, port = port)
  
    __obj.asInstanceOf[WSOptions]
  }
}

