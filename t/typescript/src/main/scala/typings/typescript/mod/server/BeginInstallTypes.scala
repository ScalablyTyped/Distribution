package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
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
  implicit class BeginInstallTypesMutableBuilder[Self <: BeginInstallTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: EventBeginInstallTypes): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
