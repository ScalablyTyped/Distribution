package typings
package typedDashGithubDashApiLib.distApiDashInterfacesBranchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchRef extends js.Object {
  var commit: typedDashGithubDashApiLib.distApiDashInterfacesCommitMod.GitRef
  var name: java.lang.String
}

object BranchRef {
  @scala.inline
  def apply(commit: typedDashGithubDashApiLib.distApiDashInterfacesCommitMod.GitRef, name: java.lang.String): BranchRef = {
    val __obj = js.Dynamic.literal(commit = commit, name = name)
  
    __obj.asInstanceOf[BranchRef]
  }
}

