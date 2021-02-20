package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcPolicyOverrideInfo extends StObject {
  
  var comment: String = js.native
  
  var policyFailures: js.Array[TfvcPolicyFailureInfo] = js.native
}
object TfvcPolicyOverrideInfo {
  
  @scala.inline
  def apply(comment: String, policyFailures: js.Array[TfvcPolicyFailureInfo]): TfvcPolicyOverrideInfo = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], policyFailures = policyFailures.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcPolicyOverrideInfo]
  }
  
  @scala.inline
  implicit class TfvcPolicyOverrideInfoMutableBuilder[Self <: TfvcPolicyOverrideInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyFailures(value: js.Array[TfvcPolicyFailureInfo]): Self = StObject.set(x, "policyFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyFailuresVarargs(value: TfvcPolicyFailureInfo*): Self = StObject.set(x, "policyFailures", js.Array(value :_*))
  }
}
