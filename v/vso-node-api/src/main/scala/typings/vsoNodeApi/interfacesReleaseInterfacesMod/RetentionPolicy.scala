package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionPolicy extends StObject {
  
  var daysToKeep: Double
}
object RetentionPolicy {
  
  inline def apply(daysToKeep: Double): RetentionPolicy = {
    val __obj = js.Dynamic.literal(daysToKeep = daysToKeep.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionPolicy]
  }
  
  extension [Self <: RetentionPolicy](x: Self) {
    
    inline def setDaysToKeep(value: Double): Self = StObject.set(x, "daysToKeep", value.asInstanceOf[js.Any])
  }
}
