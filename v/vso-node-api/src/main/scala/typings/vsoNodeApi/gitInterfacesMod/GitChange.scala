package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GitChangeMutableBuilder[Self <: GitChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeId(value: Double): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewContentTemplate(value: GitTemplate): Self = StObject.set(x, "newContentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
  }
}
