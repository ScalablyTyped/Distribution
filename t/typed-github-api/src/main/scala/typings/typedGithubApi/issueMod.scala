package typings.typedGithubApi

import typings.std.Date
import typings.typedGithubApi.labelMod.Label
import typings.typedGithubApi.milestoneMod.Milestone
import typings.typedGithubApi.repositoryMod.Repository
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import typings.typedGithubApi.userMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueMod {
  
  trait Issue extends StObject {
    
    var assignee: UserSummary | Null
    
    var assignees: js.Array[UserSummary]
    
    var body: String
    
    var closed_at: Date | Null
    
    var closed_by: UserSummary | Null
    
    var comments: Double
    
    var comments_url: String
    
    var created_at: Date
    
    var events_url: String
    
    var html_url: String
    
    var id: Double
    
    var labels: js.Array[Label]
    
    var labels_url: String
    
    var locked: Boolean
    
    var milestone: Milestone | Null
    
    var number: Double
    
    var pull_request: js.UndefOr[PullRequestExtension] = js.undefined
    
    var repository: js.UndefOr[Repository] = js.undefined
    
    var repository_url: String
    
    var state: open | closed
    
    var title: String
    
    var updated_at: Date
    
    var url: String
    
    var user: UserSummary
  }
  object Issue {
    
    @scala.inline
    def apply(
      assignees: js.Array[UserSummary],
      body: String,
      comments: Double,
      comments_url: String,
      created_at: Date,
      events_url: String,
      html_url: String,
      id: Double,
      labels: js.Array[Label],
      labels_url: String,
      locked: Boolean,
      number: Double,
      repository_url: String,
      state: open | closed,
      title: String,
      updated_at: Date,
      url: String,
      user: UserSummary
    ): Issue = {
      val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], assignee = null, closed_at = null, closed_by = null, milestone = null)
      __obj.asInstanceOf[Issue]
    }
    
    @scala.inline
    implicit class IssueMutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignee(value: UserSummary): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneeNull: Self = StObject.set(x, "assignee", null)
      
      @scala.inline
      def setAssignees(value: js.Array[UserSummary]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneesVarargs(value: UserSummary*): Self = StObject.set(x, "assignees", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed_at(value: Date): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
      
      @scala.inline
      def setClosed_by(value: UserSummary): Self = StObject.set(x, "closed_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed_byNull: Self = StObject.set(x, "closed_by", null)
      
      @scala.inline
      def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestone(value: Milestone): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneNull: Self = StObject.set(x, "milestone", null)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPull_request(value: PullRequestExtension): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPull_requestUndefined: Self = StObject.set(x, "pull_request", js.undefined)
      
      @scala.inline
      def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_at(value: Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserSummary): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait IssueComment extends StObject {
    
    var body: String
    
    var created_at: Date
    
    var html_url: String
    
    var id: Double
    
    var updated_at: Date
    
    var url: String
    
    var user: UserSummary
  }
  object IssueComment {
    
    @scala.inline
    def apply(
      body: String,
      created_at: Date,
      html_url: String,
      id: Double,
      updated_at: Date,
      url: String,
      user: UserSummary
    ): IssueComment = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueComment]
    }
    
    @scala.inline
    implicit class IssueCommentMutableBuilder[Self <: IssueComment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_at(value: Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserSummary): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait PullRequestExtension extends StObject {
    
    var diff_url: String
    
    var html_url: String
    
    var patch_url: String
    
    var url: String
  }
  object PullRequestExtension {
    
    @scala.inline
    def apply(diff_url: String, html_url: String, patch_url: String, url: String): PullRequestExtension = {
      val __obj = js.Dynamic.literal(diff_url = diff_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PullRequestExtension]
    }
    
    @scala.inline
    implicit class PullRequestExtensionMutableBuilder[Self <: PullRequestExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
