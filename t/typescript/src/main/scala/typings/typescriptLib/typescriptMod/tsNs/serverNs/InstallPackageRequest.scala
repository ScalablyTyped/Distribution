package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallPackageRequest extends TypingInstallerRequestWithProjectName {
  val fileName: typescriptLib.typescriptMod.tsNs.Path
  val kind: typescriptLib.typescriptLibStrings.installPackage
  val packageName: java.lang.String
  val projectRootPath: typescriptLib.typescriptMod.tsNs.Path
}

object InstallPackageRequest {
  @scala.inline
  def apply(
    fileName: typescriptLib.typescriptMod.tsNs.Path,
    kind: typescriptLib.typescriptLibStrings.installPackage,
    packageName: java.lang.String,
    projectName: java.lang.String,
    projectRootPath: typescriptLib.typescriptMod.tsNs.Path
  ): InstallPackageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("packageName")(packageName)
    __obj.updateDynamic("projectName")(projectName)
    __obj.updateDynamic("projectRootPath")(projectRootPath)
    __obj.asInstanceOf[InstallPackageRequest]
  }
}

