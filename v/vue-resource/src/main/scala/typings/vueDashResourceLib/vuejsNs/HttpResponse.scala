package typings
package vueDashResourceLib.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  var data: js.Object
  var headers: js.Function
  var ok: scala.Boolean
  var status: scala.Double
  var statusText: java.lang.String
  def blob(): stdLib.Blob
  def json(): js.Any
  def text(): java.lang.String
}

object HttpResponse {
  @scala.inline
  def apply(
    blob: () => stdLib.Blob,
    data: js.Object,
    headers: js.Function,
    json: () => js.Any,
    ok: scala.Boolean,
    status: scala.Double,
    statusText: java.lang.String,
    text: () => java.lang.String
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(blob = js.Any.fromFunction0(blob), data = data, headers = headers, json = js.Any.fromFunction0(json), ok = ok, status = status, statusText = statusText, text = js.Any.fromFunction0(text))
  
    __obj.asInstanceOf[HttpResponse]
  }
}

