package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageInstalledResponse extends ProjectResponse {
  @JSName("kind")
  val kind_PackageInstalledResponse: ActionPackageInstalled
  val message: java.lang.String
  val success: scala.Boolean
}

object PackageInstalledResponse {
  @scala.inline
  def apply(
    kind: ActionPackageInstalled,
    message: java.lang.String,
    projectName: java.lang.String,
    success: scala.Boolean
  ): PackageInstalledResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("projectName")(projectName)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[PackageInstalledResponse]
  }
}

