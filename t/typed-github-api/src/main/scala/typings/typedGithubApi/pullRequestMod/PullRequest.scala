package typings.typedGithubApi.pullRequestMod

import typings.std.Date
import typings.typedGithubApi.branchMod.BranchSummary
import typings.typedGithubApi.milestoneMod.Milestone
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequest extends js.Object {
  
  var assignee: UserSummary | Null = js.native
  
  var assignees: js.Array[UserSummary] = js.native
  
  var base: BranchSummary = js.native
  
  var body: String = js.native
  
  var closed_at: Date | Null = js.native
  
  var comments_url: String = js.native
  
  var commits_url: String = js.native
  
  var created_at: Date = js.native
  
  var head: BranchSummary = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var issue_url: String = js.native
  
  var locked: Boolean = js.native
  
  var merged_at: Date | Null = js.native
  
  var milestone: Milestone | Null = js.native
  
  var number: Double = js.native
  
  var review_comment_url: String = js.native
  
  var review_comments_url: String = js.native
  
  var state: open | closed = js.native
  
  var statuses_url: String = js.native
  
  var title: String = js.native
  
  var updated_at: Date = js.native
  
  var url: String = js.native
  
  var user: UserSummary = js.native
}
object PullRequest {
  
  @scala.inline
  def apply(
    assignees: js.Array[UserSummary],
    base: BranchSummary,
    body: String,
    comments_url: String,
    commits_url: String,
    created_at: Date,
    head: BranchSummary,
    html_url: String,
    id: Double,
    issue_url: String,
    locked: Boolean,
    number: Double,
    review_comment_url: String,
    review_comments_url: String,
    state: open | closed,
    statuses_url: String,
    title: String,
    updated_at: Date,
    url: String,
    user: UserSummary
  ): PullRequest = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequest]
  }
  
  @scala.inline
  implicit class PullRequestOps[Self <: PullRequest] (val x: Self) extends AnyVal {
    
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
    def setAssigneesVarargs(value: UserSummary*): Self = this.set("assignees", js.Array(value :_*))
    
    @scala.inline
    def setAssignees(value: js.Array[UserSummary]): Self = this.set("assignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: BranchSummary): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_url(value: String): Self = this.set("comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits_url(value: String): Self = this.set("commits_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead(value: BranchSummary): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue_url(value: String): Self = this.set("issue_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_comment_url(value: String): Self = this.set("review_comment_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_comments_url(value: String): Self = this.set("review_comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: open | closed): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuses_url(value: String): Self = this.set("statuses_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: Date): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserSummary): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignee(value: UserSummary): Self = this.set("assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeNull: Self = this.set("assignee", null)
    
    @scala.inline
    def setClosed_at(value: Date): Self = this.set("closed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed_atNull: Self = this.set("closed_at", null)
    
    @scala.inline
    def setMerged_at(value: Date): Self = this.set("merged_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerged_atNull: Self = this.set("merged_at", null)
    
    @scala.inline
    def setMilestone(value: Milestone): Self = this.set("milestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestoneNull: Self = this.set("milestone", null)
  }
}
