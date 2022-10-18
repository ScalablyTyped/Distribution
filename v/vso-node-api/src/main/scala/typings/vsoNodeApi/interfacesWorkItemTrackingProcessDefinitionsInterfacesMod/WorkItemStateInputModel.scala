package typings.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemStateInputModel extends StObject {
  
  /**
    * Color of the state
    */
  var color: String
  
  /**
    * Name of the state
    */
  var name: String
  
  /**
    * Order in which state should appear
    */
  var order: Double
  
  /**
    * Category of the state
    */
  var stateCategory: String
}
object WorkItemStateInputModel {
  
  inline def apply(color: String, name: String, order: Double, stateCategory: String): WorkItemStateInputModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], stateCategory = stateCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateInputModel]
  }
  
  extension [Self <: WorkItemStateInputModel](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setStateCategory(value: String): Self = StObject.set(x, "stateCategory", value.asInstanceOf[js.Any])
  }
}
