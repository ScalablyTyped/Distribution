package typings
package typescriptLib.typescriptMod.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallPackageRequest extends TypingInstallerRequestWithProjectName {
  val fileName: typescriptLib.typescriptMod.Path
  val kind: typescriptLib.typescriptLibStrings.installPackage
  val packageName: java.lang.String
  val projectRootPath: typescriptLib.typescriptMod.Path
}

object InstallPackageRequest {
  @scala.inline
  def apply(
    fileName: typescriptLib.typescriptMod.Path,
    kind: typescriptLib.typescriptLibStrings.installPackage,
    packageName: java.lang.String,
    projectName: java.lang.String,
    projectRootPath: typescriptLib.typescriptMod.Path
  ): InstallPackageRequest = {
    val __obj = js.Dynamic.literal(fileName = fileName, kind = kind, packageName = packageName, projectName = projectName, projectRootPath = projectRootPath)
  
    __obj.asInstanceOf[InstallPackageRequest]
  }
}

