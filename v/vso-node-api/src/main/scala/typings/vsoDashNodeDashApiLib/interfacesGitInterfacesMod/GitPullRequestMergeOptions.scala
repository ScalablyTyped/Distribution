package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestMergeOptions extends js.Object {
  /**
    * If true, rename detection will not be performed during the merge.
    */
  var disableRenames: scala.Boolean
}

object GitPullRequestMergeOptions {
  @scala.inline
  def apply(disableRenames: scala.Boolean): GitPullRequestMergeOptions = {
    val __obj = js.Dynamic.literal(disableRenames = disableRenames)
  
    __obj.asInstanceOf[GitPullRequestMergeOptions]
  }
}

