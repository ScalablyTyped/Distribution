package typings.tldjs.anon

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractHostname extends js.Object {
  var extractHostname: js.UndefOr[ReturnType[js.Function1[/* host */ String, String | Null]]] = js.native
  var rules: js.UndefOr[js.Any] = js.native
  var validHosts: js.UndefOr[js.Array[String]] = js.native
}

object ExtractHostname {
  @scala.inline
  def apply(): ExtractHostname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractHostname]
  }
  @scala.inline
  implicit class ExtractHostnameOps[Self <: ExtractHostname] (val x: Self) extends AnyVal {
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
    def setExtractHostname(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = this.set("extractHostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractHostname: Self = this.set("extractHostname", js.undefined)
    @scala.inline
    def setRules(value: js.Any): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setValidHostsVarargs(value: String*): Self = this.set("validHosts", js.Array(value :_*))
    @scala.inline
    def setValidHosts(value: js.Array[String]): Self = this.set("validHosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidHosts: Self = this.set("validHosts", js.undefined)
  }
  
}

