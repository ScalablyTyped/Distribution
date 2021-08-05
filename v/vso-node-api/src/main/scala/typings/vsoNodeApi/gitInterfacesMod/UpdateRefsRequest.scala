package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRefsRequest extends StObject {
  
  var refUpdateRequests: js.Array[GitRefUpdate]
  
  var updateMode: GitRefUpdateMode
}
object UpdateRefsRequest {
  
  inline def apply(refUpdateRequests: js.Array[GitRefUpdate], updateMode: GitRefUpdateMode): UpdateRefsRequest = {
    val __obj = js.Dynamic.literal(refUpdateRequests = refUpdateRequests.asInstanceOf[js.Any], updateMode = updateMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRefsRequest]
  }
  
  extension [Self <: UpdateRefsRequest](x: Self) {
    
    inline def setRefUpdateRequests(value: js.Array[GitRefUpdate]): Self = StObject.set(x, "refUpdateRequests", value.asInstanceOf[js.Any])
    
    inline def setRefUpdateRequestsVarargs(value: GitRefUpdate*): Self = StObject.set(x, "refUpdateRequests", js.Array(value :_*))
    
    inline def setUpdateMode(value: GitRefUpdateMode): Self = StObject.set(x, "updateMode", value.asInstanceOf[js.Any])
  }
}
