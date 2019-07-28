package typings.typedDashGithubDashApi.distInterfacesBranchMod

import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchSummary extends js.Object {
  var name: String
  var repository: js.UndefOr[Repository] = js.undefined
  var sha: String
  var user: UserSummary
}

object BranchSummary {
  @scala.inline
  def apply(name: String, sha: String, user: UserSummary, repository: Repository = null): BranchSummary = {
    val __obj = js.Dynamic.literal(name = name, sha = sha, user = user)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[BranchSummary]
  }
}

