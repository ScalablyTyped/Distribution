package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestChange extends GitChange {
  
  /**
    * ID used to track files through multiple changes.
    */
  var changeTrackingId: Double = js.native
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
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], changeTrackingId = changeTrackingId.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], newContent = newContent.asInstanceOf[js.Any], newContentTemplate = newContentTemplate.asInstanceOf[js.Any], originalPath = originalPath.asInstanceOf[js.Any], sourceServerItem = sourceServerItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestChange]
  }
  
  @scala.inline
  implicit class GitPullRequestChangeMutableBuilder[Self <: GitPullRequestChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeTrackingId(value: Double): Self = StObject.set(x, "changeTrackingId", value.asInstanceOf[js.Any])
  }
}
