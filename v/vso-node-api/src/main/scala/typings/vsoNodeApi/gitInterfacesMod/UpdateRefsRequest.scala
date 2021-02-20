package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRefsRequest extends StObject {
  
  var refUpdateRequests: js.Array[GitRefUpdate] = js.native
  
  var updateMode: GitRefUpdateMode = js.native
}
object UpdateRefsRequest {
  
  @scala.inline
  def apply(refUpdateRequests: js.Array[GitRefUpdate], updateMode: GitRefUpdateMode): UpdateRefsRequest = {
    val __obj = js.Dynamic.literal(refUpdateRequests = refUpdateRequests.asInstanceOf[js.Any], updateMode = updateMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRefsRequest]
  }
  
  @scala.inline
  implicit class UpdateRefsRequestMutableBuilder[Self <: UpdateRefsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefUpdateRequests(value: js.Array[GitRefUpdate]): Self = StObject.set(x, "refUpdateRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUpdateRequestsVarargs(value: GitRefUpdate*): Self = StObject.set(x, "refUpdateRequests", js.Array(value :_*))
    
    @scala.inline
    def setUpdateMode(value: GitRefUpdateMode): Self = StObject.set(x, "updateMode", value.asInstanceOf[js.Any])
  }
}
