package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitForkRef extends GitRef {
  /**
    * The repository ID of the fork.
    */
  var repository: GitRepository
}

object GitForkRef {
  @scala.inline
  def apply(
    _links: js.Any,
    isLocked: scala.Boolean,
    isLockedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    name: java.lang.String,
    objectId: java.lang.String,
    peeledObjectId: java.lang.String,
    repository: GitRepository,
    statuses: js.Array[GitStatus],
    url: java.lang.String
  ): GitForkRef = {
    val __obj = js.Dynamic.literal(_links = _links, isLocked = isLocked, isLockedBy = isLockedBy, name = name, objectId = objectId, peeledObjectId = peeledObjectId, repository = repository, statuses = statuses, url = url)
  
    __obj.asInstanceOf[GitForkRef]
  }
}

