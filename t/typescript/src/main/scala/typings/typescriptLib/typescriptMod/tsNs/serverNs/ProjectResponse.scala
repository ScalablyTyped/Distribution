package typings
package typescriptLib.typescriptMod.tsNs.serverNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.updateDynamic("projectName")(projectName)
    __obj.asInstanceOf[ProjectResponse]
  }
}

