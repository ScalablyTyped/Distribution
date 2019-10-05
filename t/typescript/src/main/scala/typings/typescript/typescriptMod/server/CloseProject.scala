package typings.typescript.typescriptMod.server

import typings.typescript.typescriptStrings.closeProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseProject extends TypingInstallerRequestWithProjectName {
  val kind: closeProject
}

object CloseProject {
  @scala.inline
  def apply(kind: closeProject, projectName: String): CloseProject = {
    val __obj = js.Dynamic.literal(kind = kind, projectName = projectName)
  
    __obj.asInstanceOf[CloseProject]
  }
}

