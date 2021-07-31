package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTrackingReference
  extends StObject
     with WorkItemTrackingResource {
  
  /**
    * The name.
    */
  var name: String
  
  /**
    * The reference name.
    */
  var referenceName: String
}
object WorkItemTrackingReference {
  
  @scala.inline
  def apply(_links: js.Any, name: String, referenceName: String, url: String): WorkItemTrackingReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTrackingReference]
  }
  
  @scala.inline
  implicit class WorkItemTrackingReferenceMutableBuilder[Self <: WorkItemTrackingReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
  }
}
