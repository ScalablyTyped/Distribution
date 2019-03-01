package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var allow: scala.Boolean
  var method: java.lang.String
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var post_filter: js.UndefOr[js.Any] = js.undefined
  var query_filter: js.UndefOr[js.Any] = js.undefined
  var url: java.lang.String
}

object Policy {
  @scala.inline
  def apply(
    allow: scala.Boolean,
    method: java.lang.String,
    url: java.lang.String,
    post_filter: js.Any = null,
    query_filter: js.Any = null
  ): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allow")(allow)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("url")(url)
    if (post_filter != null) __obj.updateDynamic("post_filter")(post_filter)
    if (query_filter != null) __obj.updateDynamic("query_filter")(query_filter)
    __obj.asInstanceOf[Policy]
  }
}

