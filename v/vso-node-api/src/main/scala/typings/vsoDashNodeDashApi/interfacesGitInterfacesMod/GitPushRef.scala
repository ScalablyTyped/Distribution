package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(_links = _links, date = date, pushCorrelationId = pushCorrelationId, pushId = pushId, pushedBy = pushedBy, url = url)
  
    __obj.asInstanceOf[GitPushRef]
  }
}

