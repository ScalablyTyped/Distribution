package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(baseCommit = baseCommit, targetCommits = targetCommits)
  
    __obj.asInstanceOf[GitQueryBranchStatsCriteria]
  }
}

