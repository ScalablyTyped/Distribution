package typings
package typedDashGithubDashApiLib.distInterfacesBranchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchSummaryWithRepository extends BranchSummary {
  @JSName("repository")
  var repository_BranchSummaryWithRepository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository
}

object BranchSummaryWithRepository {
  @scala.inline
  def apply(
    name: java.lang.String,
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository,
    sha: java.lang.String,
    user: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  ): BranchSummaryWithRepository = {
    val __obj = js.Dynamic.literal(name = name, repository = repository, sha = sha, user = user)
  
    __obj.asInstanceOf[BranchSummaryWithRepository]
  }
}

