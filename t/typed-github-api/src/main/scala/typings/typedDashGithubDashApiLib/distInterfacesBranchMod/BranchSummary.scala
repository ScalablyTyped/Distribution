package typings
package typedDashGithubDashApiLib.distInterfacesBranchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchSummary extends js.Object {
  var name: java.lang.String
  var repository: js.UndefOr[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository] = js.undefined
  var sha: java.lang.String
  var user: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
}

object BranchSummary {
  @scala.inline
  def apply(
    name: java.lang.String,
    sha: java.lang.String,
    user: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary,
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository = null
  ): BranchSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("sha")(sha)
    __obj.updateDynamic("user")(user)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[BranchSummary]
  }
}

