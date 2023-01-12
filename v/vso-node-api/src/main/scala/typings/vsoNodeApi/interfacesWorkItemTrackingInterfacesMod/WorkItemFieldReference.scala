package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemFieldReference extends StObject {
  
  /**
    * The name of the field.
    */
  var name: String
  
  /**
    * The reference name of the field.
    */
  var referenceName: String
  
  /**
    * The REST URL of the resource.
    */
  var url: String
}
object WorkItemFieldReference {
  
  inline def apply(name: String, referenceName: String, url: String): WorkItemFieldReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemFieldReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemFieldReference] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
