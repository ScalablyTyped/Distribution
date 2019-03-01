package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitLastChangeTreeItems extends js.Object {
  /**
    * The list of commits referenced by Items, if they were requested.
    */
  var commits: js.Array[GitCommitRef]
  /**
    * The last change of items.
    */
  var items: js.Array[GitLastChangeItem]
  /**
    * The last explored time, in case the result is not comprehensive. Null otherwise.
    */
  var lastExploredTime: stdLib.Date
}

object GitLastChangeTreeItems {
  @scala.inline
  def apply(commits: js.Array[GitCommitRef], items: js.Array[GitLastChangeItem], lastExploredTime: stdLib.Date): GitLastChangeTreeItems = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commits")(commits)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("lastExploredTime")(lastExploredTime)
    __obj.asInstanceOf[GitLastChangeTreeItems]
  }
}

