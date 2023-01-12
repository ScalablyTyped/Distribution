package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitChange
  extends StObject
     with Change[GitItem] {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: GitChange] (val x: Self) extends AnyVal {
    
    inline def setChangeId(value: Double): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    inline def setNewContentTemplate(value: GitTemplate): Self = StObject.set(x, "newContentTemplate", value.asInstanceOf[js.Any])
    
    inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
  }
}
