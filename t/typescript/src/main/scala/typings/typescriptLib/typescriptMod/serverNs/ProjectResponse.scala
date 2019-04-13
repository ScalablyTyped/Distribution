package typings
package typescriptLib.typescriptMod.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectResponse extends TypingInstallerResponse {
  val projectName: java.lang.String
}

object ProjectResponse {
  @scala.inline
  def apply(
    kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | ActionValueInspected | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed,
    projectName: java.lang.String
  ): ProjectResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], projectName = projectName)
  
    __obj.asInstanceOf[ProjectResponse]
  }
}

