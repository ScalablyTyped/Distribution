package typings
package urllibLib.urllibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpClientResponse[T] extends js.Object {
  var data: T
  var headers: nodeLib.httpMod.OutgoingHttpHeaders
  var res: nodeLib.httpMod.IncomingMessage
  var status: scala.Double
}

object HttpClientResponse {
  @scala.inline
  def apply[T](
    data: T,
    headers: nodeLib.httpMod.OutgoingHttpHeaders,
    res: nodeLib.httpMod.IncomingMessage,
    status: scala.Double
  ): HttpClientResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers, res = res, status = status)
  
    __obj.asInstanceOf[HttpClientResponse[T]]
  }
}

