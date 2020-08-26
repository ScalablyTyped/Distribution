package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitForkRef extends GitRef {
  /**
    * The repository ID of the fork.
    */
  var repository: GitRepository = js.native
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
  @scala.inline
  implicit class GitForkRefOps[Self <: GitForkRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRepository(value: GitRepository): Self = this.set("repository", value.asInstanceOf[js.Any])
  }
  
}

