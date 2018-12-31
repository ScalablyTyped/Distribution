package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallTypes extends ProjectResponse {
  val eventId: scala.Double
  @JSName("kind")
  val kind_InstallTypes: EventBeginInstallTypes | EventEndInstallTypes
  val packagesToInstall: js.Array[java.lang.String]
  val typingsInstallerVersion: java.lang.String
}

