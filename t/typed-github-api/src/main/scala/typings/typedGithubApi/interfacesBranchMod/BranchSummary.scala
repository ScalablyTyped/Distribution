package typings.typedGithubApi.interfacesBranchMod

import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesUserMod.UserSummary
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchSummary]
  }
}

