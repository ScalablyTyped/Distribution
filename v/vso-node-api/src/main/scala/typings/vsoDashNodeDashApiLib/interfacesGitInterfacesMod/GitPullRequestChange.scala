package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestChange extends GitChange {
  /**
    * ID used to track files through multiple changes.
    */
  var changeTrackingId: scala.Double
}

object GitPullRequestChange {
  @scala.inline
  def apply(
    changeId: scala.Double,
    changeTrackingId: scala.Double,
    changeType: VersionControlChangeType,
    item: GitItem,
    newContent: ItemContent,
    newContentTemplate: GitTemplate,
    originalPath: java.lang.String,
    sourceServerItem: java.lang.String,
    url: java.lang.String
  ): GitPullRequestChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeId")(changeId)
    __obj.updateDynamic("changeTrackingId")(changeTrackingId)
    __obj.updateDynamic("changeType")(changeType)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("newContent")(newContent)
    __obj.updateDynamic("newContentTemplate")(newContentTemplate)
    __obj.updateDynamic("originalPath")(originalPath)
    __obj.updateDynamic("sourceServerItem")(sourceServerItem)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitPullRequestChange]
  }
}

