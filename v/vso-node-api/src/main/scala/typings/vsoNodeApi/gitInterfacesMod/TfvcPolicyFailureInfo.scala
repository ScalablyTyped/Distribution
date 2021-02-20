package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcPolicyFailureInfo extends StObject {
  
  var message: String = js.native
  
  var policyName: String = js.native
}
object TfvcPolicyFailureInfo {
  
  @scala.inline
  def apply(message: String, policyName: String): TfvcPolicyFailureInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcPolicyFailureInfo]
  }
  
  @scala.inline
  implicit class TfvcPolicyFailureInfoMutableBuilder[Self <: TfvcPolicyFailureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
  }
}
