package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitChange extends Change[GitItem] {
  /**
    * ID of the change within the group of changes.
    */
  var changeId: Double = js.native
  /**
    * New Content template to be used when pushing new changes.
    */
  var newContentTemplate: GitTemplate = js.native
  /**
    * Original path of item if different from current path.
    */
  var originalPath: String = js.native
}

object GitChange {
  @scala.inline
  def apply(
    changeId: Double,
    changeType: VersionControlChangeType,
    item: GitItem,
    newContent: ItemContent,
    newContentTemplate: GitTemplate,
    originalPath: String,
    sourceServerItem: String,
    url: String
  ): GitChange = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], newContent = newContent.asInstanceOf[js.Any], newContentTemplate = newContentTemplate.asInstanceOf[js.Any], originalPath = originalPath.asInstanceOf[js.Any], sourceServerItem = sourceServerItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitChange]
  }
  @scala.inline
  implicit class GitChangeOps[Self <: GitChange] (val x: Self) extends AnyVal {
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
    def setChangeId(value: Double): Self = this.set("changeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewContentTemplate(value: GitTemplate): Self = this.set("newContentTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalPath(value: String): Self = this.set("originalPath", value.asInstanceOf[js.Any])
  }
  
}

