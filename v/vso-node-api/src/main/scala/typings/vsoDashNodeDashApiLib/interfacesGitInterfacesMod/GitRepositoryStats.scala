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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activePullRequestsCount")(activePullRequestsCount)
    __obj.updateDynamic("branchesCount")(branchesCount)
    __obj.updateDynamic("commitsCount")(commitsCount)
    __obj.updateDynamic("repositoryId")(repositoryId)
    __obj.asInstanceOf[GitRepositoryStats]
  }
}

