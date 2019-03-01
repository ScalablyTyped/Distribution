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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("pushCorrelationId")(pushCorrelationId)
    __obj.updateDynamic("pushId")(pushId)
    __obj.updateDynamic("pushedBy")(pushedBy)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitPushRef]
  }
}

