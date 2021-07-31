package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRepositoryStats extends StObject {
  
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
  
  @scala.inline
  implicit class GitRepositoryStatsMutableBuilder[Self <: GitRepositoryStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivePullRequestsCount(value: Double): Self = StObject.set(x, "activePullRequestsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesCount(value: Double): Self = StObject.set(x, "branchesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitsCount(value: Double): Self = StObject.set(x, "commitsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
  }
}
