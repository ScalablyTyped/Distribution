package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectResponse extends TypingInstallerResponse {
  
  val projectName: String = js.native
}
object ProjectResponse {
  
  @scala.inline
  def apply(
    kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed,
    projectName: String
  ): ProjectResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectResponse]
  }
  
  @scala.inline
  implicit class ProjectResponseMutableBuilder[Self <: ProjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
