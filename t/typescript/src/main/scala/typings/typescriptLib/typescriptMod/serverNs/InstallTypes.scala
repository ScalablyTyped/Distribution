package typings
package typescriptLib.typescriptMod.serverNs

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

object InstallTypes {
  @scala.inline
  def apply(
    eventId: scala.Double,
    kind: EventBeginInstallTypes | EventEndInstallTypes,
    packagesToInstall: js.Array[java.lang.String],
    projectName: java.lang.String,
    typingsInstallerVersion: java.lang.String
  ): InstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId, kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall, projectName = projectName, typingsInstallerVersion = typingsInstallerVersion)
  
    __obj.asInstanceOf[InstallTypes]
  }
}

