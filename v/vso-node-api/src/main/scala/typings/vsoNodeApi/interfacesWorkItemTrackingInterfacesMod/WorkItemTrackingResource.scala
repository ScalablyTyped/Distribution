package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTrackingResource
  extends StObject
     with WorkItemTrackingResourceReference {
  
  /**
    * Link references to related REST resources.
    */
  var _links: Any
}
object WorkItemTrackingResource {
  
  inline def apply(_links: Any, url: String): WorkItemTrackingResource = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTrackingResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemTrackingResource] (val x: Self) extends AnyVal {
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
