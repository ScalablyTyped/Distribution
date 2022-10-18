package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentRetentionPolicy extends StObject {
  
  var daysToKeep: Double
  
  var releasesToKeep: Double
  
  var retainBuild: Boolean
}
object EnvironmentRetentionPolicy {
  
  inline def apply(daysToKeep: Double, releasesToKeep: Double, retainBuild: Boolean): EnvironmentRetentionPolicy = {
    val __obj = js.Dynamic.literal(daysToKeep = daysToKeep.asInstanceOf[js.Any], releasesToKeep = releasesToKeep.asInstanceOf[js.Any], retainBuild = retainBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentRetentionPolicy]
  }
  
  extension [Self <: EnvironmentRetentionPolicy](x: Self) {
    
    inline def setDaysToKeep(value: Double): Self = StObject.set(x, "daysToKeep", value.asInstanceOf[js.Any])
    
    inline def setReleasesToKeep(value: Double): Self = StObject.set(x, "releasesToKeep", value.asInstanceOf[js.Any])
    
    inline def setRetainBuild(value: Boolean): Self = StObject.set(x, "retainBuild", value.asInstanceOf[js.Any])
  }
}
