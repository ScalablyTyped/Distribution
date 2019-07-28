package typings.typescript.typescriptMod.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndInstallTypes extends InstallTypes {
  val installSuccess: Boolean
  @JSName("kind")
  val kind_EndInstallTypes: EventEndInstallTypes
}

object EndInstallTypes {
  @scala.inline
  def apply(
    eventId: Double,
    installSuccess: Boolean,
    kind: EventEndInstallTypes,
    packagesToInstall: js.Array[String],
    projectName: String,
    typingsInstallerVersion: String
  ): EndInstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId, installSuccess = installSuccess, kind = kind, packagesToInstall = packagesToInstall, projectName = projectName, typingsInstallerVersion = typingsInstallerVersion)
  
    __obj.asInstanceOf[EndInstallTypes]
  }
}

