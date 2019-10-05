package typings.typescript.typescriptMod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginInstallTypes extends InstallTypes {
  @JSName("kind")
  val kind_BeginInstallTypes: EventBeginInstallTypes
}

object BeginInstallTypes {
  @scala.inline
  def apply(
    eventId: Double,
    kind: EventBeginInstallTypes,
    packagesToInstall: js.Array[String],
    projectName: String,
    typingsInstallerVersion: String
  ): BeginInstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId, kind = kind, packagesToInstall = packagesToInstall, projectName = projectName, typingsInstallerVersion = typingsInstallerVersion)
  
    __obj.asInstanceOf[BeginInstallTypes]
  }
}

