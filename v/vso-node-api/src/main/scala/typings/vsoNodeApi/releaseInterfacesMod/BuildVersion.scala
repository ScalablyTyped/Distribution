package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildVersion extends StObject {
  
  var commitMessage: String = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var sourceBranch: String = js.native
  
  /**
    * PullRequestId or Commit Id for the Pull Request for which the release will publish status
    */
  var sourcePullRequestId: String = js.native
  
  var sourceRepositoryId: String = js.native
  
  var sourceRepositoryType: String = js.native
  
  var sourceVersion: String = js.native
}
object BuildVersion {
  
  @scala.inline
  def apply(
    commitMessage: String,
    id: String,
    name: String,
    sourceBranch: String,
    sourcePullRequestId: String,
    sourceRepositoryId: String,
    sourceRepositoryType: String,
    sourceVersion: String
  ): BuildVersion = {
    val __obj = js.Dynamic.literal(commitMessage = commitMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceBranch = sourceBranch.asInstanceOf[js.Any], sourcePullRequestId = sourcePullRequestId.asInstanceOf[js.Any], sourceRepositoryId = sourceRepositoryId.asInstanceOf[js.Any], sourceRepositoryType = sourceRepositoryType.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildVersion]
  }
  
  @scala.inline
  implicit class BuildVersionMutableBuilder[Self <: BuildVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitMessage(value: String): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBranch(value: String): Self = StObject.set(x, "sourceBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePullRequestId(value: String): Self = StObject.set(x, "sourcePullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRepositoryId(value: String): Self = StObject.set(x, "sourceRepositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRepositoryType(value: String): Self = StObject.set(x, "sourceRepositoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
  }
}
