package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcPolicyFailureInfo extends StObject {
  
  var message: String
  
  var policyName: String
}
object TfvcPolicyFailureInfo {
  
  inline def apply(message: String, policyName: String): TfvcPolicyFailureInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcPolicyFailureInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TfvcPolicyFailureInfo] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
  }
}
