package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WSOptions extends js.Object {
  var headers: HttpHeaders
  var host: java.lang.String
  var path: java.lang.String
  var port: scala.Double
}

object WSOptions {
  @scala.inline
  def apply(headers: HttpHeaders, host: java.lang.String, path: java.lang.String, port: scala.Double): WSOptions = {
    val __obj = js.Dynamic.literal(headers = headers, host = host, path = path, port = port)
  
    __obj.asInstanceOf[WSOptions]
  }
}

