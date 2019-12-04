package typings.typedDashGithubDashApi

import typings.moment.momentMod.Duration
import typings.moment.momentMod.Moment
import typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typings.typedDashGithubDashApi.distInterfacesIssueMod.Issue
import typings.typedDashGithubDashApi.distInterfacesIssueMod.IssueComment
import typings.typedDashGithubDashApi.distInterfacesLabelMod.Label
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/issue", JSImport.Namespace)
@js.native
object distIssueMod extends js.Object {
  @js.native
  class IssueClass protected ()
    extends GitHubRef
       with Issue {
    def this(data: typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue, options: OptionsOrRef) = this()
    /* CompleteClass */
    override val age: Duration = js.native
    /* CompleteClass */
    override var assignees: js.Array[UserSummary] = js.native
    /* CompleteClass */
    override var body: String = js.native
    /* CompleteClass */
    override var comments: Double = js.native
    /* CompleteClass */
    override var created: Moment = js.native
    /* CompleteClass */
    override var createdBy: UserSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override val isOpen: Boolean = js.native
    /* CompleteClass */
    override var isPullRequest: Boolean = js.native
    /* CompleteClass */
    override var labels: js.Array[Label] = js.native
    /* CompleteClass */
    override var locked: Boolean = js.native
    /* CompleteClass */
    override val number: Double = js.native
    var repository: js.Any = js.native
    var repositoryUri: js.Any = js.native
    /* CompleteClass */
    override var state: open | closed = js.native
    /* CompleteClass */
    override var title: String = js.native
    /* CompleteClass */
    override var updated: Moment = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Issue | Null] = js.native
    /* CompleteClass */
    override def loadRepositoryAsync(): js.Promise[Repository] = js.native
    /* CompleteClass */
    override def wasOpen(when: Moment): Boolean = js.native
  }
  
  @js.native
  class IssueCommentClass protected ()
    extends GitHubRef
       with IssueComment {
    def this(
      data: typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod.IssueComment,
      options: OptionsOrRef
    ) = this()
    /* CompleteClass */
    override var body: String = js.native
    /* CompleteClass */
    override var createdAt: Moment = js.native
    /* CompleteClass */
    override var createdBy: UserSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var updatedAt: Moment = js.native
  }
  
}

