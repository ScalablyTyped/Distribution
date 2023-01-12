package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemComment
  extends StObject
     with WorkItemTrackingResource {
  
  var revisedBy: IdentityReference
  
  var revisedDate: js.Date
  
  var revision: Double
  
  var text: String
}
object WorkItemComment {
  
  inline def apply(
    _links: Any,
    revisedBy: IdentityReference,
    revisedDate: js.Date,
    revision: Double,
    text: String,
    url: String
  ): WorkItemComment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemComment] (val x: Self) extends AnyVal {
    
    inline def setRevisedBy(value: IdentityReference): Self = StObject.set(x, "revisedBy", value.asInstanceOf[js.Any])
    
    inline def setRevisedDate(value: js.Date): Self = StObject.set(x, "revisedDate", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
