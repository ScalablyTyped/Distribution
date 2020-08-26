package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var allow: Boolean = js.native
  var method: String = js.native
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var post_filter: js.UndefOr[js.Any] = js.native
  var query_filter: js.UndefOr[js.Any] = js.native
  var url: String = js.native
}

object Policy {
  @scala.inline
  def apply(allow: Boolean, method: String, url: String): Policy = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
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
    def setAllow(value: Boolean): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setPost_filter(value: js.Any): Self = this.set("post_filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost_filter: Self = this.set("post_filter", js.undefined)
    @scala.inline
    def setQuery_filter(value: js.Any): Self = this.set("query_filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery_filter: Self = this.set("query_filter", js.undefined)
  }
  
}

