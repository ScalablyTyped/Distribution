package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemHistory
  extends StObject
     with WorkItemTrackingResource {
  
  var rev: Double
  
  var revisedBy: IdentityReference
  
  var revisedDate: Date
  
  var value: String
}
object WorkItemHistory {
  
  @scala.inline
  def apply(
    _links: js.Any,
    rev: Double,
    revisedBy: IdentityReference,
    revisedDate: Date,
    url: String,
    value: String
  ): WorkItemHistory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemHistory]
  }
  
  @scala.inline
  implicit class WorkItemHistoryMutableBuilder[Self <: WorkItemHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRev(value: Double): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisedBy(value: IdentityReference): Self = StObject.set(x, "revisedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisedDate(value: Date): Self = StObject.set(x, "revisedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
