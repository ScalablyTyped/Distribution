package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitChanges extends js.Object {
  var changeCounts: ChangeCountDictionary
  var changes: js.Array[GitChange]
}

object GitCommitChanges {
  @scala.inline
  def apply(changeCounts: ChangeCountDictionary, changes: js.Array[GitChange]): GitCommitChanges = {
    val __obj = js.Dynamic.literal(changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitCommitChanges]
  }
}

