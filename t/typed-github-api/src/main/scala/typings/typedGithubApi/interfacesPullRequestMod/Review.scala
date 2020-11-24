package typings.typedGithubApi.interfacesPullRequestMod

import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.APPROVED
import typings.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typings.typedGithubApi.typedGithubApiStrings.COMMENTED
import typings.typedGithubApi.typedGithubApiStrings.DISMISSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Review extends js.Object {
  
  var body: String = js.native
  
  var commitSha: String = js.native
  
  var createdBy: UserSummary = js.native
  
  var htmlUri: String = js.native
  
  var id: Double = js.native
  
  var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED = js.native
}
object Review {
  
  @scala.inline
  def apply(
    body: String,
    commitSha: String,
    createdBy: UserSummary,
    htmlUri: String,
    id: Double,
    state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED
  ): Review = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commitSha = commitSha.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
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
    def setCommitSha(value: String): Self = this.set("commitSha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: UserSummary): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUri(value: String): Self = this.set("htmlUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
