package typings.typescript.mod.server

import typings.typescript.typescriptStrings.closeProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseProject
  extends StObject
     with TypingInstallerRequestWithProjectName {
  
  val kind: closeProject
}
object CloseProject {
  
  @scala.inline
  def apply(projectName: String): CloseProject = {
    val __obj = js.Dynamic.literal(kind = "closeProject", projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseProject]
  }
  
  @scala.inline
  implicit class CloseProjectMutableBuilder[Self <: CloseProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: closeProject): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
