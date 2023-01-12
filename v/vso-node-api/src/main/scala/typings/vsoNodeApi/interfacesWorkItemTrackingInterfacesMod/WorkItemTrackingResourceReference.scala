package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTrackingResourceReference extends StObject {
  
  var url: String
}
object WorkItemTrackingResourceReference {
  
  inline def apply(url: String): WorkItemTrackingResourceReference = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTrackingResourceReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemTrackingResourceReference] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
