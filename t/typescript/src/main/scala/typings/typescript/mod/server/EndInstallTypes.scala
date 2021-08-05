package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndInstallTypes
  extends StObject
     with InstallTypes {
  
  val installSuccess: Boolean
  
  @JSName("kind")
  val kind_EndInstallTypes: EventEndInstallTypes
}
object EndInstallTypes {
  
  inline def apply(
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
  
  extension [Self <: EndInstallTypes](x: Self) {
    
    inline def setInstallSuccess(value: Boolean): Self = StObject.set(x, "installSuccess", value.asInstanceOf[js.Any])
    
    inline def setKind(value: EventEndInstallTypes): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
