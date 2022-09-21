package typings.trimblemapsTrimblemapsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncidentType extends StObject {
  
  var incidentType: js.UndefOr[String] = js.undefined
  
  var isVisible: js.UndefOr[Boolean] = js.undefined
}
object IncidentType {
  
  inline def apply(): IncidentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncidentType]
  }
  
  extension [Self <: IncidentType](x: Self) {
    
    inline def setIncidentType(value: String): Self = StObject.set(x, "incidentType", value.asInstanceOf[js.Any])
    
    inline def setIncidentTypeUndefined: Self = StObject.set(x, "incidentType", js.undefined)
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
  }
}
