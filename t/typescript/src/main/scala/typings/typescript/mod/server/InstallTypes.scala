package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallTypes
  extends StObject
     with ProjectResponse {
  
  val eventId: Double
  
  @JSName("kind")
  val kind_InstallTypes: EventBeginInstallTypes | EventEndInstallTypes
  
  val packagesToInstall: js.Array[String]
  
  val typingsInstallerVersion: String
}
object InstallTypes {
  
  inline def apply(
    eventId: Double,
    kind: EventBeginInstallTypes | EventEndInstallTypes,
    packagesToInstall: js.Array[String],
    projectName: String,
    typingsInstallerVersion: String
  ): InstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typingsInstallerVersion = typingsInstallerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallTypes]
  }
  
  extension [Self <: InstallTypes](x: Self) {
    
    inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: EventBeginInstallTypes | EventEndInstallTypes): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPackagesToInstall(value: js.Array[String]): Self = StObject.set(x, "packagesToInstall", value.asInstanceOf[js.Any])
    
    inline def setPackagesToInstallVarargs(value: String*): Self = StObject.set(x, "packagesToInstall", js.Array(value :_*))
    
    inline def setTypingsInstallerVersion(value: String): Self = StObject.set(x, "typingsInstallerVersion", value.asInstanceOf[js.Any])
  }
}
