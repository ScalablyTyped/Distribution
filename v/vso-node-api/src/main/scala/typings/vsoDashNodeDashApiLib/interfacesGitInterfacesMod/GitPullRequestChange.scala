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
    val __obj = js.Dynamic.literal(changeId = changeId, changeTrackingId = changeTrackingId, changeType = changeType, item = item, newContent = newContent, newContentTemplate = newContentTemplate, originalPath = originalPath, sourceServerItem = sourceServerItem, url = url)
  
    __obj.asInstanceOf[GitPullRequestChange]
  }
}

