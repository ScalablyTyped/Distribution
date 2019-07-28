package typings.urllib.urllibMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpClientResponse[T] extends js.Object {
  var data: T
  var headers: OutgoingHttpHeaders
  var res: IncomingMessage
  var status: Double
}

object HttpClientResponse {
  @scala.inline
  def apply[T](data: T, headers: OutgoingHttpHeaders, res: IncomingMessage, status: Double): HttpClientResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers, res = res, status = status)
  
    __obj.asInstanceOf[HttpClientResponse[T]]
  }
}

