package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPushRef extends js.Object {
  var _links: js.Any
  var date: stdLib.Date
  var pushCorrelationId: java.lang.String
  var pushId: scala.Double
  var pushedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var url: java.lang.String
}

object GitPushRef {
  @scala.inline
  def apply(
    _links: js.Any,
    date: stdLib.Date,
    pushCorrelationId: java.lang.String,
    pushId: scala.Double,
    pushedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    url: java.lang.String
  ): GitPushRef = {
    val __obj = js.Dynamic.literal(_links = _links, date = date, pushCorrelationId = pushCorrelationId, pushId = pushId, pushedBy = pushedBy, url = url)
  
    __obj.asInstanceOf[GitPushRef]
  }
}

