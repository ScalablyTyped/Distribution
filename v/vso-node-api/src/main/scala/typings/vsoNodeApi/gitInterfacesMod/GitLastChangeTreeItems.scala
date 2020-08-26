package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitLastChangeTreeItems extends js.Object {
  /**
    * The list of commits referenced by Items, if they were requested.
    */
  var commits: js.Array[GitCommitRef] = js.native
  /**
    * The last change of items.
    */
  var items: js.Array[GitLastChangeItem] = js.native
  /**
    * The last explored time, in case the result is not comprehensive. Null otherwise.
    */
  var lastExploredTime: Date = js.native
}

object GitLastChangeTreeItems {
  @scala.inline
  def apply(commits: js.Array[GitCommitRef], items: js.Array[GitLastChangeItem], lastExploredTime: Date): GitLastChangeTreeItems = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lastExploredTime = lastExploredTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitLastChangeTreeItems]
  }
  @scala.inline
  implicit class GitLastChangeTreeItemsOps[Self <: GitLastChangeTreeItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommitsVarargs(value: GitCommitRef*): Self = this.set("commits", js.Array(value :_*))
    @scala.inline
    def setCommits(value: js.Array[GitCommitRef]): Self = this.set("commits", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: GitLastChangeItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[GitLastChangeItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastExploredTime(value: Date): Self = this.set("lastExploredTime", value.asInstanceOf[js.Any])
  }
  
}

