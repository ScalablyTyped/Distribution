package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludedGitCommit extends StObject {
  
  var commitId: String = js.native
  
  var commitTime: Date = js.native
  
  var parentCommitIds: js.Array[String] = js.native
  
  var repositoryId: String = js.native
}
object IncludedGitCommit {
  
  @scala.inline
  def apply(commitId: String, commitTime: Date, parentCommitIds: js.Array[String], repositoryId: String): IncludedGitCommit = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], commitTime = commitTime.asInstanceOf[js.Any], parentCommitIds = parentCommitIds.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludedGitCommit]
  }
  
  @scala.inline
  implicit class IncludedGitCommitMutableBuilder[Self <: IncludedGitCommit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTime(value: Date): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCommitIds(value: js.Array[String]): Self = StObject.set(x, "parentCommitIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCommitIdsVarargs(value: String*): Self = StObject.set(x, "parentCommitIds", js.Array(value :_*))
    
    @scala.inline
    def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
  }
}
