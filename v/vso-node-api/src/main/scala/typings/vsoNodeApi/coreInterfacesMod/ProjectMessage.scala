package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectMessage extends StObject {
  
  var project: ProjectInfo = js.native
  
  var projectChangeType: ProjectChangeType = js.native
  
  var shouldInvalidateSystemStore: Boolean = js.native
}
object ProjectMessage {
  
  @scala.inline
  def apply(project: ProjectInfo, projectChangeType: ProjectChangeType, shouldInvalidateSystemStore: Boolean): ProjectMessage = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectChangeType = projectChangeType.asInstanceOf[js.Any], shouldInvalidateSystemStore = shouldInvalidateSystemStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectMessage]
  }
  
  @scala.inline
  implicit class ProjectMessageMutableBuilder[Self <: ProjectMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: ProjectInfo): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectChangeType(value: ProjectChangeType): Self = StObject.set(x, "projectChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldInvalidateSystemStore(value: Boolean): Self = StObject.set(x, "shouldInvalidateSystemStore", value.asInstanceOf[js.Any])
  }
}
