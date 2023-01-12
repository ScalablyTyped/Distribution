package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildVersion extends StObject {
  
  var commitMessage: String
  
  var id: String
  
  var name: String
  
  var sourceBranch: String
  
  /**
    * PullRequestId or Commit Id for the Pull Request for which the release will publish status
    */
  var sourcePullRequestId: String
  
  var sourceRepositoryId: String
  
  var sourceRepositoryType: String
  
  var sourceVersion: String
}
object BuildVersion {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: BuildVersion] (val x: Self) extends AnyVal {
    
    inline def setCommitMessage(value: String): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceBranch(value: String): Self = StObject.set(x, "sourceBranch", value.asInstanceOf[js.Any])
    
    inline def setSourcePullRequestId(value: String): Self = StObject.set(x, "sourcePullRequestId", value.asInstanceOf[js.Any])
    
    inline def setSourceRepositoryId(value: String): Self = StObject.set(x, "sourceRepositoryId", value.asInstanceOf[js.Any])
    
    inline def setSourceRepositoryType(value: String): Self = StObject.set(x, "sourceRepositoryType", value.asInstanceOf[js.Any])
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
  }
}
