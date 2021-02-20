package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcquisitionOperationDisallowReason extends StObject {
  
  /**
    * User-friendly message clarifying the reason for disallowance
    */
  var message: String = js.native
  
  /**
    * Type of reason for disallowance - AlreadyInstalled, UnresolvedDemand, etc.
    */
  var `type`: String = js.native
}
object AcquisitionOperationDisallowReason {
  
  @scala.inline
  def apply(message: String, `type`: String): AcquisitionOperationDisallowReason = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOperationDisallowReason]
  }
  
  @scala.inline
  implicit class AcquisitionOperationDisallowReasonMutableBuilder[Self <: AcquisitionOperationDisallowReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
