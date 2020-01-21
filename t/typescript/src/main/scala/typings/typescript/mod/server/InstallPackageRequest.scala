package typings.typescript.mod.server

import typings.typescript.mod.Path
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
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstallPackageRequest]
  }
}

