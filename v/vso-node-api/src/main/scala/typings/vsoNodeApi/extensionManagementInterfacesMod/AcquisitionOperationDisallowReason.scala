package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcquisitionOperationDisallowReason extends StObject {
  
  /**
    * User-friendly message clarifying the reason for disallowance
    */
  var message: String
  
  /**
    * Type of reason for disallowance - AlreadyInstalled, UnresolvedDemand, etc.
    */
  var `type`: String
}
object AcquisitionOperationDisallowReason {
  
  inline def apply(message: String, `type`: String): AcquisitionOperationDisallowReason = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOperationDisallowReason]
  }
  
  extension [Self <: AcquisitionOperationDisallowReason](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
