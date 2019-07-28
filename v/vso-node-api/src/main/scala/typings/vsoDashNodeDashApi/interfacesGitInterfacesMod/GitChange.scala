package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitChange extends Change[GitItem] {
  /**
    * ID of the change within the group of changes.
    */
  var changeId: Double
  /**
    * New Content template to be used when pushing new changes.
    */
  var newContentTemplate: GitTemplate
  /**
    * Original path of item if different from current path.
    */
  var originalPath: String
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
    val __obj = js.Dynamic.literal(changeId = changeId, changeType = changeType, item = item, newContent = newContent, newContentTemplate = newContentTemplate, originalPath = originalPath, sourceServerItem = sourceServerItem, url = url)
  
    __obj.asInstanceOf[GitChange]
  }
}

