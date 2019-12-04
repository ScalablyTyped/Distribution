package typings.typedDashGithubDashApi

import typings.moment.momentMod.Moment
import typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typings.typedDashGithubDashApi.distInterfacesBranchMod.BranchSummary
import typings.typedDashGithubDashApi.distInterfacesBranchMod.BranchSummaryWithRepository
import typings.typedDashGithubDashApi.distInterfacesIssueMod.Issue
import typings.typedDashGithubDashApi.distInterfacesMilestoneMod.Milestone
import typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod.PullRequest
import typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod.Review
import typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod.ReviewComment
import typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod.ReviewRequests
import typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod.Team
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.distIssueMod.IssueCommentClass
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.APPROVED
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.CHANGES_REQUESTED
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.COMMENTED
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.DISMISSED
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.admin
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/pull-request", JSImport.Namespace)
@js.native
object distPullDashRequestMod extends js.Object {
  @js.native
  class PullRequestClass protected ()
    extends GitHubRef
       with PullRequest {
    def this(
      data: typings.typedDashGithubDashApi.distApiDashInterfacesPullDashRequestMod.PullRequest,
      options: OptionsOrRef
    ) = this()
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
    def this(
      data: typings.typedDashGithubDashApi.distApiDashInterfacesPullDashRequestMod.Review,
      options: OptionsOrRef
    ) = this()
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
  - typings.typedDashGithubDashApi.distInterfacesIssueMod.IssueComment because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod.ReviewComment because var conflicts: body, createdAt, createdBy, htmlUri, id, updatedAt. Inlined diffHunk, position */ @js.native
  class ReviewCommentClass protected () extends IssueCommentClass {
    def this(
      data: typings.typedDashGithubDashApi.distApiDashInterfacesPullDashRequestMod.ReviewComment,
      options: OptionsOrRef
    ) = this()
    var diffHunk: String = js.native
    var position: Double = js.native
  }
  
  @js.native
  class TeamClass protected ()
    extends GitHubRef
       with Team {
    def this(data: typings.typedDashGithubDashApi.distApiDashInterfacesTeamMod.Team, options: OptionsOrRef) = this()
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

