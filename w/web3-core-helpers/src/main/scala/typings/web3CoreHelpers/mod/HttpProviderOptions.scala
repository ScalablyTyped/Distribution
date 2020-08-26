package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpProviderOptions extends js.Object {
  var agent: js.UndefOr[HttpAgent] = js.native
  var headers: js.UndefOr[js.Array[HttpHeader]] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object HttpProviderOptions {
  @scala.inline
  def apply(): HttpProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpProviderOptions]
  }
  @scala.inline
  implicit class HttpProviderOptionsOps[Self <: HttpProviderOptions] (val x: Self) extends AnyVal {
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
    def setAgent(value: HttpAgent): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: HttpHeader*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[HttpHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

