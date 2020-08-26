package typings.xhr2Cookies.anon

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var httpAgent: js.UndefOr[Agent] = js.native
  var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.native
}

object BaseUrl {
  @scala.inline
  def apply(): BaseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseUrl]
  }
  @scala.inline
  implicit class BaseUrlOps[Self <: BaseUrl] (val x: Self) extends AnyVal {
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setHttpAgent(value: Agent): Self = this.set("httpAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpAgent: Self = this.set("httpAgent", js.undefined)
    @scala.inline
    def setHttpsAgent(value: typings.node.httpsMod.Agent): Self = this.set("httpsAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpsAgent: Self = this.set("httpsAgent", js.undefined)
  }
  
}

