package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.distIssueMod.IssueCommentClass
import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesBranchMod.BranchSummary
import typings.typedGithubApi.interfacesBranchMod.BranchSummaryWithRepository
import typings.typedGithubApi.interfacesIssueMod.Issue
import typings.typedGithubApi.interfacesMilestoneMod.Milestone
import typings.typedGithubApi.interfacesPullRequestMod.PullRequest
import typings.typedGithubApi.interfacesPullRequestMod.Review
import typings.typedGithubApi.interfacesPullRequestMod.ReviewComment
import typings.typedGithubApi.interfacesPullRequestMod.ReviewRequests
import typings.typedGithubApi.interfacesPullRequestMod.Team
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.APPROVED
import typings.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typings.typedGithubApi.typedGithubApiStrings.COMMENTED
import typings.typedGithubApi.typedGithubApiStrings.DISMISSED
import typings.typedGithubApi.typedGithubApiStrings.admin
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/pull-request", JSImport.Namespace)
@js.native
object distPullRequestMod extends js.Object {
  @js.native
  class PullRequestClass protected ()
    extends GitHubRef
       with PullRequest {
    def this(data: typings.typedGithubApi.pullRequestMod.PullRequest, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var assignee: UserSummary | Null = js.native
    /* CompleteClass */
    override var assignees: js.Array[UserSummary] = js.native
    /* CompleteClass */
    override var base: BranchSummaryWithRepository = js.native
    /* CompleteClass */
    override var body: String = js.native
    /* CompleteClass */
    override var createdAt: Moment = js.native
    /* CompleteClass */
    override var createdBy: UserSummary = js.native
    /* CompleteClass */
    override var head: BranchSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    var issueUri: js.Any = js.native
    /* CompleteClass */
    override var locked: Boolean = js.native
    /* CompleteClass */
    override var milestone: Milestone | Null = js.native
    /* CompleteClass */
    override val number: Double = js.native
    var reviewCommentsUri: js.Any = js.native
    /* CompleteClass */
    override var state: open | closed = js.native
    /* CompleteClass */
    override var title: String = js.native
    /* CompleteClass */
    override var updatedAt: Moment = js.native
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
  }
  
  @js.native
  class ReviewClass protected ()
    extends GitHubRef
       with Review {
    def this(data: typings.typedGithubApi.pullRequestMod.Review, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var body: String = js.native
    /* CompleteClass */
    override var commitSha: String = js.native
    /* CompleteClass */
    override var createdBy: UserSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedGithubApi.interfacesIssueMod.IssueComment because Already inherited
  - typings.typedGithubApi.interfacesPullRequestMod.ReviewComment because var conflicts: body, createdAt, createdBy, htmlUri, id, updatedAt. Inlined diffHunk, position */ @js.native
  class ReviewCommentClass protected () extends IssueCommentClass {
    def this(data: typings.typedGithubApi.pullRequestMod.ReviewComment, options: OptionsOrRef) = this()
    var diffHunk: String = js.native
    var position: Double = js.native
  }
  
  @js.native
  class TeamClass protected ()
    extends GitHubRef
       with Team {
    def this(data: typings.typedGithubApi.teamMod.Team, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var description: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var permission: admin = js.native
    /* CompleteClass */
    override var privacy: closed = js.native
    /* CompleteClass */
    override var slug: String = js.native
  }
  
}

