package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(activePullRequestsCount = activePullRequestsCount, branchesCount = branchesCount, commitsCount = commitsCount, repositoryId = repositoryId)
  
    __obj.asInstanceOf[GitRepositoryStats]
  }
}

