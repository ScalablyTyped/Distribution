package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemIcon extends StObject {
  
  /**
    * The identifier of the icon.
    */
  var id: String
  
  /**
    * The REST URL of the resource.
    */
  var url: String
}
object WorkItemIcon {
  
  inline def apply(id: String, url: String): WorkItemIcon = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemIcon]
  }
  
  extension [Self <: WorkItemIcon](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
