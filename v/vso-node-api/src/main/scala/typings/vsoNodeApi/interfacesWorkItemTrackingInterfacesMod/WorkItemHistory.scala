package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemHistory
  extends StObject
     with WorkItemTrackingResource {
  
  var rev: Double
  
  var revisedBy: IdentityReference
  
  var revisedDate: js.Date
  
  var value: String
}
object WorkItemHistory {
  
  inline def apply(
    _links: Any,
    rev: Double,
    revisedBy: IdentityReference,
    revisedDate: js.Date,
    url: String,
    value: String
  ): WorkItemHistory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemHistory]
  }
  
  extension [Self <: WorkItemHistory](x: Self) {
    
    inline def setRev(value: Double): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    inline def setRevisedBy(value: IdentityReference): Self = StObject.set(x, "revisedBy", value.asInstanceOf[js.Any])
    
    inline def setRevisedDate(value: js.Date): Self = StObject.set(x, "revisedDate", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
