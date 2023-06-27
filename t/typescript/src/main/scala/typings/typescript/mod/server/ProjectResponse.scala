package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectResponse
  extends StObject
     with TypingInstallerResponse {
  
  val projectName: String
}
object ProjectResponse {
  
  inline def apply(
    kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed | ActionWatchTypingLocations,
    projectName: String
  ): ProjectResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectResponse] (val x: Self) extends AnyVal {
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
