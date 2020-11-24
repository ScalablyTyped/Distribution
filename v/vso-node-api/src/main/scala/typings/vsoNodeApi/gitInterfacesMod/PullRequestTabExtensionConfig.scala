package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequestTabExtensionConfig extends js.Object {
  
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
  implicit class PullRequestTabExtensionConfigOps[Self <: PullRequestTabExtensionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPullRequestId(value: Double): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
  }
}
