package typings.swaggerStats.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.swaggerStats.anon.Deprecated
import typings.swaggerStats.anon.Hostname
import typings.swaggerStats.anon.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResponseRecord
  extends /* field */ StringDictionary[js.Any] {
  var `@timestamp`: String
  var api: Deprecated
  var attrs: js.UndefOr[Record[String, String]] = js.undefined
  var attrsint: js.UndefOr[Record[String, Double]] = js.undefined
  var endts: Double
  var http: Request
  var ip: String
  var method: String
  var node: Hostname
  var path: String
  var port: String
  var query: String
  var real_ip: String
  var responsetime: Double
  var startts: Double
}

object RequestResponseRecord {
  @scala.inline
  def apply(
    `@timestamp`: String,
    api: Deprecated,
    endts: Double,
    http: Request,
    ip: String,
    method: String,
    node: Hostname,
    path: String,
    port: String,
    query: String,
    real_ip: String,
    responsetime: Double,
    startts: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    attrs: Record[String, String] = null,
    attrsint: Record[String, Double] = null
  ): RequestResponseRecord = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], endts = endts.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], real_ip = real_ip.asInstanceOf[js.Any], responsetime = responsetime.asInstanceOf[js.Any], startts = startts.asInstanceOf[js.Any])
    __obj.updateDynamic("@timestamp")(`@timestamp`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (attrsint != null) __obj.updateDynamic("attrsint")(attrsint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponseRecord]
  }
}

