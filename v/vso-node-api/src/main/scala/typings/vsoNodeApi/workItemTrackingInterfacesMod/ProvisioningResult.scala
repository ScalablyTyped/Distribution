package typings.vsoNodeApi.workItemTrackingInterfacesMod

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
  
  @scala.inline
  def apply(provisioningImportEvents: js.Array[String]): ProvisioningResult = {
    val __obj = js.Dynamic.literal(provisioningImportEvents = provisioningImportEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningResult]
  }
  
  @scala.inline
  implicit class ProvisioningResultMutableBuilder[Self <: ProvisioningResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvisioningImportEvents(value: js.Array[String]): Self = StObject.set(x, "provisioningImportEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningImportEventsVarargs(value: String*): Self = StObject.set(x, "provisioningImportEvents", js.Array(value :_*))
  }
}
