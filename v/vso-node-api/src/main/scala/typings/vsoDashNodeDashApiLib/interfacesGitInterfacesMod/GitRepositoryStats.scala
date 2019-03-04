package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRepositoryStats extends js.Object {
  var activePullRequestsCount: scala.Double
  var branchesCount: scala.Double
  var commitsCount: scala.Double
  var repositoryId: java.lang.String
}

object GitRepositoryStats {
  @scala.inline
  def apply(
    activePullRequestsCount: scala.Double,
    branchesCount: scala.Double,
    commitsCount: scala.Double,
    repositoryId: java.lang.String
  ): GitRepositoryStats = {
    val __obj = js.Dynamic.literal(activePullRequestsCount = activePullRequestsCount, branchesCount = branchesCount, commitsCount = commitsCount, repositoryId = repositoryId)
  
    __obj.asInstanceOf[GitRepositoryStats]
  }
}

