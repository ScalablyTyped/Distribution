package typings.typescript.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginInstallTypes extends InstallTypes {
  @JSName("kind")
  val kind_BeginInstallTypes: EventBeginInstallTypes = js.native
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
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typingsInstallerVersion = typingsInstallerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginInstallTypes]
  }
  @scala.inline
  implicit class BeginInstallTypesOps[Self <: BeginInstallTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: EventBeginInstallTypes): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

