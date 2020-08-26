package typings.urijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URIOptions extends js.Object {
  var fragment: js.UndefOr[String] = js.native
  var hostname: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var urn: js.UndefOr[Boolean] = js.native
  var username: js.UndefOr[String] = js.native
}

object URIOptions {
  @scala.inline
  def apply(): URIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URIOptions]
  }
  @scala.inline
  implicit class URIOptionsOps[Self <: URIOptions] (val x: Self) extends AnyVal {
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
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setUrn(value: Boolean): Self = this.set("urn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrn: Self = this.set("urn", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

