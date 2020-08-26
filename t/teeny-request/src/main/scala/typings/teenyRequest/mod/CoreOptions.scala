package typings.teenyRequest.mod

import typings.node.httpsMod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreOptions extends js.Object {
  var body: js.UndefOr[String | js.Object] = js.native
  var forever: js.UndefOr[Boolean] = js.native
  var gzip: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var json: js.UndefOr[js.Any] = js.native
  var method: js.UndefOr[String] = js.native
  var multipart: js.UndefOr[js.Array[RequestPart]] = js.native
  var pool: js.UndefOr[AgentOptions | typings.node.httpMod.AgentOptions] = js.native
  var proxy: js.UndefOr[String] = js.native
  var qs: js.UndefOr[js.Any] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var useQuerystring: js.UndefOr[Boolean] = js.native
}

object CoreOptions {
  @scala.inline
  def apply(): CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions]
  }
  @scala.inline
  implicit class CoreOptionsOps[Self <: CoreOptions] (val x: Self) extends AnyVal {
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
    def setBody(value: String | js.Object): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setForever(value: Boolean): Self = this.set("forever", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForever: Self = this.set("forever", js.undefined)
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMultipartVarargs(value: RequestPart*): Self = this.set("multipart", js.Array(value :_*))
    @scala.inline
    def setMultipart(value: js.Array[RequestPart]): Self = this.set("multipart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    @scala.inline
    def setPool(value: AgentOptions | typings.node.httpMod.AgentOptions): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setQs(value: js.Any): Self = this.set("qs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQs: Self = this.set("qs", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUseQuerystring(value: Boolean): Self = this.set("useQuerystring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseQuerystring: Self = this.set("useQuerystring", js.undefined)
  }
  
}

