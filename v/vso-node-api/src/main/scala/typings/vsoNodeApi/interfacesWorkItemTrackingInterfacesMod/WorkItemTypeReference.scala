package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeReference
  extends StObject
     with WorkItemTrackingResourceReference {
  
  /**
    * Name of the work item type.
    */
  var name: String
}
object WorkItemTypeReference {
  
  inline def apply(name: String, url: String): WorkItemTypeReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeReference]
  }
  
  extension [Self <: WorkItemTypeReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
