package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequestTabExtensionConfig extends StObject {
  
  var pullRequestId: Double = js.native
  
  var repositoryId: String = js.native
}
object PullRequestTabExtensionConfig {
  
  @scala.inline
  def apply(pullRequestId: Double, repositoryId: String): PullRequestTabExtensionConfig = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestTabExtensionConfig]
  }
  
  @scala.inline
  implicit class PullRequestTabExtensionConfigMutableBuilder[Self <: PullRequestTabExtensionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequestId(value: Double): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
  }
}
