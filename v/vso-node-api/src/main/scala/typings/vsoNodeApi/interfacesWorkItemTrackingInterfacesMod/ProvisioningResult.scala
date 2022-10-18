package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningResult extends StObject {
  
  /**
    * Details about of the provisioning import events.
    */
  var provisioningImportEvents: js.Array[String]
}
object ProvisioningResult {
  
  inline def apply(provisioningImportEvents: js.Array[String]): ProvisioningResult = {
    val __obj = js.Dynamic.literal(provisioningImportEvents = provisioningImportEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningResult]
  }
  
  extension [Self <: ProvisioningResult](x: Self) {
    
    inline def setProvisioningImportEvents(value: js.Array[String]): Self = StObject.set(x, "provisioningImportEvents", value.asInstanceOf[js.Any])
    
    inline def setProvisioningImportEventsVarargs(value: String*): Self = StObject.set(x, "provisioningImportEvents", js.Array(value*))
  }
}
