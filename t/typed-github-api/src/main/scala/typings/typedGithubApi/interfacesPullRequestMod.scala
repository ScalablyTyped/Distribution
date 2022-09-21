package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.interfacesBranchMod.BranchSummary
import typings.typedGithubApi.interfacesBranchMod.BranchSummaryWithRepository
import typings.typedGithubApi.interfacesIssueMod.Issue
import typings.typedGithubApi.interfacesIssueMod.IssueComment
import typings.typedGithubApi.interfacesMilestoneMod.Milestone
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.APPROVED
import typings.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typings.typedGithubApi.typedGithubApiStrings.COMMENTED
import typings.typedGithubApi.typedGithubApiStrings.DISMISSED
import typings.typedGithubApi.typedGithubApiStrings.admin
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesPullRequestMod {
  
  trait PullRequest
    extends StObject
       with PullRequestRef {
    
    var assignee: UserSummary | Null
    
    var assignees: js.Array[UserSummary]
    
    var base: BranchSummaryWithRepository
    
    var body: String
    
    var closedAt: js.UndefOr[Moment] = js.undefined
    
    var createdAt: Moment
    
    var createdBy: UserSummary
    
    var head: BranchSummary
    
    var htmlUri: String
    
    var id: Double
    
    def loadIssueAsync(): js.Promise[Issue]
    
    def loadReviewCommentsAsync(): js.Promise[js.Array[ReviewComment]]
    
    def loadReviewRequestsAsync(): js.Promise[ReviewRequests]
    
    def loadReviewsAsync(): js.Promise[js.Array[Review]]
    
    var locked: Boolean
    
    var mergedAt: js.UndefOr[Moment] = js.undefined
    
    var milestone: Milestone | Null
    
    var state: open | closed
    
    var title: String
    
    var updatedAt: Moment
  }
  object PullRequest {
    
    inline def apply(
      assignees: js.Array[UserSummary],
      base: BranchSummaryWithRepository,
      body: String,
      createdAt: Moment,
      createdBy: UserSummary,
      head: BranchSummary,
      htmlUri: String,
      id: Double,
      loadAsync: () => js.Promise[PullRequest | Null],
      loadIssueAsync: () => js.Promise[Issue],
      loadReviewCommentsAsync: () => js.Promise[js.Array[ReviewComment]],
      loadReviewRequestsAsync: () => js.Promise[ReviewRequests],
      loadReviewsAsync: () => js.Promise[js.Array[Review]],
      locked: Boolean,
      number: Double,
      state: open | closed,
      title: String,
      updatedAt: Moment
    ): PullRequest = {
      val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadIssueAsync = js.Any.fromFunction0(loadIssueAsync), loadReviewCommentsAsync = js.Any.fromFunction0(loadReviewCommentsAsync), loadReviewRequestsAsync = js.Any.fromFunction0(loadReviewRequestsAsync), loadReviewsAsync = js.Any.fromFunction0(loadReviewsAsync), locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], assignee = null, milestone = null)
      __obj.asInstanceOf[PullRequest]
    }
    
    extension [Self <: PullRequest](x: Self) {
      
      inline def setAssignee(value: UserSummary): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
      
      inline def setAssignees(value: js.Array[UserSummary]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
      
      inline def setAssigneesVarargs(value: UserSummary*): Self = StObject.set(x, "assignees", js.Array(value*))
      
      inline def setBase(value: BranchSummaryWithRepository): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setClosedAt(value: Moment): Self = StObject.set(x, "closedAt", value.asInstanceOf[js.Any])
      
      inline def setClosedAtUndefined: Self = StObject.set(x, "closedAt", js.undefined)
      
      inline def setCreatedAt(value: Moment): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedBy(value: UserSummary): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      inline def setHead(value: BranchSummary): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLoadIssueAsync(value: () => js.Promise[Issue]): Self = StObject.set(x, "loadIssueAsync", js.Any.fromFunction0(value))
      
      inline def setLoadReviewCommentsAsync(value: () => js.Promise[js.Array[ReviewComment]]): Self = StObject.set(x, "loadReviewCommentsAsync", js.Any.fromFunction0(value))
      
      inline def setLoadReviewRequestsAsync(value: () => js.Promise[ReviewRequests]): Self = StObject.set(x, "loadReviewRequestsAsync", js.Any.fromFunction0(value))
      
      inline def setLoadReviewsAsync(value: () => js.Promise[js.Array[Review]]): Self = StObject.set(x, "loadReviewsAsync", js.Any.fromFunction0(value))
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setMergedAt(value: Moment): Self = StObject.set(x, "mergedAt", value.asInstanceOf[js.Any])
      
      inline def setMergedAtUndefined: Self = StObject.set(x, "mergedAt", js.undefined)
      
      inline def setMilestone(value: Milestone): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
      
      inline def setMilestoneNull: Self = StObject.set(x, "milestone", null)
      
      inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: Moment): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait PullRequestRef extends StObject {
    
    def loadAsync(): js.Promise[PullRequest | Null]
    
    val number: Double
  }
  object PullRequestRef {
    
    inline def apply(loadAsync: () => js.Promise[PullRequest | Null], number: Double): PullRequestRef = {
      val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[PullRequestRef]
    }
    
    extension [Self <: PullRequestRef](x: Self) {
      
      inline def setLoadAsync(value: () => js.Promise[PullRequest | Null]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction0(value))
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait Review extends StObject {
    
    var body: String
    
    var commitSha: String
    
    var createdBy: UserSummary
    
    var htmlUri: String
    
    var id: Double
    
    var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED
  }
  object Review {
    
    inline def apply(
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
    
    extension [Self <: Review](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCommitSha(value: String): Self = StObject.set(x, "commitSha", value.asInstanceOf[js.Any])
      
      inline def setCreatedBy(value: UserSummary): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      inline def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setState(value: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReviewComment
    extends StObject
       with IssueComment {
    
    var diffHunk: String
    
    var position: Double
  }
  object ReviewComment {
    
    inline def apply(
      body: String,
      createdAt: Moment,
      createdBy: UserSummary,
      diffHunk: String,
      htmlUri: String,
      id: Double,
      position: Double,
      updatedAt: Moment
    ): ReviewComment = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], diffHunk = diffHunk.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReviewComment]
    }
    
    extension [Self <: ReviewComment](x: Self) {
      
      inline def setDiffHunk(value: String): Self = StObject.set(x, "diffHunk", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
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
    
    extension [Self <: ReviewRequests](x: Self) {
      
      inline def setTeams(value: js.Array[Team]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setTeamsVarargs(value: Team*): Self = StObject.set(x, "teams", js.Array(value*))
      
      inline def setUsers(value: js.Array[UserSummary]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: UserSummary*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  trait Team extends StObject {
    
    var description: String
    
    var id: Double
    
    var name: String
    
    var permission: admin
    
    var privacy: closed
    
    var slug: String
  }
  object Team {
    
    inline def apply(description: String, id: Double, name: String, slug: String): Team = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permission = "admin", privacy = "closed", slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Team]
    }
    
    extension [Self <: Team](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPermission(value: admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
      
      inline def setPrivacy(value: closed): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
}
