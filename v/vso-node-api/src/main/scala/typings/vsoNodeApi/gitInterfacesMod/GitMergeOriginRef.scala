package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitMergeOriginRef extends js.Object {
  var pullRequestId: Double
}

object GitMergeOriginRef {
  @scala.inline
  def apply(pullRequestId: Double): GitMergeOriginRef = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitMergeOriginRef]
  }
}

