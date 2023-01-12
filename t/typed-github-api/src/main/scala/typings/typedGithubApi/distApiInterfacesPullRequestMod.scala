package typings.typedGithubApi

import typings.typedGithubApi.distApiInterfacesBranchMod.BranchSummary
import typings.typedGithubApi.distApiInterfacesIssueMod.IssueComment
import typings.typedGithubApi.distApiInterfacesMilestoneMod.Milestone
import typings.typedGithubApi.distApiInterfacesTeamMod.Team
import typings.typedGithubApi.distApiInterfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.APPROVED
import typings.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typings.typedGithubApi.typedGithubApiStrings.COMMENTED
import typings.typedGithubApi.typedGithubApiStrings.DISMISSED
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiInterfacesPullRequestMod {
  
  trait PullRequest extends StObject {
    
    var assignee: UserSummary | Null
    
    var assignees: js.Array[UserSummary]
    
    var base: BranchSummary
    
    var body: String
    
    var closed_at: js.Date | Null
    
    var comments_url: String
    
    var commits_url: String
    
    var created_at: js.Date
    
    var head: BranchSummary
    
    var html_url: String
    
    var id: Double
    
    var issue_url: String
    
    var locked: Boolean
    
    var merged_at: js.Date | Null
    
    var milestone: Milestone | Null
    
    var number: Double
    
    var review_comment_url: String
    
    var review_comments_url: String
    
    var state: open | closed
    
    var statuses_url: String
    
    var title: String
    
    var updated_at: js.Date
    
    var url: String
    
    var user: UserSummary
  }
  object PullRequest {
    
    inline def apply(
      assignees: js.Array[UserSummary],
      base: BranchSummary,
      body: String,
      comments_url: String,
      commits_url: String,
      created_at: js.Date,
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
      updated_at: js.Date,
      url: String,
      user: UserSummary
    ): PullRequest = {
      val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], assignee = null, closed_at = null, merged_at = null, milestone = null)
      __obj.asInstanceOf[PullRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PullRequest] (val x: Self) extends AnyVal {
      
      inline def setAssignee(value: UserSummary): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
      
      inline def setAssignees(value: js.Array[UserSummary]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
      
      inline def setAssigneesVarargs(value: UserSummary*): Self = StObject.set(x, "assignees", js.Array(value*))
      
      inline def setBase(value: BranchSummary): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setClosed_at(value: js.Date): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
      
      inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
      
      inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
      
      inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setHead(value: BranchSummary): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIssue_url(value: String): Self = StObject.set(x, "issue_url", value.asInstanceOf[js.Any])
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setMerged_at(value: js.Date): Self = StObject.set(x, "merged_at", value.asInstanceOf[js.Any])
      
      inline def setMerged_atNull: Self = StObject.set(x, "merged_at", null)
      
      inline def setMilestone(value: Milestone): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
      
      inline def setMilestoneNull: Self = StObject.set(x, "milestone", null)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setReview_comment_url(value: String): Self = StObject.set(x, "review_comment_url", value.asInstanceOf[js.Any])
      
      inline def setReview_comments_url(value: String): Self = StObject.set(x, "review_comments_url", value.asInstanceOf[js.Any])
      
      inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: js.Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser(value: UserSummary): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait Review extends StObject {
    
    var body: String
    
    var commit_id: String
    
    var html_url: String
    
    var id: Double
    
    var pull_request_url: String
    
    var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED
    
    var user: UserSummary
  }
  object Review {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Review] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
      
      inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPull_request_url(value: String): Self = StObject.set(x, "pull_request_url", value.asInstanceOf[js.Any])
      
      inline def setState(value: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUser(value: UserSummary): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReviewComment
    extends StObject
       with IssueComment {
    
    var commit_id: String
    
    var diff_hunk: String
    
    var original_commit_id: String
    
    var original_position: Double
    
    var path: String
    
    var position: Double
    
    var pull_request_review_id: Double
    
    var pull_request_url: String
  }
  object ReviewComment {
    
    inline def apply(
      body: String,
      commit_id: String,
      created_at: js.Date,
      diff_hunk: String,
      html_url: String,
      id: Double,
      original_commit_id: String,
      original_position: Double,
      path: String,
      position: Double,
      pull_request_review_id: Double,
      pull_request_url: String,
      updated_at: js.Date,
      url: String,
      user: UserSummary
    ): ReviewComment = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_hunk = diff_hunk.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], original_commit_id = original_commit_id.asInstanceOf[js.Any], original_position = original_position.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_request_review_id = pull_request_review_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReviewComment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReviewComment] (val x: Self) extends AnyVal {
      
      inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
      
      inline def setDiff_hunk(value: String): Self = StObject.set(x, "diff_hunk", value.asInstanceOf[js.Any])
      
      inline def setOriginal_commit_id(value: String): Self = StObject.set(x, "original_commit_id", value.asInstanceOf[js.Any])
      
      inline def setOriginal_position(value: Double): Self = StObject.set(x, "original_position", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPull_request_review_id(value: Double): Self = StObject.set(x, "pull_request_review_id", value.asInstanceOf[js.Any])
      
      inline def setPull_request_url(value: String): Self = StObject.set(x, "pull_request_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReviewRequests extends StObject {
    
    var teams: js.Array[Team]
    
    var users: js.Array[UserSummary]
  }
  object ReviewRequests {
    
    inline def apply(teams: js.Array[Team], users: js.Array[UserSummary]): ReviewRequests = {
      val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReviewRequests]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReviewRequests] (val x: Self) extends AnyVal {
      
      inline def setTeams(value: js.Array[Team]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setTeamsVarargs(value: Team*): Self = StObject.set(x, "teams", js.Array(value*))
      
      inline def setUsers(value: js.Array[UserSummary]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: UserSummary*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
}
