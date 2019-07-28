package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestChange extends GitChange {
  /**
    * ID used to track files through multiple changes.
    */
  var changeTrackingId: Double
}

object GitPullRequestChange {
  @scala.inline
  def apply(
    changeId: Double,
    changeTrackingId: Double,
    changeType: VersionControlChangeType,
    item: GitItem,
    newContent: ItemContent,
    newContentTemplate: GitTemplate,
    originalPath: String,
    sourceServerItem: String,
    url: String
  ): GitPullRequestChange = {
    val __obj = js.Dynamic.literal(changeId = changeId, changeTrackingId = changeTrackingId, changeType = changeType, item = item, newContent = newContent, newContentTemplate = newContentTemplate, originalPath = originalPath, sourceServerItem = sourceServerItem, url = url)
  
    __obj.asInstanceOf[GitPullRequestChange]
  }
}

