package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitChange extends Change[GitItem] {
  /**
    * ID of the change within the group of changes.
    */
  var changeId: scala.Double
  /**
    * New Content template to be used when pushing new changes.
    */
  var newContentTemplate: GitTemplate
  /**
    * Original path of item if different from current path.
    */
  var originalPath: java.lang.String
}

object GitChange {
  @scala.inline
  def apply(
    changeId: scala.Double,
    changeType: VersionControlChangeType,
    item: GitItem,
    newContent: ItemContent,
    newContentTemplate: GitTemplate,
    originalPath: java.lang.String,
    sourceServerItem: java.lang.String,
    url: java.lang.String
  ): GitChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeId")(changeId)
    __obj.updateDynamic("changeType")(changeType)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("newContent")(newContent)
    __obj.updateDynamic("newContentTemplate")(newContentTemplate)
    __obj.updateDynamic("originalPath")(originalPath)
    __obj.updateDynamic("sourceServerItem")(sourceServerItem)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitChange]
  }
}

