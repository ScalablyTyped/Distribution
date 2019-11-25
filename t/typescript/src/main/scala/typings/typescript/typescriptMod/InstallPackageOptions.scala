package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallPackageOptions extends js.Object {
  var fileName: Path
  var packageName: String
}

object InstallPackageOptions {
  @scala.inline
  def apply(fileName: Path, packageName: String): InstallPackageOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstallPackageOptions]
  }
}

