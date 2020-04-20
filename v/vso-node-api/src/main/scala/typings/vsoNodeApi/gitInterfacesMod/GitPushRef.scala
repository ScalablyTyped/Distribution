package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPushRef extends js.Object {
  var _links: js.Any
  var date: Date
  var pushCorrelationId: String
  var pushId: Double
  var pushedBy: IdentityRef
  var url: String
}

object GitPushRef {
  @scala.inline
  def apply(
    _links: js.Any,
    date: Date,
    pushCorrelationId: String,
    pushId: Double,
    pushedBy: IdentityRef,
    url: String
  ): GitPushRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], pushCorrelationId = pushCorrelationId.asInstanceOf[js.Any], pushId = pushId.asInstanceOf[js.Any], pushedBy = pushedBy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPushRef]
  }
}

