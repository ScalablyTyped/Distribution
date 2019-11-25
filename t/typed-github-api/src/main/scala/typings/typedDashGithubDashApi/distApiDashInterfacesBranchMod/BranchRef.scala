package typings.typedDashGithubDashApi.distApiDashInterfacesBranchMod

import typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod.GitRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchRef extends js.Object {
  var commit: GitRef
  var name: String
}

object BranchRef {
  @scala.inline
  def apply(commit: GitRef, name: String): BranchRef = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BranchRef]
  }
}

