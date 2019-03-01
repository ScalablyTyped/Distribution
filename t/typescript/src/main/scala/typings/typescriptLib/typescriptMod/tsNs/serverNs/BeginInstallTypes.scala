package typings
package typescriptLib.typescriptMod.tsNs.serverNs

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
    eventId: scala.Double,
    kind: EventBeginInstallTypes,
    packagesToInstall: js.Array[java.lang.String],
    projectName: java.lang.String,
    typingsInstallerVersion: java.lang.String
  ): BeginInstallTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventId")(eventId)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("packagesToInstall")(packagesToInstall)
    __obj.updateDynamic("projectName")(projectName)
    __obj.updateDynamic("typingsInstallerVersion")(typingsInstallerVersion)
    __obj.asInstanceOf[BeginInstallTypes]
  }
}

