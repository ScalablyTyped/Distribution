package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestIteration extends js.Object {
  /**
    * A collection of related REST reference links.
    */
  var _links: js.Any
  /**
    * Author of the pull request iteration.
    */
  var author: IdentityRef
  /**
    * Changes included with the pull request iteration.
    */
  var changeList: js.Array[GitPullRequestChange]
  /**
    * The commits included with the pull request iteration.
    */
  var commits: js.Array[GitCommitRef]
  /**
    * The first common Git commit of the source and target refs.
    */
  var commonRefCommit: GitCommitRef
  /**
    * The creation date of the pull request iteration.
    */
  var createdDate: Date
  /**
    * Description of the pull request iteration.
    */
  var description: String
  /**
    * Indicates if the Commits property contains a truncated list of commits in this pull request iteration.
    */
  var hasMoreCommits: Boolean
  /**
    * ID of the pull request iteration. Iterations are created as a result of creating and pushing updates to a pull request.
    */
  var id: Double
  /**
    * The Git push information associated with this pull request iteration.
    */
  var push: GitPushRef
  /**
    * The reason for which the pull request iteration was created.
    */
  var reason: IterationReason
  /**
    * The source Git commit of this iteration.
    */
  var sourceRefCommit: GitCommitRef
  /**
    * The target Git commit of this iteration.
    */
  var targetRefCommit: GitCommitRef
  /**
    * The updated date of the pull request iteration.
    */
  var updatedDate: Date
}

object GitPullRequestIteration {
  @scala.inline
  def apply(
    _links: js.Any,
    author: IdentityRef,
    changeList: js.Array[GitPullRequestChange],
    commits: js.Array[GitCommitRef],
    commonRefCommit: GitCommitRef,
    createdDate: Date,
    description: String,
    hasMoreCommits: Boolean,
    id: Double,
    push: GitPushRef,
    reason: IterationReason,
    sourceRefCommit: GitCommitRef,
    targetRefCommit: GitCommitRef,
    updatedDate: Date
  ): GitPullRequestIteration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changeList = changeList.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], commonRefCommit = commonRefCommit.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasMoreCommits = hasMoreCommits.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceRefCommit = sourceRefCommit.asInstanceOf[js.Any], targetRefCommit = targetRefCommit.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitPullRequestIteration]
  }
}

