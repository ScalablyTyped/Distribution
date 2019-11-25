package typings.typescript.typescriptMod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageInstalledResponse extends ProjectResponse {
  @JSName("kind")
  val kind_PackageInstalledResponse: ActionPackageInstalled
  val message: String
  val success: Boolean
}

object PackageInstalledResponse {
  @scala.inline
  def apply(kind: ActionPackageInstalled, message: String, projectName: String, success: Boolean): PackageInstalledResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackageInstalledResponse]
  }
}

