package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isLockedBy = isLockedBy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], peeledObjectId = peeledObjectId.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitForkRef]
  }
}

