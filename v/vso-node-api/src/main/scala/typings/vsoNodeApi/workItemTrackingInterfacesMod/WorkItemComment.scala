package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemComment extends WorkItemTrackingResource {
  
  var revisedBy: IdentityReference = js.native
  
  var revisedDate: Date = js.native
  
  var revision: Double = js.native
  
  var text: String = js.native
}
object WorkItemComment {
  
  @scala.inline
  def apply(
    _links: js.Any,
    revisedBy: IdentityReference,
    revisedDate: Date,
    revision: Double,
    text: String,
    url: String
  ): WorkItemComment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemComment]
  }
  
  @scala.inline
  implicit class WorkItemCommentMutableBuilder[Self <: WorkItemComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevisedBy(value: IdentityReference): Self = StObject.set(x, "revisedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisedDate(value: Date): Self = StObject.set(x, "revisedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
