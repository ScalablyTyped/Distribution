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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("projectName")(projectName)
    __obj.asInstanceOf[CloseProject]
  }
}

