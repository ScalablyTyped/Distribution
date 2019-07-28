package typings.typescript.typescriptMod.serverNs

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
    val __obj = js.Dynamic.literal(kind = kind, message = message, projectName = projectName, success = success)
  
    __obj.asInstanceOf[PackageInstalledResponse]
  }
}

