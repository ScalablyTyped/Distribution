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

