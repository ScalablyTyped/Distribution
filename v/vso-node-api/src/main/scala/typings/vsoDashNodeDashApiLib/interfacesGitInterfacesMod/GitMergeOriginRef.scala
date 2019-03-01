package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitMergeOriginRef extends js.Object {
  var pullRequestId: scala.Double
}

object GitMergeOriginRef {
  @scala.inline
  def apply(pullRequestId: scala.Double): GitMergeOriginRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pullRequestId")(pullRequestId)
    __obj.asInstanceOf[GitMergeOriginRef]
  }
}

