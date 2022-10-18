package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distGithubRefMod.OptionsOrRef
import typings.typedGithubApi.distInterfacesBranchMod.BranchSummary
import typings.typedGithubApi.distInterfacesBranchMod.BranchSummaryWithRepository
import typings.typedGithubApi.distInterfacesIssueMod.Issue
import typings.typedGithubApi.distInterfacesMilestoneMod.Milestone
import typings.typedGithubApi.distInterfacesPullRequestMod.PullRequest
import typings.typedGithubApi.distInterfacesPullRequestMod.Review
import typings.typedGithubApi.distInterfacesPullRequestMod.ReviewComment
import typings.typedGithubApi.distInterfacesPullRequestMod.ReviewRequests
import typings.typedGithubApi.distInterfacesPullRequestMod.Team
import typings.typedGithubApi.distInterfacesUserMod.UserSummary
import typings.typedGithubApi.distIssueMod.IssueCommentClass
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

object distPullRequestMod {
  
  @JSImport("typed-github-api/dist/pull-request", "PullRequestClass")
  @js.native
  open class PullRequestClass protected ()
    extends GitHubRef
       with PullRequest {
    def this(data: typings.typedGithubApi.distApiInterfacesPullRequestMod.PullRequest, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var assignee: UserSummary | Null = js.native
    
    /* CompleteClass */
    var assignees: js.Array[UserSummary] = js.native
    
    /* CompleteClass */
    var base: BranchSummaryWithRepository = js.native
    
    /* CompleteClass */
    var body: String = js.native
    
    /* CompleteClass */
    var createdAt: Moment = js.native
    
    /* CompleteClass */
    var createdBy: UserSummary = js.native
    
    /* CompleteClass */
    var head: BranchSummary = js.native
    
    /* CompleteClass */
    var htmlUri: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* private */ var issueUri: Any = js.native
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[PullRequest | Null] = js.native
    
    /* CompleteClass */
    override def loadIssueAsync(): js.Promise[Issue] = js.native
    
    /* CompleteClass */
    override def loadReviewCommentsAsync(): js.Promise[js.Array[ReviewComment]] = js.native
    
    /* CompleteClass */
    override def loadReviewRequestsAsync(): js.Promise[ReviewRequests] = js.native
    
    /* CompleteClass */
    override def loadReviewsAsync(): js.Promise[js.Array[Review]] = js.native
    
    /* CompleteClass */
    var locked: Boolean = js.native
    
    /* CompleteClass */
    var milestone: Milestone | Null = js.native
    
    /* CompleteClass */
    override val number: Double = js.native
    
    /* private */ var reviewCommentsUri: Any = js.native
    
    /* CompleteClass */
    var state: open | closed = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /* CompleteClass */
    var updatedAt: Moment = js.native
  }
  
  @JSImport("typed-github-api/dist/pull-request", "ReviewClass")
  @js.native
  open class ReviewClass protected ()
    extends GitHubRef
       with Review {
    def this(data: typings.typedGithubApi.distApiInterfacesPullRequestMod.Review, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var body: String = js.native
    
    /* CompleteClass */
    var commitSha: String = js.native
    
    /* CompleteClass */
    var createdBy: UserSummary = js.native
    
    /* CompleteClass */
    var htmlUri: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.distInterfacesIssueMod.IssueComment because Already inherited
  - typings.typedGithubApi.distInterfacesPullRequestMod.ReviewComment because var conflicts: body, createdAt, createdBy, htmlUri, id, updatedAt. Inlined diffHunk, position */ @JSImport("typed-github-api/dist/pull-request", "ReviewCommentClass")
  @js.native
  open class ReviewCommentClass protected () extends IssueCommentClass {
    def this(data: typings.typedGithubApi.distApiInterfacesPullRequestMod.ReviewComment, options: OptionsOrRef) = this()
    
    var diffHunk: String = js.native
    
    var position: Double = js.native
  }
  
  @JSImport("typed-github-api/dist/pull-request", "TeamClass")
  @js.native
  open class TeamClass protected ()
    extends GitHubRef
       with Team {
    def this(data: typings.typedGithubApi.distApiInterfacesTeamMod.Team, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var permission: admin = js.native
    
    /* CompleteClass */
    var privacy: closed = js.native
    
    /* CompleteClass */
    var slug: String = js.native
  }
}
