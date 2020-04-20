package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitQueryBranchStatsCriteria extends js.Object {
  var baseCommit: GitVersionDescriptor
  var targetCommits: js.Array[GitVersionDescriptor]
}

object GitQueryBranchStatsCriteria {
  @scala.inline
  def apply(baseCommit: GitVersionDescriptor, targetCommits: js.Array[GitVersionDescriptor]): GitQueryBranchStatsCriteria = {
    val __obj = js.Dynamic.literal(baseCommit = baseCommit.asInstanceOf[js.Any], targetCommits = targetCommits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitQueryBranchStatsCriteria]
  }
}

