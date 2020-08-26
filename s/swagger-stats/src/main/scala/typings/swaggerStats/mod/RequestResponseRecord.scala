package typings.swaggerStats.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.swaggerStats.anon.Deprecated
import typings.swaggerStats.anon.Hostname
import typings.swaggerStats.anon.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestResponseRecord
  extends /* field */ StringDictionary[js.Any] {
  var `@timestamp`: String = js.native
  var api: Deprecated = js.native
  var attrs: js.UndefOr[Record[String, String]] = js.native
  var attrsint: js.UndefOr[Record[String, Double]] = js.native
  var endts: Double = js.native
  var http: Request = js.native
  var ip: String = js.native
  var method: String = js.native
  var node: Hostname = js.native
  var path: String = js.native
  var port: String = js.native
  var query: String = js.native
  var real_ip: String = js.native
  var responsetime: Double = js.native
  var startts: Double = js.native
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
    startts: Double
  ): RequestResponseRecord = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], endts = endts.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], real_ip = real_ip.asInstanceOf[js.Any], responsetime = responsetime.asInstanceOf[js.Any], startts = startts.asInstanceOf[js.Any])
    __obj.updateDynamic("@timestamp")(`@timestamp`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponseRecord]
  }
  @scala.inline
  implicit class RequestResponseRecordOps[Self <: RequestResponseRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `set@timestamp`(value: String): Self = this.set("@timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi(value: Deprecated): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndts(value: Double): Self = this.set("endts", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: Request): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Hostname): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setReal_ip(value: String): Self = this.set("real_ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponsetime(value: Double): Self = this.set("responsetime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartts(value: Double): Self = this.set("startts", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttrs(value: Record[String, String]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setAttrsint(value: Record[String, Double]): Self = this.set("attrsint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrsint: Self = this.set("attrsint", js.undefined)
  }
  
}

