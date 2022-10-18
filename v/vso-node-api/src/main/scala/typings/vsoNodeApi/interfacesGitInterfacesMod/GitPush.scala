package typings.vsoNodeApi.interfacesGitInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPush
  extends StObject
     with GitPushRef {
  
  var commits: js.Array[GitCommitRef]
  
  var refUpdates: js.Array[GitRefUpdate]
  
  var repository: GitRepository
}
object GitPush {
  
  inline def apply(
    _links: Any,
    commits: js.Array[GitCommitRef],
    date: js.Date,
    pushCorrelationId: String,
    pushId: Double,
    pushedBy: IdentityRef,
    refUpdates: js.Array[GitRefUpdate],
    repository: GitRepository,
    url: String
  ): GitPush = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], pushCorrelationId = pushCorrelationId.asInstanceOf[js.Any], pushId = pushId.asInstanceOf[js.Any], pushedBy = pushedBy.asInstanceOf[js.Any], refUpdates = refUpdates.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPush]
  }
  
  extension [Self <: GitPush](x: Self) {
    
    inline def setCommits(value: js.Array[GitCommitRef]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setCommitsVarargs(value: GitCommitRef*): Self = StObject.set(x, "commits", js.Array(value*))
    
    inline def setRefUpdates(value: js.Array[GitRefUpdate]): Self = StObject.set(x, "refUpdates", value.asInstanceOf[js.Any])
    
    inline def setRefUpdatesVarargs(value: GitRefUpdate*): Self = StObject.set(x, "refUpdates", js.Array(value*))
    
    inline def setRepository(value: GitRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
