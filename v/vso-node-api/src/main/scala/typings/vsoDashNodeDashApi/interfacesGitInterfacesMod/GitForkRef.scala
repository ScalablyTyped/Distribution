package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    isLocked: Boolean,
    isLockedBy: IdentityRef,
    name: String,
    objectId: String,
    peeledObjectId: String,
    repository: GitRepository,
    statuses: js.Array[GitStatus],
    url: String
  ): GitForkRef = {
    val __obj = js.Dynamic.literal(_links = _links, isLocked = isLocked, isLockedBy = isLockedBy, name = name, objectId = objectId, peeledObjectId = peeledObjectId, repository = repository, statuses = statuses, url = url)
  
    __obj.asInstanceOf[GitForkRef]
  }
}

