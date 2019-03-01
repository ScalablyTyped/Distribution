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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("isLocked")(isLocked)
    __obj.updateDynamic("isLockedBy")(isLockedBy)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("objectId")(objectId)
    __obj.updateDynamic("peeledObjectId")(peeledObjectId)
    __obj.updateDynamic("repository")(repository)
    __obj.updateDynamic("statuses")(statuses)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitForkRef]
  }
}

