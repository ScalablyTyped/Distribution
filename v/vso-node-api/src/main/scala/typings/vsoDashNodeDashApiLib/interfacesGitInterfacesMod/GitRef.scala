package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRef extends js.Object {
  var _links: js.Any
  var isLocked: scala.Boolean
  var isLockedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var name: java.lang.String
  var objectId: java.lang.String
  var peeledObjectId: java.lang.String
  var statuses: js.Array[GitStatus]
  var url: java.lang.String
}

object GitRef {
  @scala.inline
  def apply(
    _links: js.Any,
    isLocked: scala.Boolean,
    isLockedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    name: java.lang.String,
    objectId: java.lang.String,
    peeledObjectId: java.lang.String,
    statuses: js.Array[GitStatus],
    url: java.lang.String
  ): GitRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("isLocked")(isLocked)
    __obj.updateDynamic("isLockedBy")(isLockedBy)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("objectId")(objectId)
    __obj.updateDynamic("peeledObjectId")(peeledObjectId)
    __obj.updateDynamic("statuses")(statuses)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitRef]
  }
}

