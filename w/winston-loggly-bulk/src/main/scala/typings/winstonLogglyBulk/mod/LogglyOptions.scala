package typings.winstonLogglyBulk.mod

import typings.node.urlMod.Url
import typings.winstonLogglyBulk.anon.Password
import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogglyOptions extends TransportStreamOptions {
  var auth: js.UndefOr[Password | Null] = js.native
  var bufferOptions: js.UndefOr[BufferOptions] = js.native
  var isBulk: js.UndefOr[Boolean] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var networkErrorOnConsole: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[Null | String | Url] = js.native
  var stripColors: js.UndefOr[Boolean] = js.native
  var subdomain: String = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var timestamp: js.UndefOr[Boolean] = js.native
  var token: String = js.native
}

object LogglyOptions {
  @scala.inline
  def apply(subdomain: String, token: String): LogglyOptions = {
    val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogglyOptions]
  }
  @scala.inline
  implicit class LogglyOptionsOps[Self <: LogglyOptions] (val x: Self) extends AnyVal {
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
    def setSubdomain(value: String): Self = this.set("subdomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth(value: Password): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setAuthNull: Self = this.set("auth", null)
    @scala.inline
    def setBufferOptions(value: BufferOptions): Self = this.set("bufferOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferOptions: Self = this.set("bufferOptions", js.undefined)
    @scala.inline
    def setIsBulk(value: Boolean): Self = this.set("isBulk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBulk: Self = this.set("isBulk", js.undefined)
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setNetworkErrorOnConsole(value: Boolean): Self = this.set("networkErrorOnConsole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkErrorOnConsole: Self = this.set("networkErrorOnConsole", js.undefined)
    @scala.inline
    def setProxy(value: String | Url): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setProxyNull: Self = this.set("proxy", null)
    @scala.inline
    def setStripColors(value: Boolean): Self = this.set("stripColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripColors: Self = this.set("stripColors", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimestamp(value: Boolean): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

