package typings.typedGithubApi.branchMod

import typings.typedGithubApi.repositoryMod.Repository
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BranchSummary extends js.Object {
  
  var label: String = js.native
  
  var ref: String = js.native
  
  var repo: Repository = js.native
  
  var sha: String = js.native
  
  var user: UserSummary = js.native
}
object BranchSummary {
  
  @scala.inline
  def apply(label: String, ref: String, repo: Repository, sha: String, user: UserSummary): BranchSummary = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchSummary]
  }
  
  @scala.inline
  implicit class BranchSummaryOps[Self <: BranchSummary] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: Repository): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserSummary): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
