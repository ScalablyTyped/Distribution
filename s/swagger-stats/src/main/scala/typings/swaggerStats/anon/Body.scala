package typings.swaggerStats.anon

import typings.node.httpMod.IncomingHttpHeaders
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  var body: js.UndefOr[js.Any] = js.native
  var clength: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[IncomingHttpHeaders] = js.native
  var params: js.UndefOr[Record[String, _]] = js.native
  var query: js.UndefOr[Record[String, _]] = js.native
  var route_path: js.UndefOr[String] = js.native
  var url: String = js.native
}

object Body {
  @scala.inline
  def apply(url: String): Body = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setClength(value: Double): Self = this.set("clength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClength: Self = this.set("clength", js.undefined)
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setParams(value: Record[String, _]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setQuery(value: Record[String, _]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRoute_path(value: String): Self = this.set("route_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoute_path: Self = this.set("route_path", js.undefined)
  }
  
}

