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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesPullRequestMod {
  
  @js.native
  trait PullRequest extends PullRequestRef {
    
    var assignee: UserSummary | Null = js.native
    
    var assignees: js.Array[UserSummary] = js.native
    
    var base: BranchSummaryWithRepository = js.native
    
    var body: String = js.native
    
    var closedAt: js.UndefOr[Moment] = js.native
    
    var createdAt: Moment = js.native
    
    var createdBy: UserSummary = js.native
    
    var head: BranchSummary = js.native
    
    var htmlUri: String = js.native
    
    var id: Double = js.native
    
    def loadIssueAsync(): js.Promise[Issue] = js.native
    
    def loadReviewCommentsAsync(): js.Promise[js.Array[ReviewComment]] = js.native
    
    def loadReviewRequestsAsync(): js.Promise[ReviewRequests] = js.native
    
    def loadReviewsAsync(): js.Promise[js.Array[Review]] = js.native
    
    var locked: Boolean = js.native
    
    var mergedAt: js.UndefOr[Moment] = js.native
    
    var milestone: Milestone | Null = js.native
    
    var state: open | closed = js.native
    
    var title: String = js.native
    
    var updatedAt: Moment = js.native
  }
  object PullRequest {
    
    @scala.inline
    def apply(
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
      val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadIssueAsync = js.Any.fromFunction0(loadIssueAsync), loadReviewCommentsAsync = js.Any.fromFunction0(loadReviewCommentsAsync), loadReviewRequestsAsync = js.Any.fromFunction0(loadReviewRequestsAsync), loadReviewsAsync = js.Any.fromFunction0(loadReviewsAsync), locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[PullRequest]
    }
    
    @scala.inline
    implicit class PullRequestMutableBuilder[Self <: PullRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignee(value: UserSummary): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneeNull: Self = StObject.set(x, "assignee", null)
      
      @scala.inline
      def setAssignees(value: js.Array[UserSummary]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneesVarargs(value: UserSummary*): Self = StObject.set(x, "assignees", js.Array(value :_*))
      
      @scala.inline
      def setBase(value: BranchSummaryWithRepository): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedAt(value: Moment): Self = StObject.set(x, "closedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedAtUndefined: Self = StObject.set(x, "closedAt", js.undefined)
      
      @scala.inline
      def setCreatedAt(value: Moment): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedBy(value: UserSummary): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: BranchSummary): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadIssueAsync(value: () => js.Promise[Issue]): Self = StObject.set(x, "loadIssueAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadReviewCommentsAsync(value: () => js.Promise[js.Array[ReviewComment]]): Self = StObject.set(x, "loadReviewCommentsAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadReviewRequestsAsync(value: () => js.Promise[ReviewRequests]): Self = StObject.set(x, "loadReviewRequestsAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadReviewsAsync(value: () => js.Promise[js.Array[Review]]): Self = StObject.set(x, "loadReviewsAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergedAt(value: Moment): Self = StObject.set(x, "mergedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergedAtUndefined: Self = StObject.set(x, "mergedAt", js.undefined)
      
      @scala.inline
      def setMilestone(value: Milestone): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneNull: Self = StObject.set(x, "milestone", null)
      
      @scala.inline
      def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: Moment): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PullRequestRef extends StObject {
    
    def loadAsync(): js.Promise[PullRequest | Null] = js.native
    
    val number: Double = js.native
  }
  object PullRequestRef {
    
    @scala.inline
    def apply(loadAsync: () => js.Promise[PullRequest | Null], number: Double): PullRequestRef = {
      val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[PullRequestRef]
    }
    
    @scala.inline
    implicit class PullRequestRefMutableBuilder[Self <: PullRequestRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadAsync(value: () => js.Promise[PullRequest | Null]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Review extends StObject {
    
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
    implicit class ReviewMutableBuilder[Self <: Review] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitSha(value: String): Self = StObject.set(x, "commitSha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedBy(value: UserSummary): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReviewComment extends IssueComment {
    
    var diffHunk: String = js.native
    
    var position: Double = js.native
  }
  object ReviewComment {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ReviewCommentMutableBuilder[Self <: ReviewComment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiffHunk(value: String): Self = StObject.set(x, "diffHunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReviewRequests extends StObject {
    
    var teams: js.Array[Team] = js.native
    
    var users: js.Array[UserSummary] = js.native
  }
  object ReviewRequests {
    
    @scala.inline
    def apply(teams: js.Array[Team], users: js.Array[UserSummary]): ReviewRequests = {
      val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReviewRequests]
    }
    
    @scala.inline
    implicit class ReviewRequestsMutableBuilder[Self <: ReviewRequests] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTeams(value: js.Array[Team]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamsVarargs(value: Team*): Self = StObject.set(x, "teams", js.Array(value :_*))
      
      @scala.inline
      def setUsers(value: js.Array[UserSummary]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: UserSummary*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Team extends StObject {
    
    var description: String = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var permission: admin = js.native
    
    var privacy: closed = js.native
    
    var slug: String = js.native
  }
  object Team {
    
    @scala.inline
    def apply(description: String, id: Double, name: String, permission: admin, privacy: closed, slug: String): Team = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Team]
    }
    
    @scala.inline
    implicit class TeamMutableBuilder[Self <: Team] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermission(value: admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivacy(value: closed): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
}
