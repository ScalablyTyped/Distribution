package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypingInstallerResponse extends js.Object {
  val kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | ActionValueInspected | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed
}

object TypingInstallerResponse {
  @scala.inline
  def apply(
    kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | ActionValueInspected | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed
  ): TypingInstallerResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypingInstallerResponse]
  }
}

