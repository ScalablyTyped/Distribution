package typings.typescript.typescriptMod.server

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
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], installSuccess = installSuccess.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typingsInstallerVersion = typingsInstallerVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndInstallTypes]
  }
}

