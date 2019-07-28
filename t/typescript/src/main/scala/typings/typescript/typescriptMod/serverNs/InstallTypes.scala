package typings.typescript.typescriptMod.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallTypes extends ProjectResponse {
  val eventId: Double
  @JSName("kind")
  val kind_InstallTypes: EventBeginInstallTypes | EventEndInstallTypes
  val packagesToInstall: js.Array[String]
  val typingsInstallerVersion: String
}

object InstallTypes {
  @scala.inline
  def apply(
    eventId: Double,
    kind: EventBeginInstallTypes | EventEndInstallTypes,
    packagesToInstall: js.Array[String],
    projectName: String,
    typingsInstallerVersion: String
  ): InstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId, kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall, projectName = projectName, typingsInstallerVersion = typingsInstallerVersion)
  
    __obj.asInstanceOf[InstallTypes]
  }
}

