package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseProject extends TypingInstallerRequestWithProjectName {
  val kind: typescriptLib.typescriptLibStrings.closeProject
}

object CloseProject {
  @scala.inline
  def apply(kind: typescriptLib.typescriptLibStrings.closeProject, projectName: java.lang.String): CloseProject = {
    val __obj = js.Dynamic.literal(kind = kind, projectName = projectName)
  
    __obj.asInstanceOf[CloseProject]
  }
}

