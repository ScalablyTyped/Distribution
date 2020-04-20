package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
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
  var lastExploredTime: Date
}

object GitLastChangeTreeItems {
  @scala.inline
  def apply(commits: js.Array[GitCommitRef], items: js.Array[GitLastChangeItem], lastExploredTime: Date): GitLastChangeTreeItems = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lastExploredTime = lastExploredTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitLastChangeTreeItems]
  }
}

