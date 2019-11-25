package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var allow: Boolean
  var method: String
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var post_filter: js.UndefOr[js.Any] = js.undefined
  var query_filter: js.UndefOr[js.Any] = js.undefined
  var url: String
}

object Policy {
  @scala.inline
  def apply(
    allow: Boolean,
    method: String,
    url: String,
    post_filter: js.Any = null,
    query_filter: js.Any = null
  ): Policy = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (post_filter != null) __obj.updateDynamic("post_filter")(post_filter.asInstanceOf[js.Any])
    if (query_filter != null) __obj.updateDynamic("query_filter")(query_filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

