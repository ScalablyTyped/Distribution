package typings.vsoNodeApi.workItemTrackingInterfacesMod

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
  
  @scala.inline
  def apply(name: String, referenceName: String, url: String): WorkItemFieldReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemFieldReference]
  }
  
  @scala.inline
  implicit class WorkItemFieldReferenceMutableBuilder[Self <: WorkItemFieldReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
