package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAsyncRefOperationSource extends js.Object {
  /**
    * A list of commits to cherry pick or revert
    */
  var commitList: js.Array[GitCommitRef]
  /**
    * Id of the pull request to cherry pick or revert
    */
  var pullRequestId: scala.Double
}

object GitAsyncRefOperationSource {
  @scala.inline
  def apply(commitList: js.Array[GitCommitRef], pullRequestId: scala.Double): GitAsyncRefOperationSource = {
    val __obj = js.Dynamic.literal(commitList = commitList, pullRequestId = pullRequestId)
  
    __obj.asInstanceOf[GitAsyncRefOperationSource]
  }
}

