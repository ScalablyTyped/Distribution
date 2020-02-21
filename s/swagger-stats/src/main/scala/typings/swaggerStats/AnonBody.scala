package typings.swaggerStats

import typings.node.httpMod.IncomingHttpHeaders
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var clength: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
  var params: js.UndefOr[Record[String, _]] = js.undefined
  var query: js.UndefOr[Record[String, _]] = js.undefined
  var route_path: js.UndefOr[String] = js.undefined
  var url: String
}

object AnonBody {
  @scala.inline
  def apply(
    url: String,
    body: js.Any = null,
    clength: Int | Double = null,
    headers: IncomingHttpHeaders = null,
    params: Record[String, _] = null,
    query: Record[String, _] = null,
    route_path: String = null
  ): AnonBody = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (clength != null) __obj.updateDynamic("clength")(clength.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (route_path != null) __obj.updateDynamic("route_path")(route_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

