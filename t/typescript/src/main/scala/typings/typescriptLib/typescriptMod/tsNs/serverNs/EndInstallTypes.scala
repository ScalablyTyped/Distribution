package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndInstallTypes extends InstallTypes {
  val installSuccess: scala.Boolean
  @JSName("kind")
  val kind_EndInstallTypes: EventEndInstallTypes
}

object EndInstallTypes {
  @scala.inline
  def apply(
    eventId: scala.Double,
    installSuccess: scala.Boolean,
    kind: EventEndInstallTypes,
    packagesToInstall: js.Array[java.lang.String],
    projectName: java.lang.String,
    typingsInstallerVersion: java.lang.String
  ): EndInstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId, installSuccess = installSuccess, kind = kind, packagesToInstall = packagesToInstall, projectName = projectName, typingsInstallerVersion = typingsInstallerVersion)
  
    __obj.asInstanceOf[EndInstallTypes]
  }
}

