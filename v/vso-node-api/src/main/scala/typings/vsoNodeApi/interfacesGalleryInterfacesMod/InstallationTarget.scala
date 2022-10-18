package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationTarget extends StObject {
  
  var target: String
  
  var targetVersion: String
}
object InstallationTarget {
  
  inline def apply(target: String, targetVersion: String): InstallationTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationTarget]
  }
  
  extension [Self <: InstallationTarget](x: Self) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
  }
}
