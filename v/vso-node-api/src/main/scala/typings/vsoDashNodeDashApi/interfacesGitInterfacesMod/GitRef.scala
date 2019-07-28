package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRef extends js.Object {
  var _links: js.Any
  var isLocked: Boolean
  var isLockedBy: IdentityRef
  var name: String
  var objectId: String
  var peeledObjectId: String
  var statuses: js.Array[GitStatus]
  var url: String
}

object GitRef {
  @scala.inline
  def apply(
    _links: js.Any,
    isLocked: Boolean,
    isLockedBy: IdentityRef,
    name: String,
    objectId: String,
    peeledObjectId: String,
    statuses: js.Array[GitStatus],
    url: String
  ): GitRef = {
    val __obj = js.Dynamic.literal(_links = _links, isLocked = isLocked, isLockedBy = isLockedBy, name = name, objectId = objectId, peeledObjectId = peeledObjectId, statuses = statuses, url = url)
  
    __obj.asInstanceOf[GitRef]
  }
}

