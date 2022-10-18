package typings.vsoNodeApi.interfacesWorkInterfacesMod

import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryConfiguration extends StObject {
  
  /**
    * Name
    */
  var name: String
  
  /**
    * Category Reference Name
    */
  var referenceName: String
  
  /**
    * Work item types for the backlog category
    */
  var workItemTypes: js.Array[WorkItemTypeReference]
}
object CategoryConfiguration {
  
  inline def apply(name: String, referenceName: String, workItemTypes: js.Array[WorkItemTypeReference]): CategoryConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryConfiguration]
  }
  
  extension [Self <: CategoryConfiguration](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypes(value: js.Array[WorkItemTypeReference]): Self = StObject.set(x, "workItemTypes", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypesVarargs(value: WorkItemTypeReference*): Self = StObject.set(x, "workItemTypes", js.Array(value*))
  }
}
