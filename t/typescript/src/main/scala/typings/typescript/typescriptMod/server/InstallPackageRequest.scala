package typings.typescript.typescriptMod.server

import typings.typescript.typescriptMod.Path
import typings.typescript.typescriptStrings.installPackage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallPackageRequest extends TypingInstallerRequestWithProjectName {
  val fileName: Path
  val kind: installPackage
  val packageName: String
  val projectRootPath: Path
}

object InstallPackageRequest {
  @scala.inline
  def apply(
    fileName: Path,
    kind: installPackage,
    packageName: String,
    projectName: String,
    projectRootPath: Path
  ): InstallPackageRequest = {
    val __obj = js.Dynamic.literal(fileName = fileName, kind = kind, packageName = packageName, projectName = projectName, projectRootPath = projectRootPath)
  
    __obj.asInstanceOf[InstallPackageRequest]
  }
}

