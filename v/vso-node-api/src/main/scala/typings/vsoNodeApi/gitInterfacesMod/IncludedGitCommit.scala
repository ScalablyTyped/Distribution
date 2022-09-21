package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludedGitCommit extends StObject {
  
  var commitId: String
  
  var commitTime: js.Date
  
  var parentCommitIds: js.Array[String]
  
  var repositoryId: String
}
object IncludedGitCommit {
  
  inline def apply(commitId: String, commitTime: js.Date, parentCommitIds: js.Array[String], repositoryId: String): IncludedGitCommit = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], commitTime = commitTime.asInstanceOf[js.Any], parentCommitIds = parentCommitIds.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludedGitCommit]
  }
  
  extension [Self <: IncludedGitCommit](x: Self) {
    
    inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setCommitTime(value: js.Date): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    inline def setParentCommitIds(value: js.Array[String]): Self = StObject.set(x, "parentCommitIds", value.asInstanceOf[js.Any])
    
    inline def setParentCommitIdsVarargs(value: String*): Self = StObject.set(x, "parentCommitIds", js.Array(value*))
    
    inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
  }
}
