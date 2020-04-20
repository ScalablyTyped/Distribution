package typings.typedGithubApi.interfacesBranchMod

import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchSummaryWithRepository extends BranchSummary {
  @JSName("repository")
  var repository_BranchSummaryWithRepository: Repository
}

object BranchSummaryWithRepository {
  @scala.inline
  def apply(name: String, repository: Repository, sha: String, user: UserSummary): BranchSummaryWithRepository = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchSummaryWithRepository]
  }
}

