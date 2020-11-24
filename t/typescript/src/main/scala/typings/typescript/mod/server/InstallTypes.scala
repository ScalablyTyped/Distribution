package typings.typescript.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallTypes extends ProjectResponse {
  
  val eventId: Double = js.native
  
  @JSName("kind")
  val kind_InstallTypes: EventBeginInstallTypes | EventEndInstallTypes = js.native
  
  val packagesToInstall: js.Array[String] = js.native
  
  val typingsInstallerVersion: String = js.native
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
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typingsInstallerVersion = typingsInstallerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallTypes]
  }
  
  @scala.inline
  implicit class InstallTypesOps[Self <: InstallTypes] (val x: Self) extends AnyVal {
    
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
    def setEventId(value: Double): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: EventBeginInstallTypes | EventEndInstallTypes): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesToInstallVarargs(value: String*): Self = this.set("packagesToInstall", js.Array(value :_*))
    
    @scala.inline
    def setPackagesToInstall(value: js.Array[String]): Self = this.set("packagesToInstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypingsInstallerVersion(value: String): Self = this.set("typingsInstallerVersion", value.asInstanceOf[js.Any])
  }
}
