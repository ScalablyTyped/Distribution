package typings.typescript.mod.server

import typings.typescript.typescriptStrings.closeProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseProject extends TypingInstallerRequestWithProjectName {
  
  val kind: closeProject = js.native
}
object CloseProject {
  
  @scala.inline
  def apply(kind: closeProject, projectName: String): CloseProject = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseProject]
  }
  
  @scala.inline
  implicit class CloseProjectMutableBuilder[Self <: CloseProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: closeProject): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
