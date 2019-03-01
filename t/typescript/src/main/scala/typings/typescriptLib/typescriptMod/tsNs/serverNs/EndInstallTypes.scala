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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventId")(eventId)
    __obj.updateDynamic("installSuccess")(installSuccess)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("packagesToInstall")(packagesToInstall)
    __obj.updateDynamic("projectName")(projectName)
    __obj.updateDynamic("typingsInstallerVersion")(typingsInstallerVersion)
    __obj.asInstanceOf[EndInstallTypes]
  }
}

