package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullRequestTabExtensionConfig extends StObject {
  
  var pullRequestId: Double
  
  var repositoryId: String
}
object PullRequestTabExtensionConfig {
  
  inline def apply(pullRequestId: Double, repositoryId: String): PullRequestTabExtensionConfig = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestTabExtensionConfig]
  }
  
  extension [Self <: PullRequestTabExtensionConfig](x: Self) {
    
    inline def setPullRequestId(value: Double): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
  }
}
