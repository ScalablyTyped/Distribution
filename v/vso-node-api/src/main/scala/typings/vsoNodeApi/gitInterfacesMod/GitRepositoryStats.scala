package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRepositoryStats extends js.Object {
  var activePullRequestsCount: Double
  var branchesCount: Double
  var commitsCount: Double
  var repositoryId: String
}

object GitRepositoryStats {
  @scala.inline
  def apply(activePullRequestsCount: Double, branchesCount: Double, commitsCount: Double, repositoryId: String): GitRepositoryStats = {
    val __obj = js.Dynamic.literal(activePullRequestsCount = activePullRequestsCount.asInstanceOf[js.Any], branchesCount = branchesCount.asInstanceOf[js.Any], commitsCount = commitsCount.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryStats]
  }
}

