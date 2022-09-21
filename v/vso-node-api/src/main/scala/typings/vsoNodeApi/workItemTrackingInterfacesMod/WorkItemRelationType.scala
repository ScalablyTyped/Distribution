package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemRelationType
  extends StObject
     with WorkItemTrackingReference {
  
  /**
    * The collection of relation type attributes.
    */
  var attributes: StringDictionary[Any]
}
object WorkItemRelationType {
  
  inline def apply(_links: Any, attributes: StringDictionary[Any], name: String, referenceName: String, url: String): WorkItemRelationType = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemRelationType]
  }
  
  extension [Self <: WorkItemRelationType](x: Self) {
    
    inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
