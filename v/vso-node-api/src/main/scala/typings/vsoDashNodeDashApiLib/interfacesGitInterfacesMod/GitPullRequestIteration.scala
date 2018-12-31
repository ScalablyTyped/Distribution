package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  var author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
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
  var createdDate: stdLib.Date
  /**
    * Description of the pull request iteration.
    */
  var description: java.lang.String
  /**
    * Indicates if the Commits property contains a truncated list of commits in this pull request iteration.
    */
  var hasMoreCommits: scala.Boolean
  /**
    * ID of the pull request iteration. Iterations are created as a result of creating and pushing updates to a pull request.
    */
  var id: scala.Double
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
  var updatedDate: stdLib.Date
}

