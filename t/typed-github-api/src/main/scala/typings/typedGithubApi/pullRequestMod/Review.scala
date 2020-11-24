package typings.typedGithubApi.pullRequestMod

import typings.typedGithubApi.typedGithubApiStrings.APPROVED
import typings.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typings.typedGithubApi.typedGithubApiStrings.COMMENTED
import typings.typedGithubApi.typedGithubApiStrings.DISMISSED
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Review extends js.Object {
  
  var body: String = js.native
  
  var commit_id: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var pull_request_url: String = js.native
  
  var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED = js.native
  
  var user: UserSummary = js.native
}
object Review {
  
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    html_url: String,
    id: Double,
    pull_request_url: String,
    state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED,
    user: UserSummary
  ): Review = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Review]
  }
  
  @scala.inline
  implicit class ReviewOps[Self <: Review] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_id(value: String): Self = this.set("commit_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_request_url(value: String): Self = this.set("pull_request_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserSummary): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
