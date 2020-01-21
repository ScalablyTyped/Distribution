package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestMergeOptions extends js.Object {
  /**
    * If true, rename detection will not be performed during the merge.
    */
  var disableRenames: Boolean
}

object GitPullRequestMergeOptions {
  @scala.inline
  def apply(disableRenames: Boolean): GitPullRequestMergeOptions = {
    val __obj = js.Dynamic.literal(disableRenames = disableRenames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitPullRequestMergeOptions]
  }
}

